/**
 */
package circuitbreaker.impl;

import circuitbreaker.CircuitBreaker;
import circuitbreaker.CircuitBreakerModel;
import circuitbreaker.CircuitBreakerPackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitbreaker.impl.CircuitBreakerModelImpl#getCircuitBreakers <em>Circuit Breakers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitBreakerModelImpl extends EntityImpl implements CircuitBreakerModel {
	/**
	 * The cached value of the '{@link #getCircuitBreakers() <em>Circuit Breakers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreakers()
	 * @generated
	 * @ordered
	 */
	protected EList<CircuitBreaker> circuitBreakers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitBreakerModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitBreakerPackage.Literals.CIRCUIT_BREAKER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircuitBreaker> getCircuitBreakers() {
		if (circuitBreakers == null) {
			circuitBreakers = new EObjectContainmentWithInverseEList<CircuitBreaker>(CircuitBreaker.class, this, CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS, CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL);
		}
		return circuitBreakers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCircuitBreakers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS:
				return ((InternalEList<?>)getCircuitBreakers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS:
				return getCircuitBreakers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS:
				getCircuitBreakers().clear();
				getCircuitBreakers().addAll((Collection<? extends CircuitBreaker>)newValue);
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
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS:
				getCircuitBreakers().clear();
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
			case CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS:
				return circuitBreakers != null && !circuitBreakers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CircuitBreakerModelImpl
