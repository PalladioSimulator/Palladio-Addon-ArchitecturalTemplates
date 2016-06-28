package org.palladiosimulator.architecturaltemplates.jobs;

import org.palladiosimulator.architecturaltemplates.jobs.config.ATExtensionJobConfiguration;

import de.uka.ipd.sdq.workflow.extension.AbstractExtensionJobConfiguration;
import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Conducts a complete AT Job:
 * 
 * 1) Validate blackboard models according to AT constraints.
 * 
 * 2) For debug and if enabled in the ATExtensionJobConfiguration: Store the models before the
 * completion into a new, temporary Palladio project.
 * 
 * 3) Run the AT completion that transforms the source models into models enriched with information
 * derivable from the given AT. Results are stored on the blackboard.
 * 
 * 4) For debug and if enabled in the ATExtensionJobConfiguration: Store the resulting models into a
 * new, temporary Palladio project.
 * 
 * @author Sebastian Lehrig
 */
public class RunATJob extends AbstractWorkflowExtensionJob<MDSDBlackboard> {

    private static final String BEFORE_COMPLETION = "beforeCompletion";
    private static final String AFTER_COMPLETION = "afterCompletion";

    /**
     * Cannot add jobs earlier as extension jobs get configured after instantiation.
     */
    @Override
    public void setJobConfiguration(final AbstractExtensionJobConfiguration jobConfiguration) {
        super.setJobConfiguration(jobConfiguration);
        final ATExtensionJobConfiguration configuration = (ATExtensionJobConfiguration) jobConfiguration;

        this.addJob(new PrepareIsolatedBlackboardPartitionJob(configuration));
        this.addJob(new ValidateModelsJob(configuration));

        if (configuration.isStoreCompletedModels()) {
            this.addJob(new StoreCompletedModelsJob(configuration, BEFORE_COMPLETION, true));
        }

        this.addJob(new RunATCompletionJob(configuration));

        if (configuration.isStoreCompletedModels()) {
            this.addJob(new StoreCompletedModelsJob(configuration, AFTER_COMPLETION, false));
        }
    }

}
