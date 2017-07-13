package org.palladiosimulator.architecturaltemplates.jobs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.palladiosimulator.architecturaltemplates.jobs.config.ATExtensionJobConfiguration;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;

public class RunCleanupJob extends SequentialJob {

    private final ATExtensionJobConfiguration configuration;
    
    public RunCleanupJob(ATExtensionJobConfiguration configuration) {
		this.configuration = configuration;
	}
    
    @Override
    public void execute(IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
    	super.execute(monitor);
    	this.logger.info("Cleaning up Reconfiguration folder...");
    	File outputFolder = null;
		try {
			outputFolder = new File(FileLocator.resolve(new URL(configuration.getReconfigurationRulesLocation())).getPath());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
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