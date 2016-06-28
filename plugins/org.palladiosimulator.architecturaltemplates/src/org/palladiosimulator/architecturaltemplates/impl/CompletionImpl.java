/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Completion;
import org.palladiosimulator.architecturaltemplates.CompletionParameter;
import org.palladiosimulator.architecturaltemplates.Role;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Completion</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.CompletionImpl#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.CompletionImpl#getRole <em>Role</em>
 * }</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompletionImpl extends CDOObjectImpl implements Completion {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CompletionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.COMPLETION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public EList<CompletionParameter> getParameters() {
        return (EList<CompletionParameter>) this.eDynamicGet(ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS,
                ArchitecturaltemplatesPackage.Literals.COMPLETION__PARAMETERS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Role getRole() {
        return (Role) this.eDynamicGet(ArchitecturaltemplatesPackage.COMPLETION__ROLE,
                ArchitecturaltemplatesPackage.Literals.COMPLETION__ROLE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRole(final Role newRole, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRole, ArchitecturaltemplatesPackage.COMPLETION__ROLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRole(final Role newRole) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.COMPLETION__ROLE,
                ArchitecturaltemplatesPackage.Literals.COMPLETION__ROLE, newRole);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getParameters()).basicAdd(otherEnd, msgs);
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetRole((Role) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS:
            return ((InternalEList<?>) this.getParameters()).basicRemove(otherEnd, msgs);
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            return this.basicSetRole(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            return this.eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.ROLE__COMPLETION,
                    Role.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS:
            return this.getParameters();
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            return this.getRole();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS:
            this.getParameters().clear();
            this.getParameters().addAll((Collection<? extends CompletionParameter>) newValue);
            return;
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            this.setRole((Role) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS:
            this.getParameters().clear();
            return;
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            this.setRole((Role) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.COMPLETION__PARAMETERS:
            return !this.getParameters().isEmpty();
        case ArchitecturaltemplatesPackage.COMPLETION__ROLE:
            return this.getRole() != null;
        }
        return super.eIsSet(featureID);
    }

} // CompletionImpl
