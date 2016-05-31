/**
 */
package org.scaledl.architecturaltemplates.type;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Reconfiguration Folder</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A folder with self-adaptation rules. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.scaledl.architecturaltemplates.type.ReconfigurationFolder#getFolderURI
 * <em>Folder URI</em>}</li>
 * </ul>
 *
 * @see org.scaledl.architecturaltemplates.type.TypePackage#getReconfigurationFolder()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ReconfigurationFolder extends CDOObject {

    /**
     * Returns the value of the '<em><b>Folder URI</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Folder URI</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Folder URI</em>' attribute.
     * @see #setFolderURI(String)
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getReconfigurationFolder_FolderURI()
     * @model required="true"
     * @generated
     */
    String getFolderURI();

    /**
     * Sets the value of the '
     * {@link org.scaledl.architecturaltemplates.type.ReconfigurationFolder#getFolderURI
     * <em>Folder URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Folder URI</em>' attribute.
     * @see #getFolderURI()
     * @generated
     */
    void setFolderURI(String value);

} // ReconfigurationFolder
