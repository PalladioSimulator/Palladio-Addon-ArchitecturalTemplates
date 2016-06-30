/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PCM Output Completion Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The output of a completion is a PCM model, characterized by its typical
 * file extension. A user can select from available PCM extensions. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMOutputCompletionParameter()
 * @model
 * @generated
 */
public interface PCMOutputCompletionParameter extends CompletionParameter {

    /**
     * Returns the value of the '<em><b>File Extension</b></em>' attribute. The literals are from
     * the enumeration {@link org.palladiosimulator.architecturaltemplates.PCMFileExtensions}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Extension</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>File Extension</em>' attribute.
     * @see org.palladiosimulator.architecturaltemplates.PCMFileExtensions
     * @see #setFileExtension(PCMFileExtensions)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMOutputCompletionParameter_FileExtension()
     * @model required="true"
     * @generated
     */
    PCMFileExtensions getFileExtension();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter#getFileExtension
     * <em>File Extension</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>File Extension</em>' attribute.
     * @see org.palladiosimulator.architecturaltemplates.PCMFileExtensions
     * @see #getFileExtension()
     * @generated
     */
    void setFileExtension(PCMFileExtensions value);

} // PCMOutputCompletionParameter
