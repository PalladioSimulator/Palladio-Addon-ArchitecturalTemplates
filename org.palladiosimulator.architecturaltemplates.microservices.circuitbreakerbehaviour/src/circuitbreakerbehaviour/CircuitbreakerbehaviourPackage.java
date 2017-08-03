/**
 */
package circuitbreakerbehaviour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.palladiosimulator.pcm.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see circuitbreakerbehaviour.CircuitbreakerbehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface CircuitbreakerbehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circuitbreakerbehaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.palladiosimulator.architecturaltemplates.microservices/circuitbreakerbehaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circuitbreakerbehaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitbreakerbehaviourPackage eINSTANCE = circuitbreakerbehaviour.impl.CircuitbreakerbehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link circuitbreakerbehaviour.impl.CircuitBreakerRDSEFFImpl <em>Circuit Breaker RDSEFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitbreakerbehaviour.impl.CircuitBreakerRDSEFFImpl
	 * @see circuitbreakerbehaviour.impl.CircuitbreakerbehaviourPackageImpl#getCircuitBreakerRDSEFF()
	 * @generated
	 */
	int CIRCUIT_BREAKER_RDSEFF = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__ID = SeffPackage.RESOURCE_DEMANDING_SEFF__ID;

	/**
	 * The feature id for the '<em><b>Seff Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__SEFF_TYPE_ID = SeffPackage.RESOURCE_DEMANDING_SEFF__SEFF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Described Service SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__DESCRIBED_SERVICE_SEFF = SeffPackage.RESOURCE_DEMANDING_SEFF__DESCRIBED_SERVICE_SEFF;

	/**
	 * The feature id for the '<em><b>Basic Component Service Effect Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION = SeffPackage.RESOURCE_DEMANDING_SEFF__BASIC_COMPONENT_SERVICE_EFFECT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Abstract Loop Action Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR = SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_LOOP_ACTION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Abstract Branch Transition Resource Demanding Behaviour</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR = SeffPackage.RESOURCE_DEMANDING_SEFF__ABSTRACT_BRANCH_TRANSITION_RESOURCE_DEMANDING_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Steps Behaviour</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__STEPS_BEHAVIOUR = SeffPackage.RESOURCE_DEMANDING_SEFF__STEPS_BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Resource Demanding Internal Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS = SeffPackage.RESOURCE_DEMANDING_SEFF__RESOURCE_DEMANDING_INTERNAL_BEHAVIOURS;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF__TIMEOUT = SeffPackage.RESOURCE_DEMANDING_SEFF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circuit Breaker RDSEFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_RDSEFF_FEATURE_COUNT = SeffPackage.RESOURCE_DEMANDING_SEFF_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link circuitbreakerbehaviour.CircuitBreakerRDSEFF <em>Circuit Breaker RDSEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Breaker RDSEFF</em>'.
	 * @see circuitbreakerbehaviour.CircuitBreakerRDSEFF
	 * @generated
	 */
	EClass getCircuitBreakerRDSEFF();

	/**
	 * Returns the meta object for the attribute '{@link circuitbreakerbehaviour.CircuitBreakerRDSEFF#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see circuitbreakerbehaviour.CircuitBreakerRDSEFF#getTimeout()
	 * @see #getCircuitBreakerRDSEFF()
	 * @generated
	 */
	EAttribute getCircuitBreakerRDSEFF_Timeout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircuitbreakerbehaviourFactory getCircuitbreakerbehaviourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link circuitbreakerbehaviour.impl.CircuitBreakerRDSEFFImpl <em>Circuit Breaker RDSEFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitbreakerbehaviour.impl.CircuitBreakerRDSEFFImpl
		 * @see circuitbreakerbehaviour.impl.CircuitbreakerbehaviourPackageImpl#getCircuitBreakerRDSEFF()
		 * @generated
		 */
		EClass CIRCUIT_BREAKER_RDSEFF = eINSTANCE.getCircuitBreakerRDSEFF();
		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER_RDSEFF__TIMEOUT = eINSTANCE.getCircuitBreakerRDSEFF_Timeout();

	}

} //CircuitbreakerbehaviourPackage
