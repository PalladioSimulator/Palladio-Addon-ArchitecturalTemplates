package org.palladiosimulator.architecturaltemplates.jobs.constants;

import java.util.HashSet;
import java.util.Set;

import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.experimentautomation.application.jobs.LoadModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadSimuLizarModelsIntoBlackboardJob;

public final class ATPartitionConstants {

    public static final String SDM_MODEL_PARTITION_ID = "org.palladiosimulator.simulizar.reconfiguration.sdm";
	
    public static Set<String> PCM_FILES = new HashSet<String>() {

        private static final long serialVersionUID = 6737375727319070884L;

        {
            add("repository");
            add("system");
            add("resourceenvironment");
            add("allocation");
            add("usagemodel");
            add("resourcetype");
            add("pcmmeasuringpoint");
            add("measuringpoint");
            add("emfprofile_diagram");
            add("xmi");
            add("usageevolution");
            add("dlim");
            add("monitorrepository");
            add("slo");
            add("experiments");
        }
    };

    /**
     * ID of the blackboard partition containing the fully loaded PCM instance. The blackboard
     * partition is ensured to be of type {@link PCMResourceSetPartition}
     */
    public static final String PCM_MODELS_PARTITION_ID = "org.palladiosimulator.pcmmodels.partition";

    @SuppressWarnings("serial")
    public enum Partition {

        ISOLATED_TEMPLATE("Isolated Template", "org.palladiosimulator.architecturaltemplates.jobs.partition", PCM_FILES),

        PCM("PCM", LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID, PCM_FILES),

        ORIGINAL_PCM("Original PCM", LoadModelsIntoBlackboardJob.PCM_MODELS_ORIGINAL_PARTITION_ID, PCM_FILES),

        ANALYZED_PCM("Analyzed PCM", LoadSimuLizarModelsIntoBlackboardJob.PCM_MODELS_ANALYZED_PARTITION_ID, PCM_FILES);

        private final String name;
        private final String partitionId;
        private final Set<String> fileNames;

        private Partition(final String name, final String partitionId, final Set<String> fileNames) {
            this.name = name;
            this.partitionId = partitionId;
            this.fileNames = fileNames;
        }

        public String getName() {
            return this.name;
        }

        public String getPartitionId() {
            return this.partitionId;
        }

        public Set<String> getFileNames() {
            return this.fileNames;
        }
    }

}
