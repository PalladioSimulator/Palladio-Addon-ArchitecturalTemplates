/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Constraint;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Constraint</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ConstraintImpl#getRole
 * <em>Role</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ConstraintImpl#getExpression
 * <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConstraintImpl extends EntityImpl implements Constraint {

    /**
     * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected static final String EXPRESSION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Role getRole() {
        return (Role) this.eDynamicGet(ArchitecturaltemplatesPackage.CONSTRAINT__ROLE,
                ArchitecturaltemplatesPackage.Literals.CONSTRAINT__ROLE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRole(final Role newRole, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRole, ArchitecturaltemplatesPackage.CONSTRAINT__ROLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRole(final Role newRole) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.CONSTRAINT__ROLE,
                ArchitecturaltemplatesPackage.Literals.CONSTRAINT__ROLE, newRole);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getExpression() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.CONSTRAINT__EXPRESSION,
                ArchitecturaltemplatesPackage.Literals.CONSTRAINT__EXPRESSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setExpression(final String newExpression) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.CONSTRAINT__EXPRESSION,
                ArchitecturaltemplatesPackage.Literals.CONSTRAINT__EXPRESSION, newExpression);
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
            return this.eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.ROLE__CONSTRAINTS,
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
            return this.getRole();
        case ArchitecturaltemplatesPackage.CONSTRAINT__EXPRESSION:
            return this.getExpression();
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
            this.setRole((Role) newValue);
            return;
        case ArchitecturaltemplatesPackage.CONSTRAINT__EXPRESSION:
            this.setExpression((String) newValue);
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
            this.setRole((Role) null);
            return;
        case ArchitecturaltemplatesPackage.CONSTRAINT__EXPRESSION:
            this.setExpression(EXPRESSION_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.CONSTRAINT__ROLE:
            return this.getRole() != null;
        case ArchitecturaltemplatesPackage.CONSTRAINT__EXPRESSION:
            return EXPRESSION_EDEFAULT == null ? this.getExpression() != null
                    : !EXPRESSION_EDEFAULT.equals(this.getExpression());
        }
        return super.eIsSet(featureID);
    }

} // ConstraintImpl
