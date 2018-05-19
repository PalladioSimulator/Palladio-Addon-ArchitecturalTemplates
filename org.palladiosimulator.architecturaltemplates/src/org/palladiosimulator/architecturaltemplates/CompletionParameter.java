/**
 */
package org.palladiosimulator.architecturaltemplates;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Completion
 * Parameter</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Completion parameters characterize the signatures of completions (i.e.,
 * the in- and output parameters of transformations). <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.CompletionParameter#getCompletion
 * <em>Completion</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getCompletionParameter()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface CompletionParameter extends CDOObject {

    /**
     * Returns the value of the '<em><b>Completion</b></em>' container reference. It is
     * bidirectional and its opposite is
     * '{@link org.palladiosimulator.architecturaltemplates.Completion#getParameters
     * <em>Parameters</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Completion</em>' container reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Completion</em>' container reference.
     * @see #setCompletion(Completion)
     * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getCompletionParameter_Completion()
     * @see org.palladiosimulator.architecturaltemplates.Completion#getParameters
     * @model opposite="parameters" required="true" transient="false"
     * @generated
     */
    Completion getCompletion();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.architecturaltemplates.CompletionParameter#getCompletion
     * <em>Completion</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Completion</em>' container reference.
     * @see #getCompletion()
     * @generated
     */
    void setCompletion(Completion value);

} // CompletionParameter
