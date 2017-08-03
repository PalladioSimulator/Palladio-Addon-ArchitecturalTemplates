/**
 */
package circuitbreaker;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Breaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitbreaker.CircuitBreaker#getCircuitBreakerState <em>Circuit Breaker State</em>}</li>
 *   <li>{@link circuitbreaker.CircuitBreaker#getNumberOfFails <em>Number Of Fails</em>}</li>
 *   <li>{@link circuitbreaker.CircuitBreaker#getOpenTimeStamp <em>Open Time Stamp</em>}</li>
 *   <li>{@link circuitbreaker.CircuitBreaker#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link circuitbreaker.CircuitBreaker#getCircuitBreakerModel <em>Circuit Breaker Model</em>}</li>
 * </ul>
 *
 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreaker()
 * @model
 * @generated
 */
public interface CircuitBreaker extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Circuit Breaker State</b></em>' attribute.
	 * The default value is <code>"Closed"</code>.
	 * The literals are from the enumeration {@link circuitbreaker.CircuitBreakerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Breaker State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Breaker State</em>' attribute.
	 * @see circuitbreaker.CircuitBreakerState
	 * @see #setCircuitBreakerState(CircuitBreakerState)
	 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreaker_CircuitBreakerState()
	 * @model default="Closed" required="true" ordered="false"
	 * @generated
	 */
	CircuitBreakerState getCircuitBreakerState();

	/**
	 * Sets the value of the '{@link circuitbreaker.CircuitBreaker#getCircuitBreakerState <em>Circuit Breaker State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker State</em>' attribute.
	 * @see circuitbreaker.CircuitBreakerState
	 * @see #getCircuitBreakerState()
	 * @generated
	 */
	void setCircuitBreakerState(CircuitBreakerState value);

	/**
	 * Returns the value of the '<em><b>Number Of Fails</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Fails</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Fails</em>' attribute.
	 * @see #setNumberOfFails(int)
	 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreaker_NumberOfFails()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfFails();

	/**
	 * Sets the value of the '{@link circuitbreaker.CircuitBreaker#getNumberOfFails <em>Number Of Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Fails</em>' attribute.
	 * @see #getNumberOfFails()
	 * @generated
	 */
	void setNumberOfFails(int value);

	/**
	 * Returns the value of the '<em><b>Open Time Stamp</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Time Stamp</em>' attribute.
	 * @see #setOpenTimeStamp(double)
	 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreaker_OpenTimeStamp()
	 * @model default="0.0" required="true" ordered="false"
	 * @generated
	 */
	double getOpenTimeStamp();

	/**
	 * Sets the value of the '{@link circuitbreaker.CircuitBreaker#getOpenTimeStamp <em>Open Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Time Stamp</em>' attribute.
	 * @see #getOpenTimeStamp()
	 * @generated
	 */
	void setOpenTimeStamp(double value);

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationSignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' reference list.
	 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreaker_Signatures()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<OperationSignature> getSignatures();

	/**
	 * Returns the value of the '<em><b>Circuit Breaker Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link circuitbreaker.CircuitBreakerModel#getCircuitBreakers <em>Circuit Breakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Breaker Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Breaker Model</em>' container reference.
	 * @see #setCircuitBreakerModel(CircuitBreakerModel)
	 * @see circuitbreaker.CircuitBreakerPackage#getCircuitBreaker_CircuitBreakerModel()
	 * @see circuitbreaker.CircuitBreakerModel#getCircuitBreakers
	 * @model opposite="circuitBreakers" required="true" transient="false"
	 * @generated
	 */
	CircuitBreakerModel getCircuitBreakerModel();

	/**
	 * Sets the value of the '{@link circuitbreaker.CircuitBreaker#getCircuitBreakerModel <em>Circuit Breaker Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker Model</em>' container reference.
	 * @see #getCircuitBreakerModel()
	 * @generated
	 */
	void setCircuitBreakerModel(CircuitBreakerModel value);

} // CircuitBreaker
