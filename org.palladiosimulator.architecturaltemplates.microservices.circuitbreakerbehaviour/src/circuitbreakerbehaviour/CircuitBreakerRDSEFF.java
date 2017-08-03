/**
 */
package circuitbreakerbehaviour;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Breaker RDSEFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitbreakerbehaviour.CircuitBreakerRDSEFF#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see circuitbreakerbehaviour.CircuitbreakerbehaviourPackage#getCircuitBreakerRDSEFF()
 * @model
 * @generated
 */
public interface CircuitBreakerRDSEFF extends EObject, ResourceDemandingSEFF {

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * The default value is <code>"3000.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(double)
	 * @see circuitbreakerbehaviour.CircuitbreakerbehaviourPackage#getCircuitBreakerRDSEFF_Timeout()
	 * @model default="3000.0" required="true" ordered="false"
	 * @generated
	 */
	double getTimeout();

	/**
	 * Sets the value of the '{@link circuitbreakerbehaviour.CircuitBreakerRDSEFF#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(double value);

} // CircuitBreakerRDSEFF
