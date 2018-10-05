/**
 */
package org.palladiosimulator.architecturaltemplates;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>AT</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> An AT is a template representing and documenting reusable architectural
 * knowledge. Software architects can apply ATs for both architectural modeling and architectural
 * analyses while AT engineers specify ATs. An optional default AT instance provides software
 * architects with an initial architectural model corresponding to the represented architectural
 * knowledge, e.g., a reference architecture.
 *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.AT#getCatalog <em>Catalog</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.AT#getRoles <em>Roles</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.AT#getReconfigurationRuleFolder
 * <em>Reconfiguration Rule Folder</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.AT#getDocumentation
 * <em>Documentation</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.AT#getDefaultInstanceURI <em>Default
 * Instance URI</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT()
 * @model
 * @generated
 */
public interface AT extends Entity {

    /**
     * Returns the value of the '<em><b>Catalog</b></em>' container reference. It is bidirectional
     * and its opposite is '{@link org.palladiosimulator.architecturaltemplates.Catalog#getATs
     * <em>ATs</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Catalog</em>' container reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Catalog</em>' container reference.
     * @see #setCatalog(Catalog)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT_Catalog()
     * @see org.palladiosimulator.architecturaltemplates.Catalog#getATs
     * @model opposite="ATs" required="true" transient="false"
     * @generated
     */
    Catalog getCatalog();

    /**
     * Sets the value of the '{@link org.palladiosimulator.architecturaltemplates.AT#getCatalog
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
     * contents are of type {@link org.palladiosimulator.architecturaltemplates.Role}. It is
     * bidirectional and its opposite is
     * '{@link org.palladiosimulator.architecturaltemplates.Role#getAT <em>AT</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles</em>' containment reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Roles</em>' containment reference list.
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT_Roles()
     * @see org.palladiosimulator.architecturaltemplates.Role#getAT
     * @model opposite="AT" containment="true"
     * @generated
     */
    EList<Role> getRoles();

    /**
     * Returns the value of the '<em><b>Reconfiguration Rule Folder</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A template can provide
     * reconfigurations to be applied during analyses. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Reconfiguration Rule Folder</em>' containment reference.
     * @see #setReconfigurationRuleFolder(ReconfigurationFolder)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT_ReconfigurationRuleFolder()
     * @model containment="true"
     * @generated
     */
    ReconfigurationFolder getReconfigurationRuleFolder();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.AT#getReconfigurationRuleFolder
     * <em>Reconfiguration Rule Folder</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Reconfiguration Rule Folder</em>' containment reference.
     * @see #getReconfigurationRuleFolder()
     * @generated
     */
    void setReconfigurationRuleFolder(ReconfigurationFolder value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Documentation</em>' attribute.
     * @see #setDocumentation(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT_Documentation()
     * @model
     * @generated
     */
    String getDocumentation();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.AT#getDocumentation
     * <em>Documentation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Documentation</em>' attribute.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(String value);

    /**
     * Returns the value of the '<em><b>Default Instance URI</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Instance URI</em>' attribute isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Default Instance URI</em>' attribute.
     * @see #setDefaultInstanceURI(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT_DefaultInstanceURI()
     * @model
     * @generated
     */
    String getDefaultInstanceURI();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.AT#getDefaultInstanceURI <em>Default
     * Instance URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Default Instance URI</em>' attribute.
     * @see #getDefaultInstanceURI()
     * @generated
     */
    void setDefaultInstanceURI(String value);

    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' reference list. The list contents are
     * of type {@link org.palladiosimulator.architecturaltemplates.AT}. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' reference list isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Dependencies</em>' reference list.
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getAT_Dependencies()
     * @model
     * @generated
     */
    EList<AT> getDependencies();

} // AT
