/**
 */
package org.scaledl.architecturaltemplates.type.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.scaledl.architecturaltemplates.type.AT;
import org.scaledl.architecturaltemplates.type.Completion;
import org.scaledl.architecturaltemplates.type.Constraint;
import org.scaledl.architecturaltemplates.type.Parameter;
import org.scaledl.architecturaltemplates.type.Role;
import org.scaledl.architecturaltemplates.type.TypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Role</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.scaledl.architecturaltemplates.type.impl.RoleImpl#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.impl.RoleImpl#getAT <em>AT</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.impl.RoleImpl#getConstraints
 * <em>Constraints</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.impl.RoleImpl#getStereotype
 * <em>Stereotype</em>}</li>
 * <li>{@link org.scaledl.architecturaltemplates.type.impl.RoleImpl#getCompletion
 * <em>Completion</em>}</li>
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
        return TypePackage.Literals.ROLE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Parameter> getParameters() {
        return (EList<Parameter>) this.eDynamicGet(TypePackage.ROLE__PARAMETERS, TypePackage.Literals.ROLE__PARAMETERS,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AT getAT() {
        return (AT) this.eDynamicGet(TypePackage.ROLE__AT, TypePackage.Literals.ROLE__AT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetAT(final AT newAT, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newAT, TypePackage.ROLE__AT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAT(final AT newAT) {
        this.eDynamicSet(TypePackage.ROLE__AT, TypePackage.Literals.ROLE__AT, newAT);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<Constraint> getConstraints() {
        return (EList<Constraint>) this.eDynamicGet(TypePackage.ROLE__CONSTRAINTS,
                TypePackage.Literals.ROLE__CONSTRAINTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stereotype getStereotype() {
        return (Stereotype) this.eDynamicGet(TypePackage.ROLE__STEREOTYPE, TypePackage.Literals.ROLE__STEREOTYPE, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Stereotype basicGetStereotype() {
        return (Stereotype) this.eDynamicGet(TypePackage.ROLE__STEREOTYPE, TypePackage.Literals.ROLE__STEREOTYPE, false,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStereotype(final Stereotype newStereotype) {
        this.eDynamicSet(TypePackage.ROLE__STEREOTYPE, TypePackage.Literals.ROLE__STEREOTYPE, newStereotype);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Completion getCompletion() {
        return (Completion) this.eDynamicGet(TypePackage.ROLE__COMPLETION, TypePackage.Literals.ROLE__COMPLETION, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetCompletion(final Completion newCompletion, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newCompletion, TypePackage.ROLE__COMPLETION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCompletion(final Completion newCompletion) {
        this.eDynamicSet(TypePackage.ROLE__COMPLETION, TypePackage.Literals.ROLE__COMPLETION, newCompletion);
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
        case TypePackage.ROLE__PARAMETERS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getParameters()).basicAdd(otherEnd, msgs);
        case TypePackage.ROLE__AT:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetAT((AT) otherEnd, msgs);
        case TypePackage.ROLE__CONSTRAINTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getConstraints()).basicAdd(otherEnd, msgs);
        case TypePackage.ROLE__COMPLETION:
            final Completion completion = this.getCompletion();
            if (completion != null) {
                msgs = ((InternalEObject) completion).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - TypePackage.ROLE__COMPLETION, null, msgs);
            }
            return this.basicSetCompletion((Completion) otherEnd, msgs);
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
        case TypePackage.ROLE__PARAMETERS:
            return ((InternalEList<?>) this.getParameters()).basicRemove(otherEnd, msgs);
        case TypePackage.ROLE__AT:
            return this.basicSetAT(null, msgs);
        case TypePackage.ROLE__CONSTRAINTS:
            return ((InternalEList<?>) this.getConstraints()).basicRemove(otherEnd, msgs);
        case TypePackage.ROLE__COMPLETION:
            return this.basicSetCompletion(null, msgs);
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
        case TypePackage.ROLE__AT:
            return this.eInternalContainer().eInverseRemove(this, TypePackage.AT__ROLES, AT.class, msgs);
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
        case TypePackage.ROLE__PARAMETERS:
            return this.getParameters();
        case TypePackage.ROLE__AT:
            return this.getAT();
        case TypePackage.ROLE__CONSTRAINTS:
            return this.getConstraints();
        case TypePackage.ROLE__STEREOTYPE:
            if (resolve) {
                return this.getStereotype();
            }
            return this.basicGetStereotype();
        case TypePackage.ROLE__COMPLETION:
            return this.getCompletion();
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
        case TypePackage.ROLE__PARAMETERS:
            this.getParameters().clear();
            this.getParameters().addAll((Collection<? extends Parameter>) newValue);
            return;
        case TypePackage.ROLE__AT:
            this.setAT((AT) newValue);
            return;
        case TypePackage.ROLE__CONSTRAINTS:
            this.getConstraints().clear();
            this.getConstraints().addAll((Collection<? extends Constraint>) newValue);
            return;
        case TypePackage.ROLE__STEREOTYPE:
            this.setStereotype((Stereotype) newValue);
            return;
        case TypePackage.ROLE__COMPLETION:
            this.setCompletion((Completion) newValue);
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
        case TypePackage.ROLE__PARAMETERS:
            this.getParameters().clear();
            return;
        case TypePackage.ROLE__AT:
            this.setAT((AT) null);
            return;
        case TypePackage.ROLE__CONSTRAINTS:
            this.getConstraints().clear();
            return;
        case TypePackage.ROLE__STEREOTYPE:
            this.setStereotype((Stereotype) null);
            return;
        case TypePackage.ROLE__COMPLETION:
            this.setCompletion((Completion) null);
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
        case TypePackage.ROLE__PARAMETERS:
            return !this.getParameters().isEmpty();
        case TypePackage.ROLE__AT:
            return this.getAT() != null;
        case TypePackage.ROLE__CONSTRAINTS:
            return !this.getConstraints().isEmpty();
        case TypePackage.ROLE__STEREOTYPE:
            return this.basicGetStereotype() != null;
        case TypePackage.ROLE__COMPLETION:
            return this.getCompletion() != null;
        }
        return super.eIsSet(featureID);
    }

} // RoleImpl
