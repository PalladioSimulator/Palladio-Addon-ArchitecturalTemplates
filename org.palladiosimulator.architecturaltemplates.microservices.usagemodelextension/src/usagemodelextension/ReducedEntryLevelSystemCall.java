/**
 */
package usagemodelextension;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduced Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usagemodelextension.ReducedEntryLevelSystemCall#getPriority <em>Priority</em>}</li>
 *   <li>{@link usagemodelextension.ReducedEntryLevelSystemCall#getOperationSignature__ReducedEntryLevelSystemCall <em>Operation Signature Reduced Entry Level System Call</em>}</li>
 *   <li>{@link usagemodelextension.ReducedEntryLevelSystemCall#getOutputParameterUsages_ReducedEntryLevelSystemCall <em>Output Parameter Usages Reduced Entry Level System Call</em>}</li>
 *   <li>{@link usagemodelextension.ReducedEntryLevelSystemCall#getInputParameterUsages_ReducedEntryLevelSystemCall <em>Input Parameter Usages Reduced Entry Level System Call</em>}</li>
 * </ul>
 *
 * @see usagemodelextension.UsagemodelextensionPackage#getReducedEntryLevelSystemCall()
 * @model
 * @generated
 */
public interface ReducedEntryLevelSystemCall extends EObject, AbstractUserAction {

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see usagemodelextension.UsagemodelextensionPackage#getReducedEntryLevelSystemCall_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link usagemodelextension.ReducedEntryLevelSystemCall#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Operation Signature Reduced Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Signature Reduced Entry Level System Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature Reduced Entry Level System Call</em>' reference.
	 * @see #setOperationSignature__ReducedEntryLevelSystemCall(OperationSignature)
	 * @see usagemodelextension.UsagemodelextensionPackage#getReducedEntryLevelSystemCall_OperationSignature__ReducedEntryLevelSystemCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationSignature getOperationSignature__ReducedEntryLevelSystemCall();

	/**
	 * Sets the value of the '{@link usagemodelextension.ReducedEntryLevelSystemCall#getOperationSignature__ReducedEntryLevelSystemCall <em>Operation Signature Reduced Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Signature Reduced Entry Level System Call</em>' reference.
	 * @see #getOperationSignature__ReducedEntryLevelSystemCall()
	 * @generated
	 */
	void setOperationSignature__ReducedEntryLevelSystemCall(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Output Parameter Usages Reduced Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.parameter.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter Usages Reduced Entry Level System Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter Usages Reduced Entry Level System Call</em>' containment reference list.
	 * @see usagemodelextension.UsagemodelextensionPackage#getReducedEntryLevelSystemCall_OutputParameterUsages_ReducedEntryLevelSystemCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getOutputParameterUsages_ReducedEntryLevelSystemCall();

	/**
	 * Returns the value of the '<em><b>Input Parameter Usages Reduced Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.parameter.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter Usages Reduced Entry Level System Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter Usages Reduced Entry Level System Call</em>' containment reference list.
	 * @see usagemodelextension.UsagemodelextensionPackage#getReducedEntryLevelSystemCall_InputParameterUsages_ReducedEntryLevelSystemCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getInputParameterUsages_ReducedEntryLevelSystemCall();
} // ReducedEntryLevelSystemCall
