package org.palladiosimulator.architecturaltemplates.jobs;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.core.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.architecturaltemplates.jobs.config.ATExtensionJobConfiguration;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Creates and fills the Template model partition for template-based completions.
 * 
 * @author Sebastian Lehrig
 */
public class PrepareIsolatedBlackboardPartitionJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    private static final Logger LOGGER = Logger.getLogger(PrepareIsolatedBlackboardPartitionJob.class);

    public PrepareIsolatedBlackboardPartitionJob(final ATExtensionJobConfiguration configuration) {
        super(false);
    }

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        super.execute(monitor);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Creating Template Model Partition");
        }
        final PCMResourceSetPartition templatePartition = new PCMResourceSetPartition();
        this.getBlackboard().addPartition(ATPartitionConstants.Partition.ISOLATED_TEMPLATE.getPartitionId(), templatePartition);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Initializing PCM EPackages");
        }
        templatePartition.initialiseResourceSetEPackages(AbstractPCMWorkflowRunConfiguration.PCM_EPACKAGES);
    }

    @Override
    public String getName() {
        return "Prepare Template Blackboard Partitions";
    }
}
