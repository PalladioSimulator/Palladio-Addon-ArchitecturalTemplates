/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Catalog;
import org.palladiosimulator.architecturaltemplates.ReconfigurationFolder;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>AT</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getCatalog
 * <em>Catalog</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getRoles <em>Roles</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getReconfigurationRuleFolder
 * <em>Reconfiguration Rule Folder</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getDocumentation
 * <em>Documentation</em>}</li>
 * <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getDefaultInstanceURI
 * <em>Default Instance URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATImpl extends EntityImpl implements AT {

    /**
     * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected static final String DOCUMENTATION_EDEFAULT = null;
    /**
     * The default value of the '{@link #getDefaultInstanceURI() <em>Default Instance URI</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDefaultInstanceURI()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_INSTANCE_URI_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ATImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ArchitecturaltemplatesPackage.Literals.AT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Catalog getCatalog() {
        return (Catalog) this.eDynamicGet(ArchitecturaltemplatesPackage.AT__CATALOG,
                ArchitecturaltemplatesPackage.Literals.AT__CATALOG, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetCatalog(final Catalog newCatalog, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newCatalog, ArchitecturaltemplatesPackage.AT__CATALOG, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCatalog(final Catalog newCatalog) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.AT__CATALOG, ArchitecturaltemplatesPackage.Literals.AT__CATALOG,
                newCatalog);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public EList<Role> getRoles() {
        return (EList<Role>) this.eDynamicGet(ArchitecturaltemplatesPackage.AT__ROLES,
                ArchitecturaltemplatesPackage.Literals.AT__ROLES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ReconfigurationFolder getReconfigurationRuleFolder() {
        return (ReconfigurationFolder) this.eDynamicGet(ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER,
                ArchitecturaltemplatesPackage.Literals.AT__RECONFIGURATION_RULE_FOLDER, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetReconfigurationRuleFolder(final ReconfigurationFolder newReconfigurationRuleFolder,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newReconfigurationRuleFolder,
                ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setReconfigurationRuleFolder(final ReconfigurationFolder newReconfigurationRuleFolder) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER,
                ArchitecturaltemplatesPackage.Literals.AT__RECONFIGURATION_RULE_FOLDER, newReconfigurationRuleFolder);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDocumentation() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.AT__DOCUMENTATION,
                ArchitecturaltemplatesPackage.Literals.AT__DOCUMENTATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDocumentation(final String newDocumentation) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.AT__DOCUMENTATION,
                ArchitecturaltemplatesPackage.Literals.AT__DOCUMENTATION, newDocumentation);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getDefaultInstanceURI() {
        return (String) this.eDynamicGet(ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI,
                ArchitecturaltemplatesPackage.Literals.AT__DEFAULT_INSTANCE_URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDefaultInstanceURI(final String newDefaultInstanceURI) {
        this.eDynamicSet(ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI,
                ArchitecturaltemplatesPackage.Literals.AT__DEFAULT_INSTANCE_URI, newDefaultInstanceURI);
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetCatalog((Catalog) otherEnd, msgs);
        case ArchitecturaltemplatesPackage.AT__ROLES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getRoles()).basicAdd(otherEnd, msgs);
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            return this.basicSetCatalog(null, msgs);
        case ArchitecturaltemplatesPackage.AT__ROLES:
            return ((InternalEList<?>) this.getRoles()).basicRemove(otherEnd, msgs);
        case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
            return this.basicSetReconfigurationRuleFolder(null, msgs);
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            return this.eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.CATALOG__ATS,
                    Catalog.class, msgs);
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            return this.getCatalog();
        case ArchitecturaltemplatesPackage.AT__ROLES:
            return this.getRoles();
        case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
            return this.getReconfigurationRuleFolder();
        case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
            return this.getDocumentation();
        case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
            return this.getDefaultInstanceURI();
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            this.setCatalog((Catalog) newValue);
            return;
        case ArchitecturaltemplatesPackage.AT__ROLES:
            this.getRoles().clear();
            this.getRoles().addAll((Collection<? extends Role>) newValue);
            return;
        case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
            this.setReconfigurationRuleFolder((ReconfigurationFolder) newValue);
            return;
        case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
            this.setDocumentation((String) newValue);
            return;
        case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
            this.setDefaultInstanceURI((String) newValue);
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            this.setCatalog((Catalog) null);
            return;
        case ArchitecturaltemplatesPackage.AT__ROLES:
            this.getRoles().clear();
            return;
        case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
            this.setReconfigurationRuleFolder((ReconfigurationFolder) null);
            return;
        case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
            this.setDocumentation(DOCUMENTATION_EDEFAULT);
            return;
        case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
            this.setDefaultInstanceURI(DEFAULT_INSTANCE_URI_EDEFAULT);
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
        case ArchitecturaltemplatesPackage.AT__CATALOG:
            return this.getCatalog() != null;
        case ArchitecturaltemplatesPackage.AT__ROLES:
            return !this.getRoles().isEmpty();
        case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
            return this.getReconfigurationRuleFolder() != null;
        case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
            return DOCUMENTATION_EDEFAULT == null ? this.getDocumentation() != null
                    : !DOCUMENTATION_EDEFAULT.equals(this.getDocumentation());
        case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
            return DEFAULT_INSTANCE_URI_EDEFAULT == null ? this.getDefaultInstanceURI() != null
                    : !DEFAULT_INSTANCE_URI_EDEFAULT.equals(this.getDefaultInstanceURI());
        }
        return super.eIsSet(featureID);
    }

} // ATImpl
