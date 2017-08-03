/**
 */
package circuitbreakerbehaviour.impl;

import circuitbreakerbehaviour.CircuitBreakerRDSEFF;
import circuitbreakerbehaviour.CircuitbreakerbehaviourPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.seff.impl.ResourceDemandingSEFFImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Breaker RDSEFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitbreakerbehaviour.impl.CircuitBreakerRDSEFFImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitBreakerRDSEFFImpl extends ResourceDemandingSEFFImpl implements CircuitBreakerRDSEFF {
	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final double TIMEOUT_EDEFAULT = 3000.0;
	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected double timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitBreakerRDSEFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitbreakerbehaviourPackage.Literals.CIRCUIT_BREAKER_RDSEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(double newTimeout) {
		double oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitbreakerbehaviourPackage.CIRCUIT_BREAKER_RDSEFF__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuitbreakerbehaviourPackage.CIRCUIT_BREAKER_RDSEFF__TIMEOUT:
				return getTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuitbreakerbehaviourPackage.CIRCUIT_BREAKER_RDSEFF__TIMEOUT:
				setTimeout((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CircuitbreakerbehaviourPackage.CIRCUIT_BREAKER_RDSEFF__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CircuitbreakerbehaviourPackage.CIRCUIT_BREAKER_RDSEFF__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //CircuitBreakerRDSEFFImpl
