/**
 */
package circuitbreaker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitbreaker.CircuitBreakerModel#getCircuitBreakers <em>Circuit Breakers</em>}</li>
 * </ul>
 *
 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreakerModel()
 * @model
 * @generated
 */
public interface CircuitBreakerModel extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Circuit Breakers</b></em>' containment reference list.
	 * The list contents are of type {@link circuitbreaker.CircuitBreaker}.
	 * It is bidirectional and its opposite is '{@link circuitbreaker.CircuitBreaker#getCircuitBreakerModel <em>Circuit Breaker Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Breakers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Breakers</em>' containment reference list.
	 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreakerModel_CircuitBreakers()
	 * @see circuitbreaker.CircuitBreaker#getCircuitBreakerModel
	 * @model opposite="circuitBreakerModel" containment="true"
	 * @generated
	 */
	EList<CircuitBreaker> getCircuitBreakers();

} // CircuitBreakerModel
