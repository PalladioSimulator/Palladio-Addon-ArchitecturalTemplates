/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Completion;
import org.palladiosimulator.architecturaltemplates.CompletionParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Completion
 * Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.CompletionParameterImpl#getCompletion <em>Completion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompletionParameterImpl extends CDOObjectImpl implements CompletionParameter {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturaltemplatesPackage.Literals.COMPLETION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Completion getCompletion() {
		return (Completion) eDynamicGet(ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION,
				ArchitecturaltemplatesPackage.Literals.COMPLETION_PARAMETER__COMPLETION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletion(Completion newCompletion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCompletion,
				ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletion(Completion newCompletion) {
		eDynamicSet(ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION,
				ArchitecturaltemplatesPackage.Literals.COMPLETION_PARAMETER__COMPLETION, newCompletion);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCompletion((Completion) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			return basicSetCompletion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			return eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS,
					Completion.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			return getCompletion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			setCompletion((Completion) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			setCompletion((Completion) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER__COMPLETION:
			return getCompletion() != null;
		}
		return super.eIsSet(featureID);
	}

} // CompletionParameterImpl
