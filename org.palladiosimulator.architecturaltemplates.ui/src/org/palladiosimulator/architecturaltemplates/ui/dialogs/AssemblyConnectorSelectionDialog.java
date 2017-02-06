package org.palladiosimulator.architecturaltemplates.ui.dialogs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.architecturaltemplates.api.ArchitecturalTemplateAPI;
import org.palladiosimulator.commons.eclipseutils.FileHelper;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;

/**
 * A dialog for selecting an Assembly Connectors ({@link AssemblyConnector}).
 * 
 * @author Matthias Rombach
 *
 */
public class AssemblyConnectorSelectionDialog extends ElementListSelectionDialog {

    private static final String EMPTY_LIST_MESSAGE = "No assembly connector can be selected";
    private static final String TITLE = "Select assembly connector";
    private static final String EMPTY_SELECTION_MESSAGE = "You need to select an assembly connector to continue";

    public AssemblyConnectorSelectionDialog(final Shell parent) {
        super(parent, new LabelProvider() {

            private Image roleImage = null;

            @Override
            public String getText(final Object element) {
                return ((Connector) element).getEntityName();
            }

            @Override
            public Image getImage(final Object element) {
                if (this.roleImage == null) {
                    try {
                        this.roleImage = new Image(Display.getCurrent(), new FileInputStream(FileHelper.getFile(
                                "platform:plugin/org.palladiosimulator.architecturaltemplates.edit/icons/full/obj16/Role.gif")));
                    } catch (final FileNotFoundException e) {
                        e.printStackTrace(); // TODO proper error handling
                    }
                }
                return this.roleImage;
            }

            @Override
            public void dispose() {
                super.dispose();

                if (this.roleImage != null) {
                    this.roleImage.dispose();
                }
            }
        });
        
        setValidator(new ISelectionStatusValidator() {

            @Override
            public IStatus validate(final Object[] selection) {
                return selection.length == 1 ? Status.OK_STATUS : Status.CANCEL_STATUS;
            }
        });

        setTitle(TITLE);
        setEmptySelectionMessage(EMPTY_SELECTION_MESSAGE);
        setEmptyListMessage(EMPTY_LIST_MESSAGE);
    }

    /**
     * {@inheritDoc}
     * 
     * @throws IllegalArgumentException
     *             if not all elements are of the type {@link Stereotype} and define a {@link Role}
     *             s.
     * @see ArchitecturalTemplateAPI#isRole(Stereotype)
     */
    @Override
    public void setElements(final Object[] elements) {
        for (final Object o : elements) {
            if (!(o instanceof Connector)) {
                throw new IllegalArgumentException("All elements must be of type \"Connector\"");
            }
        }
        super.setElements(elements);
    }

    /**
     * Returns the selected {@link Stereotype}.
     * 
     * @return the connector
     */
    public Connector getResultConnector() {
        return (Connector) getResult()[0];
    }

}