/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.OCLConstraint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>OCL Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.OCLConstraintImpl#getConstraint
 * <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OCLConstraintImpl extends ConstraintImpl implements OCLConstraint {

    /**
     * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getConstraint()
     * @generated
     * @ordered
     */
    protected static final String CONSTRAINT_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OCLConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.OCL_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getConstraint() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.OCL_CONSTRAINT__CONSTRAINT,
                ArchitecturaltemplatesPackage.Literals.OCL_CONSTRAINT__CONSTRAINT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setConstraint(final String newConstraint) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.OCL_CONSTRAINT__CONSTRAINT,
                ArchitecturaltemplatesPackage.Literals.OCL_CONSTRAINT__CONSTRAINT, newConstraint);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.OCL_CONSTRAINT__CONSTRAINT:
            return this.getConstraint();
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
        case ArchitecturaltemplatesPackage.OCL_CONSTRAINT__CONSTRAINT:
            this.setConstraint((String) newValue);
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
        case ArchitecturaltemplatesPackage.OCL_CONSTRAINT__CONSTRAINT:
            this.setConstraint(CONSTRAINT_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.OCL_CONSTRAINT__CONSTRAINT:
            return CONSTRAINT_EDEFAULT == null ? this.getConstraint() != null
                    : !CONSTRAINT_EDEFAULT.equals(this.getConstraint());
        }
        return super.eIsSet(featureID);
    }

} // OCLConstraintImpl
