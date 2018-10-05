/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.PCMFileExtension;
import org.palladiosimulator.architecturaltemplates.PCMFileExtensions;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PCM File
 * Extension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.PCMFileExtensionImpl#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMFileExtensionImpl extends FileExtensionImpl implements PCMFileExtension {

    /**
     * The default value of the '{@link #getFileExtension() <em>File Extension</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFileExtension()
     * @generated
     * @ordered
     */
    protected static final PCMFileExtensions FILE_EXTENSION_EDEFAULT = PCMFileExtensions.SYSTEM;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMFileExtensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.PCM_FILE_EXTENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMFileExtensions getFileExtension() {
        return (PCMFileExtensions) this.eDynamicGet(ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.PCM_FILE_EXTENSION__FILE_EXTENSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFileExtension(final PCMFileExtensions newFileExtension) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.PCM_FILE_EXTENSION__FILE_EXTENSION, newFileExtension);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION__FILE_EXTENSION:
            return this.getFileExtension();
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
        case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION__FILE_EXTENSION:
            this.setFileExtension((PCMFileExtensions) newValue);
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
        case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION__FILE_EXTENSION:
            this.setFileExtension(FILE_EXTENSION_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION__FILE_EXTENSION:
            return this.getFileExtension() != FILE_EXTENSION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // PCMFileExtensionImpl
