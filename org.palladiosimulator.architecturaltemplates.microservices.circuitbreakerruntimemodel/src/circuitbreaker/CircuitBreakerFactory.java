/**
 */
package circuitbreaker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see circuitbreaker.CircuitBreakerPackage
 * @generated
 */
public interface CircuitBreakerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitBreakerFactory eINSTANCE = circuitbreaker.impl.CircuitBreakerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Circuit Breaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Breaker</em>'.
	 * @generated
	 */
	CircuitBreaker createCircuitBreaker();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	CircuitBreakerModel createCircuitBreakerModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CircuitBreakerPackage getCircuitBreakerPackage();

} //CircuitBreakerFactory
