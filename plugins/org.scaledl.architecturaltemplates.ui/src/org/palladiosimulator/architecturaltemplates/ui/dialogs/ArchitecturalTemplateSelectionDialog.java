package org.palladiosimulator.architecturaltemplates.ui.dialogs;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.modelversioning.emfprofile.Profile;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.provider.TypeItemProviderAdapterFactory;

/**
 * A dialog for selecting an Architectural Template ({@link AT}).
 * 
 * @author Max Schettler
 *
 */
public class ArchitecturalTemplateSelectionDialog extends
		ElementListSelectionDialog {

	private static final String EMPTY_LIST_MESSAGE = "There are no registered Architectural Templates";
	private static final String EMPTY_SELECTION_MESSAGE = "You need to select an Architectural Template";
	private static final String TITLE = "Select an Architectural Template";

	public ArchitecturalTemplateSelectionDialog(Shell parent) {
		super(parent, new AdapterFactoryLabelProvider(new TypeItemProviderAdapterFactory()));
		
		setValidator(new ISelectionStatusValidator() {
			
			@Override
			public IStatus validate(Object[] selection) {
				return selection.length == 1 ? Status.OK_STATUS : Status.CANCEL_STATUS;
			}
		});
		
		setTitle(TITLE);
		setEmptySelectionMessage(EMPTY_SELECTION_MESSAGE);
		setEmptyListMessage(EMPTY_LIST_MESSAGE);
	}

	/**
	 * {@inheritDoc}
	 * @throws IllegalArgumentException if not all elements are of the type {@link Profile}
	 */
	@Override
	public void setElements(Object[] elements) {
		for (Object o : elements)
		{
			if (!(o instanceof AT))
			{
				throw new IllegalArgumentException("All elements must be of type \"AT\"");
			}
		}

		super.setElements(elements);
	}
	
	public AT getResultArchitecturalTemplate() {
		return (AT) getResult()[0];
	}

	

}
