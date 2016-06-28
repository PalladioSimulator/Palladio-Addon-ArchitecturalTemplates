/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMFileExtensions;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PCM Blackboard Completion Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.architecturaltemplates.impl.PCMBlackboardCompletionParameterImpl#getFileExtension
 * <em>File Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCMBlackboardCompletionParameterImpl extends CompletionParameterImpl
        implements PCMBlackboardCompletionParameter {

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
    protected PCMBlackboardCompletionParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.PCM_BLACKBOARD_COMPLETION_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMFileExtensions getFileExtension() {
        return (PCMFileExtensions) this.eDynamicGet(
                ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setFileExtension(final PCMFileExtensions newFileExtension) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION,
                ArchitecturaltemplatesPackage.Literals.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION,
                newFileExtension);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION:
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
        case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION:
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
        case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION:
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
        case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION:
            return this.getFileExtension() != FILE_EXTENSION_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // PCMBlackboardCompletionParameterImpl
