/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PCM Template Completion
 * Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.PCMTemplateCompletionParameterImpl#getTemplateFileURI <em>Template File URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMTemplateCompletionParameterImpl extends PCMCompletionParameterImpl
		implements PCMTemplateCompletionParameter {

	/**
	 * The default value of the '{@link #getTemplateFileURI() <em>Template File URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTemplateFileURI()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_FILE_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMTemplateCompletionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturaltemplatesPackage.Literals.PCM_TEMPLATE_COMPLETION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateFileURI() {
		return (String) eDynamicGet(ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI,
				ArchitecturaltemplatesPackage.Literals.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI, true,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateFileURI(String newTemplateFileURI) {
		eDynamicSet(ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI,
				ArchitecturaltemplatesPackage.Literals.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI,
				newTemplateFileURI);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
			return getTemplateFileURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
			setTemplateFileURI((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
			setTemplateFileURI(TEMPLATE_FILE_URI_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
			return TEMPLATE_FILE_URI_EDEFAULT == null ? getTemplateFileURI() != null
					: !TEMPLATE_FILE_URI_EDEFAULT.equals(getTemplateFileURI());
		}
		return super.eIsSet(featureID);
	}

} // PCMTemplateCompletionParameterImpl
