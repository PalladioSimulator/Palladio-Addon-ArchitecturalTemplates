/**
 */
package circuitbreakerbehaviour;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see circuitbreakerbehaviour.CircuitbreakerbehaviourPackage
 * @generated
 */
public interface CircuitbreakerbehaviourFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitbreakerbehaviourFactory eINSTANCE = circuitbreakerbehaviour.impl.CircuitbreakerbehaviourFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Circuit Breaker RDSEFF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Breaker RDSEFF</em>'.
	 * @generated
	 */
	CircuitBreakerRDSEFF createCircuitBreakerRDSEFF();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CircuitbreakerbehaviourPackage getCircuitbreakerbehaviourPackage();

} //CircuitbreakerbehaviourFactory
