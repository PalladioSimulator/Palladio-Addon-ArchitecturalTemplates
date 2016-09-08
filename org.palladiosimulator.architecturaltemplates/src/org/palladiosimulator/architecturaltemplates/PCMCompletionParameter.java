/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCM Completion
 * Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.PCMCompletionParameter#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMCompletionParameter()
 * @model abstract="true"
 * @generated
 */
public interface PCMCompletionParameter extends CompletionParameter {

    /**
     * Returns the value of the '<em><b>File Extension</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Extension</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>File Extension</em>' containment reference.
     * @see #setFileExtension(FileExtension)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMCompletionParameter_FileExtension()
     * @model containment="true" required="true"
     * @generated
     */
    FileExtension getFileExtension();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.PCMCompletionParameter#getFileExtension
     * <em>File Extension</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>File Extension</em>' containment reference.
     * @see #getFileExtension()
     * @generated
     */
    void setFileExtension(FileExtension value);

} // PCMCompletionParameter
