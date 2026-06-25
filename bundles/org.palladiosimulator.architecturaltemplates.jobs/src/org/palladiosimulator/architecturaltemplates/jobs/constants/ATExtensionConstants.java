package org.palladiosimulator.architecturaltemplates.jobs.constants;

/**
 * Shared constants for the Architectural Templates extension.
 * 
 * Used by both the headless configuration builder and the UI launch configuration tab to ensure
 * consistent attribute keys and default values when storing reconfiguration result models.
 */
public final class ATExtensionConstants {

    /**
     * Attribute key for the launch configuration to enable persisting the blackboard partition
     * models after AT job completion (e.g., for debugging or inspection).
     */
    public static final String STORE_COMPLETED_MODELS = "org.palladiosimulator.architecturaltemplates.jobs.config.storeCompletedModels";

    /**
     * Default: reconfiguration result models are stored after completion.
     */
    public static final Boolean DEFAULT_STORE_COMPLETED_MODELS = true;

    /**
     * Attribute key for the launch configuration that specifies where to persist the completed
     * models (e.g., a temporary project or folder).
     */
    public static final String MODEL_STORAGE_LOCATION = "org.palladiosimulator.architecturaltemplates.jobs.config.modelStorageLocation";

    /**
     * Default storage location for completed models.
     */
    public static final String DEFAULT_MODEL_STORAGE_LOCATION = "org.palladiosimulator.architecturaltemplates.temporary";

    private ATExtensionConstants() {
    }

}
