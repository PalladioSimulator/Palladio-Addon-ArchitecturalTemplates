/**
 */
package org.palladiosimulator.architecturaltemplates;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Completion</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> A completion is a refinement transformation from AT-annotated model into
 * a model with well-defined semantics (thus, specifying the semantics of a given AT). This
 * particularly includes a refinement transformation to another AT-annotated model as well (the
 * second AT also includes a completion for defining its semantics, thus, has well-defined
 * semantics).
 *
 * As an example, consider a component annotated with an AT role "3-times loabalanced". A completion
 * could refine this component into a model with 4 components: 1 loadbalancer plus 3 replica of the
 * originally annotated component. The loadbalancer then evenly distributes load over the 3 replica.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.Completion#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.Completion#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getCompletion()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Completion extends CDOObject {

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.architecturaltemplates.CompletionParameter}
     * . It is bidirectional and its opposite is '
     * {@link org.palladiosimulator.architecturaltemplates.CompletionParameter#getCompletion
     * <em>Completion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Every in- and output parameter of a completion has to exactly match this order. <!--
     * end-model-doc -->
     *
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getCompletion_Parameters()
     * @see org.palladiosimulator.architecturaltemplates.CompletionParameter#getCompletion
     * @model opposite="completion" containment="true" required="true"
     * @generated
     */
    EList<CompletionParameter> getParameters();

    /**
     * Returns the value of the '<em><b>Role</b></em>' container reference. It is bidirectional and
     * its opposite is '{@link org.palladiosimulator.architecturaltemplates.Role#getCompletion
     * <em>Completion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * In addition to constraints, role semantics are defined by a completion. <!-- end-model-doc
     * -->
     *
     * @return the value of the '<em>Role</em>' container reference.
     * @see #setRole(Role)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getCompletion_Role()
     * @see org.palladiosimulator.architecturaltemplates.Role#getCompletion
     * @model opposite="completion" transient="false"
     * @generated
     */
    Role getRole();

    /**
     * Sets the value of the '{@link org.palladiosimulator.architecturaltemplates.Completion#getRole
     * <em>Role</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Role</em>' container reference.
     * @see #getRole()
     * @generated
     */
    void setRole(Role value);

} // Completion
