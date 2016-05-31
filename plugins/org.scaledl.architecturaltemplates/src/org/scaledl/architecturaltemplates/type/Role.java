/**
 */
package org.scaledl.architecturaltemplates.type;

import org.eclipse.emf.common.util.EList;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Role</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> The responsibilities of an architectural element. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.scaledl.architecturaltemplates.type.Role#getParameters <em>Parameters</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.Role#getAT <em>AT</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.Role#getConstraints <em>Constraints</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.Role#getStereotype <em>Stereotype</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.Role#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @see org.scaledl.architecturaltemplates.type.TypePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Entity {

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list. The list
     * contents are of type {@link org.scaledl.architecturaltemplates.type.Parameter}. It is
     * bidirectional and its opposite is '
     * {@link org.scaledl.architecturaltemplates.type.Parameter#getRole <em>Role</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getRole_Parameters()
     * @see org.scaledl.architecturaltemplates.type.Parameter#getRole
     * @model opposite="role" containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

    /**
     * Returns the value of the '<em><b>AT</b></em>' container reference. It is bidirectional and
     * its opposite is '{@link org.scaledl.architecturaltemplates.type.AT#getRoles <em>Roles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>AT</em>' container reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>AT</em>' container reference.
     * @see #setAT(AT)
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getRole_AT()
     * @see org.scaledl.architecturaltemplates.type.AT#getRoles
     * @model opposite="roles" required="true" transient="false"
     * @generated
     */
    AT getAT();

    /**
     * Sets the value of the '{@link org.scaledl.architecturaltemplates.type.Role#getAT <em>AT</em>}
     * ' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>AT</em>' container reference.
     * @see #getAT()
     * @generated
     */
    void setAT(AT value);

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' reference list. The list contents are
     * of type {@link org.scaledl.architecturaltemplates.type.Constraint}. It is bidirectional and
     * its opposite is '{@link org.scaledl.architecturaltemplates.type.Constraint#getRoles
     * <em>Roles</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' reference list isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Constraints</em>' reference list.
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getRole_Constraints()
     * @see org.scaledl.architecturaltemplates.type.Constraint#getRoles
     * @model opposite="roles"
     * @generated
     */
    EList<Constraint> getConstraints();

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' reference isn't clear, there really should be
     * more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Stereotype</em>' reference.
     * @see #setStereotype(Stereotype)
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getRole_Stereotype()
     * @model required="true"
     * @generated
     */
    Stereotype getStereotype();

    /**
     * Sets the value of the '{@link org.scaledl.architecturaltemplates.type.Role#getStereotype
     * <em>Stereotype</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Stereotype</em>' reference.
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(Stereotype value);

    /**
     * Returns the value of the '<em><b>Completion</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.scaledl.architecturaltemplates.type.Completion#getRole <em>Role</em>}'. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Completion</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Completion</em>' containment reference.
     * @see #setCompletion(Completion)
     * @see org.scaledl.architecturaltemplates.type.TypePackage#getRole_Completion()
     * @see org.scaledl.architecturaltemplates.type.Completion#getRole
     * @model opposite="role" containment="true"
     * @generated
     */
    Completion getCompletion();

    /**
     * Sets the value of the '{@link org.scaledl.architecturaltemplates.type.Role#getCompletion
     * <em>Completion</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Completion</em>' containment reference.
     * @see #getCompletion()
     * @generated
     */
    void setCompletion(Completion value);

} // Role
