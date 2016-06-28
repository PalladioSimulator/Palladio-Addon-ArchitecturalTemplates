package org.palladiosimulator.architecturaltemplates.jobs.config;

import org.palladiosimulator.architecturaltemplates.AT;

import de.uka.ipd.sdq.workflow.extension.AbstractExtensionJobConfiguration;

/**
 * Configurations specific to architectural templates.
 * 
 * @author Sebastian Lehrig
 */
public class ATExtensionJobConfiguration extends AbstractExtensionJobConfiguration {

    private AT architecturalTemplate;

    private boolean storeCompletedModels;

    private boolean storeReconfiguredModels;

    private String modelStorageLocation;

    @Override
    public String getErrorMessage() {
        // must be null; otherwise a non-empty error message will result in
        // a workflow config being considered invalid
        return null;
    }

    @Override
    public void setDefaults() {
        throw new RuntimeException("Not implemented. No defaults defined.");
    }

    public void setArchitecturalTemplate(final AT architecturalTemplate) {
        this.architecturalTemplate = architecturalTemplate;
    }

    public AT getArchitecturalTemplate() {
        return this.architecturalTemplate;
    }

    public boolean isStoreCompletedModels() {
        return storeCompletedModels;
    }

    public void setStoreCompletedModels(boolean storeCompletedModels) {
        this.storeCompletedModels = storeCompletedModels;
    }

    public boolean isStoreReconfiguredModels() {
        return storeReconfiguredModels;
    }

    public void setStoreReconfiguredModels(boolean storeReconfiguredModels) {
        this.storeReconfiguredModels = storeReconfiguredModels;
    }

    public String getModelStorageLocation() {
        return modelStorageLocation;
    }

    public void setModelStorageLocation(String modelStorageLocation) {
        this.modelStorageLocation = modelStorageLocation;
    }

}
