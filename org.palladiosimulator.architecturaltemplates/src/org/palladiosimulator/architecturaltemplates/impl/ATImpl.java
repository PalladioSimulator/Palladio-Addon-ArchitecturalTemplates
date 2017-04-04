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
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getReconfigurationRuleFolder <em>Reconfiguration Rule Folder</em>}</li>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getDefaultInstanceURI <em>Default Instance URI</em>}</li>
 *   <li>{@link org.palladiosimulator.architecturaltemplates.impl.ATImpl#getDependencies <em>Dependencies</em>}</li>
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
	 * The default value of the '{@link #getDefaultInstanceURI() <em>Default Instance URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDefaultInstanceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INSTANCE_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturaltemplatesPackage.Literals.AT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog getCatalog() {
		return (Catalog) eDynamicGet(ArchitecturaltemplatesPackage.AT__CATALOG,
				ArchitecturaltemplatesPackage.Literals.AT__CATALOG, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(Catalog newCatalog, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCatalog, ArchitecturaltemplatesPackage.AT__CATALOG, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalog(Catalog newCatalog) {
		eDynamicSet(ArchitecturaltemplatesPackage.AT__CATALOG, ArchitecturaltemplatesPackage.Literals.AT__CATALOG,
				newCatalog);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>) eDynamicGet(ArchitecturaltemplatesPackage.AT__ROLES,
				ArchitecturaltemplatesPackage.Literals.AT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconfigurationFolder getReconfigurationRuleFolder() {
		return (ReconfigurationFolder) eDynamicGet(ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER,
				ArchitecturaltemplatesPackage.Literals.AT__RECONFIGURATION_RULE_FOLDER, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationRuleFolder(ReconfigurationFolder newReconfigurationRuleFolder,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newReconfigurationRuleFolder,
				ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconfigurationRuleFolder(ReconfigurationFolder newReconfigurationRuleFolder) {
		eDynamicSet(ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER,
				ArchitecturaltemplatesPackage.Literals.AT__RECONFIGURATION_RULE_FOLDER, newReconfigurationRuleFolder);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String) eDynamicGet(ArchitecturaltemplatesPackage.AT__DOCUMENTATION,
				ArchitecturaltemplatesPackage.Literals.AT__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(ArchitecturaltemplatesPackage.AT__DOCUMENTATION,
				ArchitecturaltemplatesPackage.Literals.AT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultInstanceURI() {
		return (String) eDynamicGet(ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI,
				ArchitecturaltemplatesPackage.Literals.AT__DEFAULT_INSTANCE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInstanceURI(String newDefaultInstanceURI) {
		eDynamicSet(ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI,
				ArchitecturaltemplatesPackage.Literals.AT__DEFAULT_INSTANCE_URI, newDefaultInstanceURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<AT> getDependencies() {
		return (EList<AT>) eDynamicGet(ArchitecturaltemplatesPackage.AT__DEPENDENCIES,
				ArchitecturaltemplatesPackage.Literals.AT__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCatalog((Catalog) otherEnd, msgs);
		case ArchitecturaltemplatesPackage.AT__ROLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			return basicSetCatalog(null, msgs);
		case ArchitecturaltemplatesPackage.AT__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
			return basicSetReconfigurationRuleFolder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			return eInternalContainer().eInverseRemove(this, ArchitecturaltemplatesPackage.CATALOG__ATS, Catalog.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			return getCatalog();
		case ArchitecturaltemplatesPackage.AT__ROLES:
			return getRoles();
		case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
			return getReconfigurationRuleFolder();
		case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
			return getDocumentation();
		case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
			return getDefaultInstanceURI();
		case ArchitecturaltemplatesPackage.AT__DEPENDENCIES:
			return getDependencies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			setCatalog((Catalog) newValue);
			return;
		case ArchitecturaltemplatesPackage.AT__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends Role>) newValue);
			return;
		case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
			setReconfigurationRuleFolder((ReconfigurationFolder) newValue);
			return;
		case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
			setDefaultInstanceURI((String) newValue);
			return;
		case ArchitecturaltemplatesPackage.AT__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends AT>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			setCatalog((Catalog) null);
			return;
		case ArchitecturaltemplatesPackage.AT__ROLES:
			getRoles().clear();
			return;
		case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
			setReconfigurationRuleFolder((ReconfigurationFolder) null);
			return;
		case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
			setDefaultInstanceURI(DEFAULT_INSTANCE_URI_EDEFAULT);
			return;
		case ArchitecturaltemplatesPackage.AT__DEPENDENCIES:
			getDependencies().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArchitecturaltemplatesPackage.AT__CATALOG:
			return getCatalog() != null;
		case ArchitecturaltemplatesPackage.AT__ROLES:
			return !getRoles().isEmpty();
		case ArchitecturaltemplatesPackage.AT__RECONFIGURATION_RULE_FOLDER:
			return getReconfigurationRuleFolder() != null;
		case ArchitecturaltemplatesPackage.AT__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null
					: !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
		case ArchitecturaltemplatesPackage.AT__DEFAULT_INSTANCE_URI:
			return DEFAULT_INSTANCE_URI_EDEFAULT == null ? getDefaultInstanceURI() != null
					: !DEFAULT_INSTANCE_URI_EDEFAULT.equals(getDefaultInstanceURI());
		case ArchitecturaltemplatesPackage.AT__DEPENDENCIES:
			return !getDependencies().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ATImpl
