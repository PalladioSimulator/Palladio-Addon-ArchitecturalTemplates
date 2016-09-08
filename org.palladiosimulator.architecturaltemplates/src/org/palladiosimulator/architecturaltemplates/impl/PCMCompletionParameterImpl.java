/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.FileExtension;
import org.palladiosimulator.architecturaltemplates.PCMCompletionParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PCM Completion
 * Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.PCMCompletionParameterImpl#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PCMCompletionParameterImpl extends CompletionParameterImpl implements PCMCompletionParameter {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected PCMCompletionParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.PCM_COMPLETION_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FileExtension getFileExtension() {
        return (FileExtension) this.eDynamicGet(ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.PCM_COMPLETION_PARAMETER__FILE_EXTENSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetFileExtension(final FileExtension newFileExtension, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newFileExtension,
                ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFileExtension(final FileExtension newFileExtension) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.PCM_COMPLETION_PARAMETER__FILE_EXTENSION, newFileExtension);
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
        case ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION:
            return this.basicSetFileExtension(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION:
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
        case ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION:
            this.setFileExtension((FileExtension) newValue);
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
        case ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION:
            this.setFileExtension((FileExtension) null);
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
        case ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER__FILE_EXTENSION:
            return this.getFileExtension() != null;
        }
        return super.eIsSet(featureID);
    }

} // PCMCompletionParameterImpl
