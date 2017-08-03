/**
 */
package circuitbreaker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see circuitbreaker.CircuitBreakerFactory
 * @model kind="package"
 * @generated
 */
public interface CircuitBreakerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circuitbreaker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.palladiosimulator.architecturaltemplates.microservices/circuitbreaker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circuitbreaker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitBreakerPackage eINSTANCE = circuitbreaker.impl.CircuitBreakerPackageImpl.init();

	/**
	 * The meta object id for the '{@link circuitbreaker.impl.CircuitBreakerImpl <em>Circuit Breaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitbreaker.impl.CircuitBreakerImpl
	 * @see circuitbreaker.impl.CircuitBreakerPackageImpl#getCircuitBreaker()
	 * @generated
	 */
	int CIRCUIT_BREAKER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Circuit Breaker State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Fails</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__NUMBER_OF_FAILS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__OPEN_TIME_STAMP = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__SIGNATURES = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Circuit Breaker Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Circuit Breaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link circuitbreaker.impl.CircuitBreakerModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitbreaker.impl.CircuitBreakerModelImpl
	 * @see circuitbreaker.impl.CircuitBreakerPackageImpl#getCircuitBreakerModel()
	 * @generated
	 */
	int CIRCUIT_BREAKER_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_MODEL__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_MODEL__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Circuit Breakers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_BREAKER_MODEL_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link circuitbreaker.CircuitBreakerState <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitbreaker.CircuitBreakerState
	 * @see circuitbreaker.impl.CircuitBreakerPackageImpl#getCircuitBreakerState()
	 * @generated
	 */
	int CIRCUIT_BREAKER_STATE = 2;


	/**
	 * Returns the meta object for class '{@link circuitbreaker.CircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Breaker</em>'.
	 * @see circuitbreaker.CircuitBreaker
	 * @generated
	 */
	EClass getCircuitBreaker();

	/**
	 * Returns the meta object for the attribute '{@link circuitbreaker.CircuitBreaker#getCircuitBreakerState <em>Circuit Breaker State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Breaker State</em>'.
	 * @see circuitbreaker.CircuitBreaker#getCircuitBreakerState()
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	EAttribute getCircuitBreaker_CircuitBreakerState();

	/**
	 * Returns the meta object for the attribute '{@link circuitbreaker.CircuitBreaker#getNumberOfFails <em>Number Of Fails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Fails</em>'.
	 * @see circuitbreaker.CircuitBreaker#getNumberOfFails()
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	EAttribute getCircuitBreaker_NumberOfFails();

	/**
	 * Returns the meta object for the attribute '{@link circuitbreaker.CircuitBreaker#getOpenTimeStamp <em>Open Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Time Stamp</em>'.
	 * @see circuitbreaker.CircuitBreaker#getOpenTimeStamp()
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	EAttribute getCircuitBreaker_OpenTimeStamp();

	/**
	 * Returns the meta object for the reference list '{@link circuitbreaker.CircuitBreaker#getSignatures <em>Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signatures</em>'.
	 * @see circuitbreaker.CircuitBreaker#getSignatures()
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	EReference getCircuitBreaker_Signatures();

	/**
	 * Returns the meta object for the container reference '{@link circuitbreaker.CircuitBreaker#getCircuitBreakerModel <em>Circuit Breaker Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Circuit Breaker Model</em>'.
	 * @see circuitbreaker.CircuitBreaker#getCircuitBreakerModel()
	 * @see #getCircuitBreaker()
	 * @generated
	 */
	EReference getCircuitBreaker_CircuitBreakerModel();

	/**
	 * Returns the meta object for class '{@link circuitbreaker.CircuitBreakerModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see circuitbreaker.CircuitBreakerModel
	 * @generated
	 */
	EClass getCircuitBreakerModel();

	/**
	 * Returns the meta object for the containment reference list '{@link circuitbreaker.CircuitBreakerModel#getCircuitBreakers <em>Circuit Breakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuit Breakers</em>'.
	 * @see circuitbreaker.CircuitBreakerModel#getCircuitBreakers()
	 * @see #getCircuitBreakerModel()
	 * @generated
	 */
	EReference getCircuitBreakerModel_CircuitBreakers();

	/**
	 * Returns the meta object for enum '{@link circuitbreaker.CircuitBreakerState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see circuitbreaker.CircuitBreakerState
	 * @generated
	 */
	EEnum getCircuitBreakerState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircuitBreakerFactory getCircuitBreakerFactory();

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
		 * The meta object literal for the '{@link circuitbreaker.impl.CircuitBreakerImpl <em>Circuit Breaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitbreaker.impl.CircuitBreakerImpl
		 * @see circuitbreaker.impl.CircuitBreakerPackageImpl#getCircuitBreaker()
		 * @generated
		 */
		EClass CIRCUIT_BREAKER = eINSTANCE.getCircuitBreaker();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE = eINSTANCE.getCircuitBreaker_CircuitBreakerState();

		/**
		 * The meta object literal for the '<em><b>Number Of Fails</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER__NUMBER_OF_FAILS = eINSTANCE.getCircuitBreaker_NumberOfFails();

		/**
		 * The meta object literal for the '<em><b>Open Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT_BREAKER__OPEN_TIME_STAMP = eINSTANCE.getCircuitBreaker_OpenTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BREAKER__SIGNATURES = eINSTANCE.getCircuitBreaker_Signatures();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL = eINSTANCE.getCircuitBreaker_CircuitBreakerModel();

		/**
		 * The meta object literal for the '{@link circuitbreaker.impl.CircuitBreakerModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitbreaker.impl.CircuitBreakerModelImpl
		 * @see circuitbreaker.impl.CircuitBreakerPackageImpl#getCircuitBreakerModel()
		 * @generated
		 */
		EClass CIRCUIT_BREAKER_MODEL = eINSTANCE.getCircuitBreakerModel();

		/**
		 * The meta object literal for the '<em><b>Circuit Breakers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS = eINSTANCE.getCircuitBreakerModel_CircuitBreakers();

		/**
		 * The meta object literal for the '{@link circuitbreaker.CircuitBreakerState <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitbreaker.CircuitBreakerState
		 * @see circuitbreaker.impl.CircuitBreakerPackageImpl#getCircuitBreakerState()
		 * @generated
		 */
		EEnum CIRCUIT_BREAKER_STATE = eINSTANCE.getCircuitBreakerState();

	}

} //CircuitBreakerPackage
