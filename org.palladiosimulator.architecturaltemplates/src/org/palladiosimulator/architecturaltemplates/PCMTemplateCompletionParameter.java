/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCM Template Completion
 * Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The input of a completion is a PCM model from a template and available
 * via the MDSD blackboard within the PCM partition. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter#getTemplateFileURI
 * <em>Template File URI</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMTemplateCompletionParameter()
 * @model
 * @generated
 */
public interface PCMTemplateCompletionParameter extends PCMCompletionParameter {

    /**
     * Returns the value of the '<em><b>Template File URI</b></em>' attribute. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Template File URI</em>' attribute isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Template File URI</em>' attribute.
     * @see #setTemplateFileURI(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMTemplateCompletionParameter_TemplateFileURI()
     * @model required="true"
     * @generated
     */
    String getTemplateFileURI();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter#getTemplateFileURI
     * <em>Template File URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Template File URI</em>' attribute.
     * @see #getTemplateFileURI()
     * @generated
     */
    void setTemplateFileURI(String value);
} // PCMTemplateCompletionParameter
