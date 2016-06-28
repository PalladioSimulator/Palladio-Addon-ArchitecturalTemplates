/**
 */
package org.palladiosimulator.architecturaltemplates;

import org.eclipse.emf.ecore.EDataType;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parameter</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.Parameter#getRole <em>Role</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.Parameter#getDataType <em>Data Type</em>}
 * </li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Entity {

    /**
     * Returns the value of the '<em><b>Role</b></em>' container reference. It is bidirectional and
     * its opposite is '{@link org.palladiosimulator.architecturaltemplates.Role#getParameters
     * <em>Parameters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Roles can be parametrized to specify variation points. Its completion defines how to
     * interpret this parameter. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Role</em>' container reference.
     * @see #setRole(Role)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getParameter_Role()
     * @see org.palladiosimulator.architecturaltemplates.Role#getParameters
     * @model opposite="parameters" required="true" transient="false"
     * @generated
     */
    Role getRole();

    /**
     * Sets the value of the '{@link org.palladiosimulator.architecturaltemplates.Parameter#getRole
     * <em>Role</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Role</em>' container reference.
     * @see #getRole()
     * @generated
     */
    void setRole(Role value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' reference isn't clear, there really should be more
     * of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Data Type</em>' reference.
     * @see #setDataType(EDataType)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getParameter_DataType()
     * @model required="true"
     * @generated
     */
    EDataType getDataType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.architecturaltemplates.Parameter#getDataType <em>Data Type</em>}
     * ' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Data Type</em>' reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(EDataType value);

} // Parameter
