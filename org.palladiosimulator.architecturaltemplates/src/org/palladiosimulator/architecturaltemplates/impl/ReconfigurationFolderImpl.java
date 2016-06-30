/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.ReconfigurationFolder;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Reconfiguration Folder</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.architecturaltemplates.impl.ReconfigurationFolderImpl#getFolderURI
 * <em>Folder URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationFolderImpl extends CDOObjectImpl implements ReconfigurationFolder {

    /**
     * The default value of the '{@link #getFolderURI() <em>Folder URI</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFolderURI()
     * @generated
     * @ordered
     */
    protected static final String FOLDER_URI_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ReconfigurationFolderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.RECONFIGURATION_FOLDER;
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
    public String getFolderURI() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER__FOLDER_URI,
                ArchitecturaltemplatesPackage.Literals.RECONFIGURATION_FOLDER__FOLDER_URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFolderURI(final String newFolderURI) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER__FOLDER_URI,
                ArchitecturaltemplatesPackage.Literals.RECONFIGURATION_FOLDER__FOLDER_URI, newFolderURI);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER__FOLDER_URI:
            return this.getFolderURI();
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
        case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER__FOLDER_URI:
            this.setFolderURI((String) newValue);
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
        case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER__FOLDER_URI:
            this.setFolderURI(FOLDER_URI_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER__FOLDER_URI:
            return FOLDER_URI_EDEFAULT == null ? this.getFolderURI() != null
                    : !FOLDER_URI_EDEFAULT.equals(this.getFolderURI());
        }
        return super.eIsSet(featureID);
    }

} // ReconfigurationFolderImpl
