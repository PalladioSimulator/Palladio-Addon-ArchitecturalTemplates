/**
 */
package org.scaledl.architecturaltemplates.type;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>AT</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.scaledl.architecturaltemplates.type.AT#getCatalog <em>Catalog</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.AT#getRoles <em>Roles</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.AT#getConstraints <em>Constraints</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.AT#getReconfigurationRuleFolder
 * <em>Reconfiguration Rule Folder</em>}</li>
 * </ul>
 *
 * @see org.scaledl.architecturaltemplates.type.TypePackage#getAT()
 * @model
 * @generated
 */
public interface AT extends Entity {

    /**
     * Returns the value of the '<em><b>Catalog</b></em>' container reference. It is bidirectional
     * and its opposite is '{@link org.scaledl.architecturaltemplates.type.Catalog#getATs
     * <em>ATs</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalog</em>' container reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Catalog</em>' container reference.
     * @see #setCatalog(Catalog)
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getAT_Catalog()
     * @see org.scaledl.architecturaltemplates.type.Catalog#getATs
     * @model opposite="ATs" required="true" transient="false"
     * @generated
     */
    Catalog getCatalog();

    /**
     * Sets the value of the '{@link org.scaledl.architecturaltemplates.type.AT#getCatalog
     * <em>Catalog</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Catalog</em>' container reference.
     * @see #getCatalog()
     * @generated
     */
    void setCatalog(Catalog value);

    /**
     * Returns the value of the '<em><b>Roles</b></em>' containment reference list. The list
     * contents are of type {@link org.scaledl.architecturaltemplates.type.Role}. It is
     * bidirectional and its opposite is '{@link org.scaledl.architecturaltemplates.type.Role#getAT
     * <em>AT</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Roles</em>' containment reference list.
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getAT_Roles()
     * @see org.scaledl.architecturaltemplates.type.Role#getAT
     * @model opposite="AT" containment="true"
     * @generated
     */
    EList<Role> getRoles();

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list. The list
     * contents are of type {@link org.scaledl.architecturaltemplates.type.Constraint}. It is
     * bidirectional and its opposite is '
     * {@link org.scaledl.architecturaltemplates.type.Constraint#getAT <em>AT</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getAT_Constraints()
     * @see org.scaledl.architecturaltemplates.type.Constraint#getAT
     * @model opposite="AT" containment="true"
     * @generated
     */
    EList<Constraint> getConstraints();

    /**
     * Returns the value of the '<em><b>Reconfiguration Rule Folder</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reconfiguration Rule Folder</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc --> <!-- begin-model-doc --> A template can provide reconfigurations to be
     * applied during analyses. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Reconfiguration Rule Folder</em>' containment reference.
     * @see #setReconfigurationRuleFolder(ReconfigurationFolder)
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getAT_ReconfigurationRuleFolder()
     * @model containment="true"
     * @generated
     */
    ReconfigurationFolder getReconfigurationRuleFolder();

    /**
     * Sets the value of the '
     * {@link org.scaledl.architecturaltemplates.type.AT#getReconfigurationRuleFolder
     * <em>Reconfiguration Rule Folder</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Reconfiguration Rule Folder</em>' containment reference.
     * @see #getReconfigurationRuleFolder()
     * @generated
     */
    void setReconfigurationRuleFolder(ReconfigurationFolder value);

} // AT
