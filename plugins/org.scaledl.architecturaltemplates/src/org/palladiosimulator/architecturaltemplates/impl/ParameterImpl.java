/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Parameter;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Parameter</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ParameterImpl#getRole <em>Role</em>}
 * </li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ParameterImpl#getDataType
 * <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends EntityImpl implements Parameter {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Role getRole() {
        return (Role) this.eDynamicGet(ArchitecturaltemplatesPackage.PARAMETER__ROLE,
                ArchitecturaltemplatesPackage.Literals.PARAMETER__ROLE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRole(final Role newRole, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRole, ArchitecturaltemplatesPackage.PARAMETER__ROLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRole(final Role newRole) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.PARAMETER__ROLE,
                ArchitecturaltemplatesPackage.Literals.PARAMETER__ROLE, newRole);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EDataType getDataType() {
        return (EDataType) this.eDynamicGet(ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE,
                ArchitecturaltemplatesPackage.Literals.PARAMETER__DATA_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EDataType basicGetDataType() {
        return (EDataType) this.eDynamicGet(ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE,
                ArchitecturaltemplatesPackage.Literals.PARAMETER__DATA_TYPE, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDataType(final EDataType newDataType) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE,
                ArchitecturaltemplatesPackage.Literals.PARAMETER__DATA_TYPE, newDataType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
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
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
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
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
            return this.eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.ROLE__PARAMETERS,
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
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
            return this.getRole();
        case ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE:
            if (resolve) {
                return this.getDataType();
            }
            return this.basicGetDataType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
            this.setRole((Role) newValue);
            return;
        case ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE:
            this.setDataType((EDataType) newValue);
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
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
            this.setRole((Role) null);
            return;
        case ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE:
            this.setDataType((EDataType) null);
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
        case ArchitecturaltemplatesPackage.PARAMETER__ROLE:
            return this.getRole() != null;
        case ArchitecturaltemplatesPackage.PARAMETER__DATA_TYPE:
            return this.basicGetDataType() != null;
        }
        return super.eIsSet(featureID);
    }

} // ParameterImpl
