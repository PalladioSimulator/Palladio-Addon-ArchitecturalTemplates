package org.palladiosimulator.architecturaltemplates.jobs.config;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.api.ArchitecturalTemplateAPI;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants;
import org.palladiosimulator.simulizar.launcher.IConfigurator;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;
import org.palladiosimulator.simulizar.utils.FileUtil;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimuLizarConfigurator implements IConfigurator {

    public SimuLizarConfigurator() {
    }

    @Override
    public void configure(final SimuLizarWorkflowConfiguration configuration, final MDSDBlackboard blackboard) {
        copyReconfigurations(blackboard);
        String fol = "platform:/plugin" + "/masterthesis.catalog" + "/templates/ReconfigurationRules";
        configuration.setReconfigurationRulesFolder(fol);
    }

	private void copyReconfigurations(final MDSDBlackboard blackboard) {
		for (final AT architecturalTemplate : getATsFromSystem(blackboard)) {
            if (architecturalTemplate.getReconfigurationRuleFolder() != null) {
                final String x = architecturalTemplate.getReconfigurationRuleFolder().getFolderURI();
                final URI[] uris = FileUtil.getQvtoFiles(x);
                for(URI uri : uris) {
                	String[] y = uri.toString().split("/");
                    Bundle bundle = Platform.getBundle( y[2] );
                    InputStream stream = null;
                	String d = uri.lastSegment();
                	String p = "";
                	for(int i = 3; i < y.length; i++) {
                		p = p.concat("/");
                		p = p.concat(y[i]);
                	}
                	String[] other = bundle.getLocation().split("/");
                	String p2 = "";
                	for(int i = 1; i < other.length; i++) {
                		p2 = p2.concat("/");
                		p2 = p2.concat(other[i]);
                	}
                	try {
    					stream = FileLocator.openStream( bundle, new Path(p), false );
    					File newfile = new File(p2 + "/templates/ReconfigurationRules/" + d);
    					FileOutputStream out = new FileOutputStream(newfile);
    					IOUtils.copy(stream,out);
    					stream.close();
    					out.close();
    					
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
                }
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
