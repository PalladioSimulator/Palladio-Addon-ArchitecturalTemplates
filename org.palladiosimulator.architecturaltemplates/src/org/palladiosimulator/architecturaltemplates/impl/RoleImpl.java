/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Completion;
import org.palladiosimulator.architecturaltemplates.Constraint;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Role</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.RoleImpl#getAT <em>AT</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.RoleImpl#getStereotype
 * <em>Stereotype</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.RoleImpl#getCompletion
 * <em>Completion</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.RoleImpl#getConstraints
 * <em>Constraints</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.RoleImpl#getSuperRoles <em>Super
 * Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends EntityImpl implements Role {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.ROLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AT getAT() {
        return (AT) this.eDynamicGet(ArchitecturaltemplatesPackage.ROLE__AT,
                ArchitecturaltemplatesPackage.Literals.ROLE__AT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAT(final AT newAT, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newAT, ArchitecturaltemplatesPackage.ROLE__AT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAT(final AT newAT) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.ROLE__AT, ArchitecturaltemplatesPackage.Literals.ROLE__AT,
                newAT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public EList<Constraint> getConstraints() {
        return (EList<Constraint>) this.eDynamicGet(ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS,
                ArchitecturaltemplatesPackage.Literals.ROLE__CONSTRAINTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public EList<Role> getSuperRoles() {
        return (EList<Role>) this.eDynamicGet(ArchitecturaltemplatesPackage.ROLE__SUPER_ROLES,
                ArchitecturaltemplatesPackage.Literals.ROLE__SUPER_ROLES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stereotype getStereotype() {
        return (Stereotype) this.eDynamicGet(ArchitecturaltemplatesPackage.ROLE__STEREOTYPE,
                ArchitecturaltemplatesPackage.Literals.ROLE__STEREOTYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Stereotype basicGetStereotype() {
        return (Stereotype) this.eDynamicGet(ArchitecturaltemplatesPackage.ROLE__STEREOTYPE,
                ArchitecturaltemplatesPackage.Literals.ROLE__STEREOTYPE, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStereotype(final Stereotype newStereotype) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.ROLE__STEREOTYPE,
                ArchitecturaltemplatesPackage.Literals.ROLE__STEREOTYPE, newStereotype);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Completion getCompletion() {
        return (Completion) this.eDynamicGet(ArchitecturaltemplatesPackage.ROLE__COMPLETION,
                ArchitecturaltemplatesPackage.Literals.ROLE__COMPLETION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetCompletion(final Completion newCompletion, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newCompletion, ArchitecturaltemplatesPackage.ROLE__COMPLETION,
                msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCompletion(final Completion newCompletion) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.ROLE__COMPLETION,
                ArchitecturaltemplatesPackage.Literals.ROLE__COMPLETION, newCompletion);
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetAT((AT) otherEnd, msgs);
        case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
            final Completion completion = this.getCompletion();
            if (completion != null) {
                msgs = ((InternalEObject) completion).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - ArchitecturaltemplatesPackage.ROLE__COMPLETION, null, msgs);
            }
            return this.basicSetCompletion((Completion) otherEnd, msgs);
        case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getConstraints()).basicAdd(otherEnd, msgs);
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            return this.basicSetAT(null, msgs);
        case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
            return this.basicSetCompletion(null, msgs);
        case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
            return ((InternalEList<?>) this.getConstraints()).basicRemove(otherEnd, msgs);
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            return this.eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.AT__ROLES, AT.class,
                    msgs);
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            return this.getAT();
        case ArchitecturaltemplatesPackage.ROLE__STEREOTYPE:
            if (resolve) {
                return this.getStereotype();
            }
            return this.basicGetStereotype();
        case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
            return this.getCompletion();
        case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
            return this.getConstraints();
        case ArchitecturaltemplatesPackage.ROLE__SUPER_ROLES:
            return this.getSuperRoles();
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            this.setAT((AT) newValue);
            return;
        case ArchitecturaltemplatesPackage.ROLE__STEREOTYPE:
            this.setStereotype((Stereotype) newValue);
            return;
        case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
            this.setCompletion((Completion) newValue);
            return;
        case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
            this.getConstraints().clear();
            this.getConstraints().addAll((Collection<? extends Constraint>) newValue);
            return;
        case ArchitecturaltemplatesPackage.ROLE__SUPER_ROLES:
            this.getSuperRoles().clear();
            this.getSuperRoles().addAll((Collection<? extends Role>) newValue);
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            this.setAT((AT) null);
            return;
        case ArchitecturaltemplatesPackage.ROLE__STEREOTYPE:
            this.setStereotype((Stereotype) null);
            return;
        case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
            this.setCompletion((Completion) null);
            return;
        case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
            this.getConstraints().clear();
            return;
        case ArchitecturaltemplatesPackage.ROLE__SUPER_ROLES:
            this.getSuperRoles().clear();
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
        case ArchitecturaltemplatesPackage.ROLE__AT:
            return this.getAT() != null;
        case ArchitecturaltemplatesPackage.ROLE__STEREOTYPE:
            return this.basicGetStereotype() != null;
        case ArchitecturaltemplatesPackage.ROLE__COMPLETION:
            return this.getCompletion() != null;
        case ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS:
            return !this.getConstraints().isEmpty();
        case ArchitecturaltemplatesPackage.ROLE__SUPER_ROLES:
            return !this.getSuperRoles().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // RoleImpl
