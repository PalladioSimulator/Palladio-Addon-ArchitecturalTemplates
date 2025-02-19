package org.palladiosimulator.architecturaltemplates.jobs;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.jobs.CreatePluginProjectJob;
import org.palladiosimulator.architecturaltemplates.jobs.config.ATExtensionJobConfiguration;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants.Partition;
import org.palladiosimulator.commons.emfutils.EMFCopyHelper;

import de.uka.ipd.sdq.codegen.simucontroller.core.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.SavePartitionToDiskJob;

/**
 * Copies all resources of the partitions defined in the PARTITION_IDS constant to a given model
 * storage location. The latter is a property of this jobs' configuration.
 * 
 * @author Sebastian Lehrig
 */
public class StoreCompletedModelsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private final static String MODEL_GEN_FOLDER_NAME = "model-gen";
    private final static String AT_COPY_PARTITION = "AT_COPY";
    private final static AbstractPCMWorkflowRunConfiguration PLUGIN_CONFIGURATION = new SimuComWorkflowConfiguration(
            Collections.<String, Object> emptyMap());

    static {
        PLUGIN_CONFIGURATION.setDeleteTemporaryDataAfterAnalysis(false);
        PLUGIN_CONFIGURATION.setOverwriteWithoutAsking(true);
    }

    private final ATExtensionJobConfiguration configuration;
    private final String folderName;

    /**
     * Default constructor. Adds an inner job for creating the project for model storage.
     * 
     * @param configuration
     *            the configuration object, including the storage project location for copied
     *            resources
     * @param folderName
     *            name for folder after the MODEL_GEN_FOLDER_NAME folder, e.g.,
     *            "model-gen/completion/".
     * @param createNewStorageFolder
     *            <code>true</code> if an existing storage folder should be deleted and a new one
     *            should be created, <code>false</code> if an existing folder should be reused.
     */
    public StoreCompletedModelsJob(final ATExtensionJobConfiguration configuration, final String folderName,
            final boolean createNewStorageFolder) {
        super(false);
        this.configuration = configuration;
        this.folderName = folderName;

        if (createNewStorageFolder) {
            PLUGIN_CONFIGURATION.setStoragePluginID(configuration.getModelStorageLocation());
            this.add(new CreatePluginProjectJob(PLUGIN_CONFIGURATION));
        }
    }

    /**
     * For each partition of PARTITION_IDS, copies resources to a dedicated a temporary partition
     * for storage and stores all resources to disk. Note that the copy operation is needed for
     * setting up new URIs for resources to be saved.
     * 
     * @param monitor
     *            for monitoring the progress of copy and storage.
     */
    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        super.execute(monitor);

        final URI storageURI = URI.createPlatformResourceURI(this.configuration.getModelStorageLocation(), false);
        for (final Partition partition : ATPartitionConstants.Partition.values()) {
            this.getBlackboard().addPartition(AT_COPY_PARTITION, copyPartition(partition, storageURI));
            storePartition(monitor, AT_COPY_PARTITION);
            this.getBlackboard().removePartition(AT_COPY_PARTITION);
        }
    }

    /**
     * Copies all resources of a given partition to the given storage URI. Ensures that all model
     * links point to corresponding copies.
     * 
     * The copy-traversal sadly removes the resource information of EObjects, most important the
     * resource URI. However, we want to use the last segment of the resource URI to determine the
     * filename of the resource to be stored. The current implementation therefore re-traverses the
     * original resources to assign the copied ones this filename.
     * 
     * TODO The above described solution is not nice. We may provide an improved copy method.
     * 
     * @param partition
     *            the partition from with resources shall be copied
     * @param storageURI
     *            the URI where the copied resources shall be stored
     * @return a copy of the given partition
     */
    private ResourceSetPartition copyPartition(final Partition partition, final URI storageURI) {
        final ResourceSetPartition partitionOriginal = this.getBlackboard().getPartition(partition.getPartitionId());
        final ResourceSetPartition partitionCopy = new ResourceSetPartition();
        final List<EObject> elementsCopy = EMFCopyHelper.deepCopyToEObjectList(partitionOriginal.getResourceSet());

        // re-traverse
        int elementCounter = 0;
        for (final Resource r : partitionOriginal.getResourceSet().getResources()) {
            final URI targetURI = storageURI.appendSegment(MODEL_GEN_FOLDER_NAME).appendSegment(this.folderName)
                    .appendSegment(partition.getName()).appendSegment(r.getURI().lastSegment());
            final Resource resourceCopy = partitionCopy.getResourceSet().createResource(targetURI);

            for (int i = 0; i < r.getContents().size(); i++) {
                resourceCopy.getContents().add(elementsCopy.get(elementCounter));
                elementCounter++;
            }
        }

        return partitionCopy;
    }

    /**
     * Stores the given partition to disk.
     * 
     * @param monitor
     *            for monitoring the progress of storage.
     * @param partitionID
     *            the partition to be stored to disk.
     * @throws JobFailedException
     *             the job failed, e.g., due to a disk write error.
     * @throws UserCanceledException
     *             the user has chosen to abort.
     */
    private void storePartition(final IProgressMonitor monitor, final String partitionID)
            throws JobFailedException, UserCanceledException {
        final SavePartitionToDiskJob savePartitionJob = new SavePartitionToDiskJob(partitionID);
        savePartitionJob.setBlackboard(this.getBlackboard());
        savePartitionJob.execute(monitor);
    }

}
