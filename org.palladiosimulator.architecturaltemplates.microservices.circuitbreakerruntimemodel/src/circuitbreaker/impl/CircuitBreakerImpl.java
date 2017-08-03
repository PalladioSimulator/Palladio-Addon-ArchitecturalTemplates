/**
 */
package circuitbreaker.impl;

import circuitbreaker.CircuitBreaker;
import circuitbreaker.CircuitBreakerModel;
import circuitbreaker.CircuitBreakerPackage;
import circuitbreaker.CircuitBreakerState;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.pcm.repository.OperationSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circuit Breaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitbreaker.impl.CircuitBreakerImpl#getCircuitBreakerState <em>Circuit Breaker State</em>}</li>
 *   <li>{@link circuitbreaker.impl.CircuitBreakerImpl#getNumberOfFails <em>Number Of Fails</em>}</li>
 *   <li>{@link circuitbreaker.impl.CircuitBreakerImpl#getOpenTimeStamp <em>Open Time Stamp</em>}</li>
 *   <li>{@link circuitbreaker.impl.CircuitBreakerImpl#getSignatures <em>Signatures</em>}</li>
 *   <li>{@link circuitbreaker.impl.CircuitBreakerImpl#getCircuitBreakerModel <em>Circuit Breaker Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircuitBreakerImpl extends EntityImpl implements CircuitBreaker {
	/**
	 * The default value of the '{@link #getCircuitBreakerState() <em>Circuit Breaker State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreakerState()
	 * @generated
	 * @ordered
	 */
	protected static final CircuitBreakerState CIRCUIT_BREAKER_STATE_EDEFAULT = CircuitBreakerState.CLOSED;

	/**
	 * The cached value of the '{@link #getCircuitBreakerState() <em>Circuit Breaker State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitBreakerState()
	 * @generated
	 * @ordered
	 */
	protected CircuitBreakerState circuitBreakerState = CIRCUIT_BREAKER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfFails() <em>Number Of Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFails()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_FAILS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfFails() <em>Number Of Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfFails()
	 * @generated
	 * @ordered
	 */
	protected int numberOfFails = NUMBER_OF_FAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenTimeStamp() <em>Open Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final double OPEN_TIME_STAMP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOpenTimeStamp() <em>Open Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected double openTimeStamp = OPEN_TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignatures() <em>Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationSignature> signatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitBreakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitBreakerPackage.Literals.CIRCUIT_BREAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerState getCircuitBreakerState() {
		return circuitBreakerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitBreakerState(CircuitBreakerState newCircuitBreakerState) {
		CircuitBreakerState oldCircuitBreakerState = circuitBreakerState;
		circuitBreakerState = newCircuitBreakerState == null ? CIRCUIT_BREAKER_STATE_EDEFAULT : newCircuitBreakerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE, oldCircuitBreakerState, circuitBreakerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfFails() {
		return numberOfFails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfFails(int newNumberOfFails) {
		int oldNumberOfFails = numberOfFails;
		numberOfFails = newNumberOfFails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitBreakerPackage.CIRCUIT_BREAKER__NUMBER_OF_FAILS, oldNumberOfFails, numberOfFails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOpenTimeStamp() {
		return openTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenTimeStamp(double newOpenTimeStamp) {
		double oldOpenTimeStamp = openTimeStamp;
		openTimeStamp = newOpenTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitBreakerPackage.CIRCUIT_BREAKER__OPEN_TIME_STAMP, oldOpenTimeStamp, openTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationSignature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectResolvingEList<OperationSignature>(OperationSignature.class, this, CircuitBreakerPackage.CIRCUIT_BREAKER__SIGNATURES);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerModel getCircuitBreakerModel() {
		if (eContainerFeatureID() != CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL) return null;
		return (CircuitBreakerModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitBreakerModel(CircuitBreakerModel newCircuitBreakerModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCircuitBreakerModel, CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitBreakerModel(CircuitBreakerModel newCircuitBreakerModel) {
		if (newCircuitBreakerModel != eInternalContainer() || (eContainerFeatureID() != CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL && newCircuitBreakerModel != null)) {
			if (EcoreUtil.isAncestor(this, newCircuitBreakerModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCircuitBreakerModel != null)
				msgs = ((InternalEObject)newCircuitBreakerModel).eInverseAdd(this, CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS, CircuitBreakerModel.class, msgs);
			msgs = basicSetCircuitBreakerModel(newCircuitBreakerModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL, newCircuitBreakerModel, newCircuitBreakerModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCircuitBreakerModel((CircuitBreakerModel)otherEnd, msgs);
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
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				return basicSetCircuitBreakerModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				return eInternalContainer().eInverseRemove(this, CircuitBreakerPackage.CIRCUIT_BREAKER_MODEL__CIRCUIT_BREAKERS, CircuitBreakerModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE:
				return getCircuitBreakerState();
			case CircuitBreakerPackage.CIRCUIT_BREAKER__NUMBER_OF_FAILS:
				return getNumberOfFails();
			case CircuitBreakerPackage.CIRCUIT_BREAKER__OPEN_TIME_STAMP:
				return getOpenTimeStamp();
			case CircuitBreakerPackage.CIRCUIT_BREAKER__SIGNATURES:
				return getSignatures();
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				return getCircuitBreakerModel();
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
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE:
				setCircuitBreakerState((CircuitBreakerState)newValue);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__NUMBER_OF_FAILS:
				setNumberOfFails((Integer)newValue);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__OPEN_TIME_STAMP:
				setOpenTimeStamp((Double)newValue);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends OperationSignature>)newValue);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				setCircuitBreakerModel((CircuitBreakerModel)newValue);
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
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE:
				setCircuitBreakerState(CIRCUIT_BREAKER_STATE_EDEFAULT);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__NUMBER_OF_FAILS:
				setNumberOfFails(NUMBER_OF_FAILS_EDEFAULT);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__OPEN_TIME_STAMP:
				setOpenTimeStamp(OPEN_TIME_STAMP_EDEFAULT);
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__SIGNATURES:
				getSignatures().clear();
				return;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				setCircuitBreakerModel((CircuitBreakerModel)null);
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
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_STATE:
				return circuitBreakerState != CIRCUIT_BREAKER_STATE_EDEFAULT;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__NUMBER_OF_FAILS:
				return numberOfFails != NUMBER_OF_FAILS_EDEFAULT;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__OPEN_TIME_STAMP:
				return openTimeStamp != OPEN_TIME_STAMP_EDEFAULT;
			case CircuitBreakerPackage.CIRCUIT_BREAKER__SIGNATURES:
				return signatures != null && !signatures.isEmpty();
			case CircuitBreakerPackage.CIRCUIT_BREAKER__CIRCUIT_BREAKER_MODEL:
				return getCircuitBreakerModel() != null;
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
		result.append(" (circuitBreakerState: ");
		result.append(circuitBreakerState);
		result.append(", numberOfFails: ");
		result.append(numberOfFails);
		result.append(", openTimeStamp: ");
		result.append(openTimeStamp);
		result.append(')');
		return result.toString();
	}

} //CircuitBreakerImpl
