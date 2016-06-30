/**
 */
package org.palladiosimulator.architecturaltemplates;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>OCL Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.OCLConstraint#getConstraint
 * <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getOCLConstraint()
 * @model
 * @generated
 */
public interface OCLConstraint extends Constraint {

    /**
     * Returns the value of the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraint</em>' attribute isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Constraint</em>' attribute.
     * @see #setConstraint(String)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getOCLConstraint_Constraint()
     * @model required="true"
     * @generated
     */
    String getConstraint();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.architecturaltemplates.OCLConstraint#getConstraint
     * <em>Constraint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Constraint</em>' attribute.
     * @see #getConstraint()
     * @generated
     */
    void setConstraint(String value);

} // OCLConstraint
