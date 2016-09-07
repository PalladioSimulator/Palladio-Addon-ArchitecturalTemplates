/**
 */
package org.palladiosimulator.architecturaltemplates;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Constraint</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.Constraint#getRole <em>Role</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.Constraint#getExpression
 * <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends Entity {

    /**
     * Returns the value of the '<em><b>Role</b></em>' container reference. It is bidirectional and
     * its opposite is '{@link org.palladiosimulator.architecturaltemplates.Role#getConstraints
     * <em>Constraints</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' container reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Role</em>' container reference.
     * @see #setRole(Role)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getConstraint_Role()
     * @see org.palladiosimulator.architecturaltemplates.Role#getConstraints
     * @model opposite="constraints" required="true" transient="false"
     * @generated
     */
    Role getRole();

    /**
     * Sets the value of the '{@link org.palladiosimulator.architecturaltemplates.Constraint#getRole
     * <em>Role</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Role</em>' container reference.
     * @see #getRole()
     * @generated
     */
    void setRole(Role value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getConstraint_Expression()
     * @model required="true"
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.Constraint#getExpression
     * <em>Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

} // Constraint
