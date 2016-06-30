package org.palladiosimulator.architecturaltemplates.jobs.config;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.uka.ipd.sdq.workflow.launchconfig.ImageRegistryHelper;

/**
 * This class defines a tab with AT-specific configuration options.
 * 
 * @author Sebastian Lehrig
 */
public class ATExtensionTab extends AbstractLaunchConfigurationTab {

    /** The ID of this plug-in. */
    public static final String PLUGIN_ID = "org.palladiosimulator.architecturaltemplates.jobs";

    /** Name of configuration attribute for storing blackboard partition models after AT completion. */
    public static final String STORE_COMPLETED_MODELS = "org.palladiosimulator.architecturaltemplates.jobs.config.storeCompletedModels";

    /** Default configuration for storage of completed models. */
    public static final Boolean DEFAULT_STORE_COMPLETED_MODELS = true;

    /** Name of configuration attribute for the model storage location. */
    public static final String MODEL_STORAGE_LOCATION = "org.palladiosimulator.architecturaltemplates.jobs.config.modelStorageLocation";

    /** Default model storage location. */
    public static final String DEFAULT_MODEL_STORAGE_LOCATION = "org.palladiosimulator.architecturaltemplates.temporary";

    /** The path to the image file for the tab icon. */
    public static final String CONFIGURATION_TAB_IMAGE_PATH = "icons/ATLogo15x15.png";
    
    
    /** Button for control enabling storage of completed models. */
    private Button storeCompletedModelsButton;

    /** Text field for name of the plug-in project for storing data. */
    private Text storeLocationField;

    /** Label for the storing data plug-in project name field. */
    private Label storeLocationLabel;

    @Override
    public final void createControl(final Composite parent) {

        final SelectionListener selectionListener = new SelectionListener() {
            @Override
            public void widgetDefaultSelected(final SelectionEvent e) {
                updateATTab();
            }

            @Override
            public void widgetSelected(final SelectionEvent e) {
                setStorageLocationElementsEnabled(storeCompletedModelsButton.getSelection());

                if (storeCompletedModelsButton.getSelection()) {
                    storeLocationField.setText(DEFAULT_MODEL_STORAGE_LOCATION);
                }

                updateATTab();
            }
        };

        // Create the top-level container:
        Composite container = new Composite(parent, SWT.NONE);
        setControl(container);
        container.setLayout(new GridLayout());

        // Create model storage section:
        final GridData gdModelStorageGroup = new GridData(SWT.FILL, SWT.CENTER, true, false);
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 4;
        final Group modelStorageGroup = new Group(container, SWT.NONE);
        modelStorageGroup.setText("Model Storage");
        modelStorageGroup.setLayoutData(gdModelStorageGroup);
        modelStorageGroup.setLayout(gridLayout);

        storeCompletedModelsButton = initCheckButton(selectionListener, modelStorageGroup, "Store completed models");

        storeLocationLabel = new Label(modelStorageGroup, SWT.NONE);
        storeLocationLabel.setLayoutData(new GridData(48, SWT.DEFAULT));
        storeLocationLabel.setText("Location:");

        final GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gridData.widthHint = 20;
        storeLocationField = new Text(modelStorageGroup, SWT.BORDER);
        storeLocationField.setLayoutData(gridData);
        storeLocationField.setText(DEFAULT_MODEL_STORAGE_LOCATION);
        storeLocationField.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                updateATTab();
            }
        });
        
    }

    private void updateATTab() {
        ATExtensionTab.this.setDirty(true);
        ATExtensionTab.this.updateLaunchConfigurationDialog();
    }

    /**
     * Set the enable-state for the elements in the storage location section.
     * 
     * @param enable
     */
    private void setStorageLocationElementsEnabled(boolean enable) {
        storeLocationField.setEnabled(enable);
        storeLocationLabel.setEnabled(enable);
    }

    private Button initCheckButton(final SelectionListener selectionListener, final Group modelStorageGroup,
            final String buttonText) {
        final GridData gdStoreCompletedModelsButton = new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1);
        final Button button = new Button(modelStorageGroup, SWT.CHECK);

        button.setLayoutData(gdStoreCompletedModelsButton);
        button.setText(buttonText);
        button.addSelectionListener(selectionListener);

        return button;
    }
    
    
    @Override
    public final String getName() {
        return "Architectural Templates";
    }

    @Override
    public final void initializeFrom(final ILaunchConfiguration configuration) {
        try {
            storeCompletedModelsButton.setSelection(configuration.getAttribute(STORE_COMPLETED_MODELS,
                    DEFAULT_STORE_COMPLETED_MODELS));
            storeLocationField.setText(configuration.getAttribute(MODEL_STORAGE_LOCATION,
                    DEFAULT_MODEL_STORAGE_LOCATION));

            if (storeCompletedModelsButton.getSelection()) {
                setStorageLocationElementsEnabled(true);
            } else {
                setStorageLocationElementsEnabled(false);
            }
        } catch (CoreException e) {
            storeCompletedModelsButton.setSelection(DEFAULT_STORE_COMPLETED_MODELS);
            storeLocationField.setText(DEFAULT_MODEL_STORAGE_LOCATION);
        }
    }

    @Override
    public final void performApply(final ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(STORE_COMPLETED_MODELS, this.storeCompletedModelsButton.getSelection());
        configuration.setAttribute(MODEL_STORAGE_LOCATION, storeLocationField.getText());
    }

    @Override
    public final void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
        configuration.setAttribute(STORE_COMPLETED_MODELS, DEFAULT_STORE_COMPLETED_MODELS);
        configuration.setAttribute(MODEL_STORAGE_LOCATION, DEFAULT_MODEL_STORAGE_LOCATION);
    }

    @Override
    public boolean isValid(ILaunchConfiguration launchConfig) {
        setErrorMessage(null);

        if (storeLocationField.getText().equals("")) {
            setErrorMessage("The location for model storage is missing.");
            return false;
        }
        return true;
    }

    @Override
    public Image getImage() {
        return ImageRegistryHelper.getTabImage(PLUGIN_ID, CONFIGURATION_TAB_IMAGE_PATH);
    }
}
