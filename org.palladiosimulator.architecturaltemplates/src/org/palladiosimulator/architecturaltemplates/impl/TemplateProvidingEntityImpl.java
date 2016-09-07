/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.TemplateProvidingEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Template Providing
 * Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.TemplateProvidingEntityImpl#getTemplateFileURI
 * <em>Template File URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TemplateProvidingEntityImpl extends CDOObjectImpl implements TemplateProvidingEntity {

    /**
     * The default value of the '{@link #getTemplateFileURI() <em>Template File URI</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTemplateFileURI()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_FILE_URI_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TemplateProvidingEntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.TEMPLATE_PROVIDING_ENTITY;
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
    public String getTemplateFileURI() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI,
                ArchitecturaltemplatesPackage.Literals.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTemplateFileURI(final String newTemplateFileURI) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI,
                ArchitecturaltemplatesPackage.Literals.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI,
                newTemplateFileURI);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ArchitecturaltemplatesPackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI:
            return this.getTemplateFileURI();
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
        case ArchitecturaltemplatesPackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI:
            this.setTemplateFileURI((String) newValue);
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
        case ArchitecturaltemplatesPackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI:
            this.setTemplateFileURI(TEMPLATE_FILE_URI_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI:
            return TEMPLATE_FILE_URI_EDEFAULT == null ? this.getTemplateFileURI() != null
                    : !TEMPLATE_FILE_URI_EDEFAULT.equals(this.getTemplateFileURI());
        }
        return super.eIsSet(featureID);
    }

} // TemplateProvidingEntityImpl
