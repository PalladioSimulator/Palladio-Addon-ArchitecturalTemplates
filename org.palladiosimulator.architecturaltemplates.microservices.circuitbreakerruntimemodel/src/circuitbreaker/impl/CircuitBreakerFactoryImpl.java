/**
 */
package circuitbreaker.impl;

import circuitbreaker.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitBreakerFactoryImpl extends EFactoryImpl implements CircuitBreakerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CircuitBreakerFactory init() {
		try {
			CircuitBreakerFactory theCircuitBreakerFactory = (CircuitBreakerFactory)EPackage.Registry.INSTANCE.getEFactory(CircuitBreakerPackage.eNS_URI);
			if (theCircuitBreakerFactory != null) {
				return theCircuitBreakerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CircuitBreakerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER: return createCircuitBreaker();
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL: return createCircuitBreakerModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER_STATE:
				return createCircuitBreakerStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER_STATE:
				return convertCircuitBreakerStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreaker createCircuitBreaker() {
		CircuitBreakerImpl circuitBreaker = new CircuitBreakerImpl();
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerModel createCircuitBreakerModel() {
		CircuitBreakerModelImpl circuitBreakerModel = new CircuitBreakerModelImpl();
		return circuitBreakerModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerState createCircuitBreakerStateFromString(EDataType eDataType, String initialValue) {
		CircuitBreakerState result = CircuitBreakerState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCircuitBreakerStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerPackage getCircuitBreakerPackage() {
		return (CircuitBreakerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CircuitBreakerPackage getPackage() {
		return CircuitBreakerPackage.eINSTANCE;
	}

} //CircuitBreakerFactoryImpl
