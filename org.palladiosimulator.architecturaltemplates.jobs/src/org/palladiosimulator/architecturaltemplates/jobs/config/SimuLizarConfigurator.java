package org.palladiosimulator.architecturaltemplates.jobs.config;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ReconfigurationRulesConstants;
import org.palladiosimulator.architecturaltemplates.jobs.util.ATJobUtil;
import org.palladiosimulator.simulizar.launcher.IConfigurator;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;
import org.palladiosimulator.simulizar.utils.FileUtil;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimuLizarConfigurator implements IConfigurator {
	
    public SimuLizarConfigurator() {
    }

    @Override
    public void configure(final SimuLizarWorkflowConfiguration configuration, final MDSDBlackboard blackboard) {
        String folder = ReconfigurationRulesConstants.RECONFIGURATIONRULES_LOCATION;
        copyReconfigurations(blackboard, folder);
        configuration.setReconfigurationRulesFolder(folder);
    }

	private void copyReconfigurations(final MDSDBlackboard blackboard, String folder) {
		for (final AT architecturalTemplate : ATJobUtil.getAllATs(blackboard)) {
            if (architecturalTemplate.getReconfigurationRuleFolder() != null) {
                final String x = architecturalTemplate.getReconfigurationRuleFolder().getFolderURI();
                final URI[] uris = FileUtil.getQvtoFiles(x);
                for(URI uri : uris) {
                	String name = uri.lastSegment();
                	File source = null;
                	try {
                		String sourcePath = FileLocator.resolve(new URL(uri.toString())).getPath();
                		source = new File(sourcePath);
    					File newfile = new File(FileLocator.resolve(new URL(folder)).getPath() + "/" + name);
    					FileUtils.copyFile(source, newfile);
    					
    				} catch (IOException e) {
    					e.printStackTrace();
    				}
                }
            }
        }
	}
}
