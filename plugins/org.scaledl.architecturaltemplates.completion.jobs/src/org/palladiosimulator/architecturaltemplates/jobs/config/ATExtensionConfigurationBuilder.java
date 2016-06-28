package org.palladiosimulator.architecturaltemplates.jobs.config;

import java.util.Map;

import de.uka.ipd.sdq.workflow.extension.AbstractExtensionJobConfiguration;
import de.uka.ipd.sdq.workflow.extension.AbstractWorkflowExtensionConfigurationBuilder;

/**
 * This class provides functionality to configure Architectural Template-enabled runs.
 * 
 * @author Sebastian Lehrig
 */
public class ATExtensionConfigurationBuilder extends AbstractWorkflowExtensionConfigurationBuilder {

    @Override
    public final AbstractExtensionJobConfiguration buildConfiguration(final Map<String, Object> attributes) {
        final ATExtensionJobConfiguration configuration = new ATExtensionJobConfiguration();

        if (attributes.containsKey(ATExtensionTab.STORE_COMPLETED_MODELS)) {
            final Boolean storeCompletedModels = (Boolean) attributes.get(ATExtensionTab.STORE_COMPLETED_MODELS);
            configuration.setStoreCompletedModels(storeCompletedModels);
        } else {
            configuration.setStoreReconfiguredModels(ATExtensionTab.DEFAULT_STORE_COMPLETED_MODELS);
        }

        if (attributes.containsKey(ATExtensionTab.MODEL_STORAGE_LOCATION)) {
            final String modelStorageLocation = (String) attributes.get(ATExtensionTab.MODEL_STORAGE_LOCATION);
            configuration.setModelStorageLocation(modelStorageLocation);
        } else {
            configuration.setModelStorageLocation(ATExtensionTab.DEFAULT_MODEL_STORAGE_LOCATION);
        }

        return configuration;
    }

}
