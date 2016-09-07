/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>QVTO Completion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A completion realized as QVT Operational transformation <!--
 * end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.QVTOCompletion#getQvtoFileURI <em>Qvto
 * File URI</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getQVTOCompletion()
 * @model
 * @generated
 */
public interface QVTOCompletion extends Completion {

    /**
     * Returns the value of the '<em><b>Qvto File URI</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Qvto File URI</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Qvto File URI</em>' attribute.
     * @see #setQvtoFileURI(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getQVTOCompletion_QvtoFileURI()
     * @model required="true"
     * @generated
     */
    String getQvtoFileURI();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.QVTOCompletion#getQvtoFileURI <em>Qvto
     * File URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Qvto File URI</em>' attribute.
     * @see #getQvtoFileURI()
     * @generated
     */
    void setQvtoFileURI(String value);

} // QVTOCompletion
