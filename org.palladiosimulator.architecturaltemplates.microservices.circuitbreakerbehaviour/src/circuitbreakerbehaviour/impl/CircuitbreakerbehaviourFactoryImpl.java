/**
 */
package circuitbreakerbehaviour.impl;

import circuitbreakerbehaviour.*;

import org.eclipse.emf.ecore.EClass;
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
public class CircuitbreakerbehaviourFactoryImpl extends EFactoryImpl implements CircuitbreakerbehaviourFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CircuitbreakerbehaviourFactory init() {
		try {
			CircuitbreakerbehaviourFactory theCircuitbreakerbehaviourFactory = (CircuitbreakerbehaviourFactory)EPackage.Registry.INSTANCE.getEFactory(CircuitbreakerbehaviourPackage.eNS_URI);
			if (theCircuitbreakerbehaviourFactory != null) {
				return theCircuitbreakerbehaviourFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CircuitbreakerbehaviourFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitbreakerbehaviourFactoryImpl() {
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
			case CircuitbreakerbehaviourPackage.CIRCUIT_BREAKER_RDSEFF: return createCircuitBreakerRDSEFF();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerRDSEFF createCircuitBreakerRDSEFF() {
		CircuitBreakerRDSEFFImpl circuitBreakerRDSEFF = new CircuitBreakerRDSEFFImpl();
		return circuitBreakerRDSEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitbreakerbehaviourPackage getCircuitbreakerbehaviourPackage() {
		return (CircuitbreakerbehaviourPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CircuitbreakerbehaviourPackage getPackage() {
		return CircuitbreakerbehaviourPackage.eINSTANCE;
	}

} //CircuitbreakerbehaviourFactoryImpl
