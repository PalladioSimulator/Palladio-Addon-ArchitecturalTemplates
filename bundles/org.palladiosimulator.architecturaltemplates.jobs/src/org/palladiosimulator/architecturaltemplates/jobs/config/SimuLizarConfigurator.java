package org.palladiosimulator.architecturaltemplates.jobs.config;

import java.util.Collection;

import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.api.ArchitecturalTemplateAPI;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants;
import org.palladiosimulator.simulizar.launcher.IConfigurator;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimuLizarConfigurator implements IConfigurator {

    public SimuLizarConfigurator() {
    }

    @Override
    public void configure(final SimuLizarWorkflowConfiguration configuration, final MDSDBlackboard blackboard) {
        for (final AT architecturalTemplate : getATsFromSystem(blackboard)) {
            // FIXME only 1 Reconfiguration folder is set at the moment [Lehrig]
            // Solution a) extend SimuLizar to allow multiple folders
            // Solution b) copy all reconfigurations to a dedicated folder
            if (architecturalTemplate.getReconfigurationRuleFolder() != null) {
                configuration.setReconfigurationRulesFolder(
                        architecturalTemplate.getReconfigurationRuleFolder().getFolderURI());
                return;
            }
        }
    }

    /**
     * Receives the architectural templates attached to a system. Such an attachment is realized via
     * an annotation to an profile with an AT annotation. The annotation references the AT the role;
     * the role is identified by matching the stereotype name to the roles of the AT. If no such
     * role can be found, an empty <code>List</code> is returned.
     * 
     * @return the architectural template applied to this system; an empty <code>List</code> if no
     *         such template can be found.
     */
    private Collection<AT> getATsFromSystem(final MDSDBlackboard blackboard) {
        final PCMResourceSetPartition pcmRepositoryPartition = (PCMResourceSetPartition) blackboard
                .getPartition(ATPartitionConstants.Partition.PCM.getPartitionId());

        org.palladiosimulator.pcm.system.System system = null;
        try {
            system = pcmRepositoryPartition.getSystem();
        } catch (final IndexOutOfBoundsException e) {
        }

        return ArchitecturalTemplateAPI.getATsFromSystem(system);
    }
}
