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
 * A representation of the model object '<em><b>API Gateway Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getPriority <em>Priority</em>}</li>
 *   <li>{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getOperationSignature__APIGatewayEntryLevelSystemCall <em>Operation Signature API Gateway Entry Level System Call</em>}</li>
 *   <li>{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getOutputParameterUsages_APIGatewayEntryLevelSystemCall <em>Output Parameter Usages API Gateway Entry Level System Call</em>}</li>
 *   <li>{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getInputParameterUsages_APIGatewayEntryLevelSystemCall <em>Input Parameter Usages API Gateway Entry Level System Call</em>}</li>
 * </ul>
 *
 * @see usagemodelextension.UsagemodelextensionPackage#getAPIGatewayEntryLevelSystemCall()
 * @model
 * @generated
 */
public interface APIGatewayEntryLevelSystemCall extends EObject, AbstractUserAction {
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
	 * @see usagemodelextension.UsagemodelextensionPackage#getAPIGatewayEntryLevelSystemCall_Priority()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Operation Signature API Gateway Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Signature API Gateway Entry Level System Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Signature API Gateway Entry Level System Call</em>' reference.
	 * @see #setOperationSignature__APIGatewayEntryLevelSystemCall(OperationSignature)
	 * @see usagemodelextension.UsagemodelextensionPackage#getAPIGatewayEntryLevelSystemCall_OperationSignature__APIGatewayEntryLevelSystemCall()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperationSignature getOperationSignature__APIGatewayEntryLevelSystemCall();

	/**
	 * Sets the value of the '{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getOperationSignature__APIGatewayEntryLevelSystemCall <em>Operation Signature API Gateway Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Signature API Gateway Entry Level System Call</em>' reference.
	 * @see #getOperationSignature__APIGatewayEntryLevelSystemCall()
	 * @generated
	 */
	void setOperationSignature__APIGatewayEntryLevelSystemCall(OperationSignature value);

	/**
	 * Returns the value of the '<em><b>Output Parameter Usages API Gateway Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.parameter.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter Usages API Gateway Entry Level System Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter Usages API Gateway Entry Level System Call</em>' containment reference list.
	 * @see usagemodelextension.UsagemodelextensionPackage#getAPIGatewayEntryLevelSystemCall_OutputParameterUsages_APIGatewayEntryLevelSystemCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getOutputParameterUsages_APIGatewayEntryLevelSystemCall();

	/**
	 * Returns the value of the '<em><b>Input Parameter Usages API Gateway Entry Level System Call</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.parameter.VariableUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter Usages API Gateway Entry Level System Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter Usages API Gateway Entry Level System Call</em>' containment reference list.
	 * @see usagemodelextension.UsagemodelextensionPackage#getAPIGatewayEntryLevelSystemCall_InputParameterUsages_APIGatewayEntryLevelSystemCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VariableUsage> getInputParameterUsages_APIGatewayEntryLevelSystemCall();

} // APIGatewayEntryLevelSystemCall
