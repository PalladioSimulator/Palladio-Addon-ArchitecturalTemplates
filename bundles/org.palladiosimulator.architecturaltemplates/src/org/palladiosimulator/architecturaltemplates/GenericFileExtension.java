/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Generic File
 * Extension</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.GenericFileExtension#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getGenericFileExtension()
 * @model
 * @generated
 */
public interface GenericFileExtension extends FileExtension {

    /**
     * Returns the value of the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File Extension</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>File Extension</em>' attribute.
     * @see #setFileExtension(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getGenericFileExtension_FileExtension()
     * @model required="true"
     * @generated
     */
    String getFileExtension();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.GenericFileExtension#getFileExtension
     * <em>File Extension</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>File Extension</em>' attribute.
     * @see #getFileExtension()
     * @generated
     */
    void setFileExtension(String value);

} // GenericFileExtension
