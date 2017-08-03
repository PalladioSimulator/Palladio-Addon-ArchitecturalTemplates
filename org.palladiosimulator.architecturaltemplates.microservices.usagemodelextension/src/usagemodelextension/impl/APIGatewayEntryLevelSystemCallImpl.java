/**
 */
package usagemodelextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.parameter.VariableUsage;

import org.palladiosimulator.pcm.repository.OperationSignature;

import org.palladiosimulator.pcm.usagemodel.impl.AbstractUserActionImpl;

import usagemodelextension.APIGatewayEntryLevelSystemCall;
import usagemodelextension.UsagemodelextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Gateway Entry Level System Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl#getOperationSignature__APIGatewayEntryLevelSystemCall <em>Operation Signature API Gateway Entry Level System Call</em>}</li>
 *   <li>{@link usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl#getOutputParameterUsages_APIGatewayEntryLevelSystemCall <em>Output Parameter Usages API Gateway Entry Level System Call</em>}</li>
 *   <li>{@link usagemodelextension.impl.APIGatewayEntryLevelSystemCallImpl#getInputParameterUsages_APIGatewayEntryLevelSystemCall <em>Input Parameter Usages API Gateway Entry Level System Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIGatewayEntryLevelSystemCallImpl extends AbstractUserActionImpl implements APIGatewayEntryLevelSystemCall {
	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationSignature__APIGatewayEntryLevelSystemCall() <em>Operation Signature API Gateway Entry Level System Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSignature__APIGatewayEntryLevelSystemCall()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature operationSignature__APIGatewayEntryLevelSystemCall;

	/**
	 * The cached value of the '{@link #getOutputParameterUsages_APIGatewayEntryLevelSystemCall() <em>Output Parameter Usages API Gateway Entry Level System Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParameterUsages_APIGatewayEntryLevelSystemCall()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> outputParameterUsages_APIGatewayEntryLevelSystemCall;

	/**
	 * The cached value of the '{@link #getInputParameterUsages_APIGatewayEntryLevelSystemCall() <em>Input Parameter Usages API Gateway Entry Level System Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameterUsages_APIGatewayEntryLevelSystemCall()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableUsage> inputParameterUsages_APIGatewayEntryLevelSystemCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIGatewayEntryLevelSystemCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsagemodelextensionPackage.Literals.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getOperationSignature__APIGatewayEntryLevelSystemCall() {
		if (operationSignature__APIGatewayEntryLevelSystemCall != null && ((EObject)operationSignature__APIGatewayEntryLevelSystemCall).eIsProxy()) {
			InternalEObject oldOperationSignature__APIGatewayEntryLevelSystemCall = (InternalEObject)operationSignature__APIGatewayEntryLevelSystemCall;
			operationSignature__APIGatewayEntryLevelSystemCall = (OperationSignature)eResolveProxy(oldOperationSignature__APIGatewayEntryLevelSystemCall);
			if (operationSignature__APIGatewayEntryLevelSystemCall != oldOperationSignature__APIGatewayEntryLevelSystemCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL, oldOperationSignature__APIGatewayEntryLevelSystemCall, operationSignature__APIGatewayEntryLevelSystemCall));
			}
		}
		return operationSignature__APIGatewayEntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetOperationSignature__APIGatewayEntryLevelSystemCall() {
		return operationSignature__APIGatewayEntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationSignature__APIGatewayEntryLevelSystemCall(OperationSignature newOperationSignature__APIGatewayEntryLevelSystemCall) {
		OperationSignature oldOperationSignature__APIGatewayEntryLevelSystemCall = operationSignature__APIGatewayEntryLevelSystemCall;
		operationSignature__APIGatewayEntryLevelSystemCall = newOperationSignature__APIGatewayEntryLevelSystemCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL, oldOperationSignature__APIGatewayEntryLevelSystemCall, operationSignature__APIGatewayEntryLevelSystemCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getOutputParameterUsages_APIGatewayEntryLevelSystemCall() {
		if (outputParameterUsages_APIGatewayEntryLevelSystemCall == null) {
			outputParameterUsages_APIGatewayEntryLevelSystemCall = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL);
		}
		return outputParameterUsages_APIGatewayEntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableUsage> getInputParameterUsages_APIGatewayEntryLevelSystemCall() {
		if (inputParameterUsages_APIGatewayEntryLevelSystemCall == null) {
			inputParameterUsages_APIGatewayEntryLevelSystemCall = new EObjectContainmentEList<VariableUsage>(VariableUsage.class, this, UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL);
		}
		return inputParameterUsages_APIGatewayEntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return ((InternalEList<?>)getOutputParameterUsages_APIGatewayEntryLevelSystemCall()).basicRemove(otherEnd, msgs);
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return ((InternalEList<?>)getInputParameterUsages_APIGatewayEntryLevelSystemCall()).basicRemove(otherEnd, msgs);
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
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY:
				return getPriority();
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				if (resolve) return getOperationSignature__APIGatewayEntryLevelSystemCall();
				return basicGetOperationSignature__APIGatewayEntryLevelSystemCall();
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return getOutputParameterUsages_APIGatewayEntryLevelSystemCall();
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return getInputParameterUsages_APIGatewayEntryLevelSystemCall();
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
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				setOperationSignature__APIGatewayEntryLevelSystemCall((OperationSignature)newValue);
				return;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				getOutputParameterUsages_APIGatewayEntryLevelSystemCall().clear();
				getOutputParameterUsages_APIGatewayEntryLevelSystemCall().addAll((Collection<? extends VariableUsage>)newValue);
				return;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				getInputParameterUsages_APIGatewayEntryLevelSystemCall().clear();
				getInputParameterUsages_APIGatewayEntryLevelSystemCall().addAll((Collection<? extends VariableUsage>)newValue);
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
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				setOperationSignature__APIGatewayEntryLevelSystemCall((OperationSignature)null);
				return;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				getOutputParameterUsages_APIGatewayEntryLevelSystemCall().clear();
				return;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				getInputParameterUsages_APIGatewayEntryLevelSystemCall().clear();
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
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return operationSignature__APIGatewayEntryLevelSystemCall != null;
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return outputParameterUsages_APIGatewayEntryLevelSystemCall != null && !outputParameterUsages_APIGatewayEntryLevelSystemCall.isEmpty();
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL:
				return inputParameterUsages_APIGatewayEntryLevelSystemCall != null && !inputParameterUsages_APIGatewayEntryLevelSystemCall.isEmpty();
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //APIGatewayEntryLevelSystemCallImpl
