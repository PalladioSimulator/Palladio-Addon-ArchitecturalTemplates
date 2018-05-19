/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>PCM File
 * Extension</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.PCMFileExtension#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMFileExtension()
 * @model
 * @generated
 */
public interface PCMFileExtension extends FileExtension {

    /**
     * Returns the value of the '<em><b>File Extension</b></em>' attribute. The default value is
     * <code>"system"</code>. The literals are from the enumeration
     * {@link org.palladiosimulator.architecturaltemplates.PCMFileExtensions}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>File Extension</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>File Extension</em>' attribute.
     * @see org.palladiosimulator.architecturaltemplates.PCMFileExtensions
     * @see #setFileExtension(PCMFileExtensions)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMFileExtension_FileExtension()
     * @model default="system" required="true"
     * @generated
     */
    PCMFileExtensions getFileExtension();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.PCMFileExtension#getFileExtension
     * <em>File Extension</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>File Extension</em>' attribute.
     * @see org.palladiosimulator.architecturaltemplates.PCMFileExtensions
     * @see #getFileExtension()
     * @generated
     */
    void setFileExtension(PCMFileExtensions value);

} // PCMFileExtension
