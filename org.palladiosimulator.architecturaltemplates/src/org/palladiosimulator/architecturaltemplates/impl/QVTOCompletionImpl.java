/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.QVTOCompletion;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>QVTO Completion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.QVTOCompletionImpl#getQvtoFileURI
 * <em>Qvto File URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QVTOCompletionImpl extends CompletionImpl implements QVTOCompletion {

    /**
     * The default value of the '{@link #getQvtoFileURI() <em>Qvto File URI</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getQvtoFileURI()
     * @generated
     * @ordered
     */
    protected static final String QVTO_FILE_URI_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QVTOCompletionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.QVTO_COMPLETION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getQvtoFileURI() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.QVTO_COMPLETION__QVTO_FILE_URI,
                ArchitecturaltemplatesPackage.Literals.QVTO_COMPLETION__QVTO_FILE_URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setQvtoFileURI(final String newQvtoFileURI) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.QVTO_COMPLETION__QVTO_FILE_URI,
                ArchitecturaltemplatesPackage.Literals.QVTO_COMPLETION__QVTO_FILE_URI, newQvtoFileURI);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.QVTO_COMPLETION__QVTO_FILE_URI:
            return this.getQvtoFileURI();
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
        case ArchitecturaltemplatesPackage.QVTO_COMPLETION__QVTO_FILE_URI:
            this.setQvtoFileURI((String) newValue);
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
        case ArchitecturaltemplatesPackage.QVTO_COMPLETION__QVTO_FILE_URI:
            this.setQvtoFileURI(QVTO_FILE_URI_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.QVTO_COMPLETION__QVTO_FILE_URI:
            return QVTO_FILE_URI_EDEFAULT == null ? this.getQvtoFileURI() != null
                    : !QVTO_FILE_URI_EDEFAULT.equals(this.getQvtoFileURI());
        }
        return super.eIsSet(featureID);
    }

} // QVTOCompletionImpl
