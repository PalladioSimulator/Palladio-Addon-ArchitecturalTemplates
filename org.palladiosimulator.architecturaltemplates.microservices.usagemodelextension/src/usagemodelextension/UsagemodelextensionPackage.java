/**
 */
package usagemodelextension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see usagemodelextension.UsagemodelextensionFactory
 * @model kind="package"
 * @generated
 */
public interface UsagemodelextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usagemodelextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.palladiosimulator.architecturaltemplates.microservices/usagemodelextension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usagemodelextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsagemodelextensionPackage eINSTANCE = usagemodelextension.impl.UsagemodelextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl <em>API Gateway Entry Level System Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl
	 * @see usagemodelextension.impl.UsagemodelextensionPackageImpl#getAPIGatewayEntryLevelSystemCall()
	 * @generated
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__ID = UsagemodelPackage.ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__ENTITY_NAME = UsagemodelPackage.ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__SUCCESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PREDECESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Signature API Gateway Entry Level System Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Parameter Usages API Gateway Entry Level System Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Parameter Usages API Gateway Entry Level System Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>API Gateway Entry Level System Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL_FEATURE_COUNT = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 4;

	/**
	 * Returns the meta object for class '{@link usagemodelextension.APIGatewayEntryLevelSystemCall <em>API Gateway Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Gateway Entry Level System Call</em>'.
	 * @see usagemodelextension.APIGatewayEntryLevelSystemCall
	 * @generated
	 */
	EClass getAPIGatewayEntryLevelSystemCall();

	/**
	 * Returns the meta object for the attribute '{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see usagemodelextension.APIGatewayEntryLevelSystemCall#getPriority()
	 * @see #getAPIGatewayEntryLevelSystemCall()
	 * @generated
	 */
	EAttribute getAPIGatewayEntryLevelSystemCall_Priority();

	/**
	 * Returns the meta object for the reference '{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getOperationSignature__APIGatewayEntryLevelSystemCall <em>Operation Signature API Gateway Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Signature API Gateway Entry Level System Call</em>'.
	 * @see usagemodelextension.APIGatewayEntryLevelSystemCall#getOperationSignature__APIGatewayEntryLevelSystemCall()
	 * @see #getAPIGatewayEntryLevelSystemCall()
	 * @generated
	 */
	EReference getAPIGatewayEntryLevelSystemCall_OperationSignature__APIGatewayEntryLevelSystemCall();

	/**
	 * Returns the meta object for the containment reference list '{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getOutputParameterUsages_APIGatewayEntryLevelSystemCall <em>Output Parameter Usages API Gateway Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter Usages API Gateway Entry Level System Call</em>'.
	 * @see usagemodelextension.APIGatewayEntryLevelSystemCall#getOutputParameterUsages_APIGatewayEntryLevelSystemCall()
	 * @see #getAPIGatewayEntryLevelSystemCall()
	 * @generated
	 */
	EReference getAPIGatewayEntryLevelSystemCall_OutputParameterUsages_APIGatewayEntryLevelSystemCall();

	/**
	 * Returns the meta object for the containment reference list '{@link usagemodelextension.APIGatewayEntryLevelSystemCall#getInputParameterUsages_APIGatewayEntryLevelSystemCall <em>Input Parameter Usages API Gateway Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter Usages API Gateway Entry Level System Call</em>'.
	 * @see usagemodelextension.APIGatewayEntryLevelSystemCall#getInputParameterUsages_APIGatewayEntryLevelSystemCall()
	 * @see #getAPIGatewayEntryLevelSystemCall()
	 * @generated
	 */
	EReference getAPIGatewayEntryLevelSystemCall_InputParameterUsages_APIGatewayEntryLevelSystemCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsagemodelextensionFactory getUsagemodelextensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl <em>API Gateway Entry Level System Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl
		 * @see usagemodelextension.impl.UsagemodelextensionPackageImpl#getAPIGatewayEntryLevelSystemCall()
		 * @generated
		 */
		EClass API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = eINSTANCE.getAPIGatewayEntryLevelSystemCall();
		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY = eINSTANCE.getAPIGatewayEntryLevelSystemCall_Priority();
		/**
		 * The meta object literal for the '<em><b>Operation Signature API Gateway Entry Level System Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = eINSTANCE.getAPIGatewayEntryLevelSystemCall_OperationSignature__APIGatewayEntryLevelSystemCall();
		/**
		 * The meta object literal for the '<em><b>Output Parameter Usages API Gateway Entry Level System Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = eINSTANCE.getAPIGatewayEntryLevelSystemCall_OutputParameterUsages_APIGatewayEntryLevelSystemCall();
		/**
		 * The meta object literal for the '<em><b>Input Parameter Usages API Gateway Entry Level System Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL = eINSTANCE.getAPIGatewayEntryLevelSystemCall_InputParameterUsages_APIGatewayEntryLevelSystemCall();

	}

} //UsagemodelextensionPackage
