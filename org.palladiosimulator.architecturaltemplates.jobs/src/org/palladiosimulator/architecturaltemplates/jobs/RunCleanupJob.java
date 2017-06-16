package org.palladiosimulator.architecturaltemplates.jobs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.palladiosimulator.analyzer.workflow.configurations.AbstractPCMWorkflowRunConfiguration;
import org.palladiosimulator.analyzer.workflow.jobs.CreatePluginProjectJob;
import org.palladiosimulator.architecturaltemplates.jobs.config.ATExtensionJobConfiguration;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

public class RunCleanupJob extends SequentialJob {

	private final static AbstractPCMWorkflowRunConfiguration PLUGIN_CONFIGURATION = new SimuComWorkflowConfiguration(
            Collections.<String, Object> emptyMap());
    private ATExtensionJobConfiguration configuration;
    
    public RunCleanupJob(ATExtensionJobConfiguration configuration) {
		this.configuration = configuration;
	}
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
    	super.execute(monitor);
    	this.logger.info("Cleaning up Reconfiguration folder...");
    	URI reconfigFolderURI = URI.createPlatformPluginURI(configuration.getReconfigurationRulesLocation(),false);
    	String[] segments = reconfigFolderURI.toString().split("/");
        Bundle ATBundle = Platform.getBundle( segments[2] );
        String[] bundleLoc = ATBundle.getLocation().split("/");
    	String tempReconfigurationFolder = "";
    	for(int i = 1; i < bundleLoc.length; i++) {
    		tempReconfigurationFolder = tempReconfigurationFolder.concat("/");
    		tempReconfigurationFolder = tempReconfigurationFolder.concat(bundleLoc[i]);
    	}
    	tempReconfigurationFolder = tempReconfigurationFolder.concat("/");
    	tempReconfigurationFolder = tempReconfigurationFolder.concat(reconfigFolderURI.lastSegment());
    	
    	File outputFolder = new File(tempReconfigurationFolder);
    	
    	
    	
    	
//        URI pathToReconfigurations = URI.createPlatformPluginURI(configuration.getReconfigurationRulesLocation(),false);
//        URI pathToPlugin = pathToReconfigurations.trimSegments(1);
//        File outputFolder = new File("platform:/plugin/" + configuration.getReconfigurationRulesLocation());
//        String folderString = "";
//        try {
//            final URL pathURL = FileLocator.resolve(new URL(pathToPlugin.toString()));
//            folderString = pathURL.toExternalForm().replace("file:", "");
//            outputFolder = new File(folderString + pathToReconfigurations.lastSegment());
//        } catch (final IOException e) {
//            return;
//        }
    	if(outputFolder.exists()) {
    	final File[] files = outputFolder.listFiles();
    		if (files != null) {
    			for (File file : files) {
    				file.delete();
    			}
    		}
    	}
    	else {
    		outputFolder.mkdirs();
    	}

    }
}