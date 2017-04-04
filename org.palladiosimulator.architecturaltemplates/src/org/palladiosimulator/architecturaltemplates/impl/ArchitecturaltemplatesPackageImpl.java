/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.types.TypesPackage;
import org.eclipse.ocl.utilities.UtilitiesPackage;
import org.modelversioning.emfprofile.EMFProfilePackage;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesFactory;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Catalog;
import org.palladiosimulator.architecturaltemplates.Completion;
import org.palladiosimulator.architecturaltemplates.CompletionParameter;
import org.palladiosimulator.architecturaltemplates.Constraint;
import org.palladiosimulator.architecturaltemplates.FileExtension;
import org.palladiosimulator.architecturaltemplates.GenericFileExtension;
import org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.OCLConstraint;
import org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMFileExtension;
import org.palladiosimulator.architecturaltemplates.PCMFileExtensions;
import org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.QVTOCompletion;
import org.palladiosimulator.architecturaltemplates.ReconfigurationFolder;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturaltemplatesPackageImpl extends EPackageImpl implements ArchitecturaltemplatesPackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclConstraintEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvtoCompletionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmBlackboardCompletionParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmTemplateCompletionParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmOutputCompletionParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reconfigurationFolderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isolatedPCMTemplateCompletionParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmCompletionParameterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileExtensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcmFileExtensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericFileExtensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pcmFileExtensionsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitecturaltemplatesPackageImpl() {
		super(eNS_URI, ArchitecturaltemplatesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArchitecturaltemplatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitecturaltemplatesPackage init() {
		if (isInited)
			return (ArchitecturaltemplatesPackage) EPackage.Registry.INSTANCE
					.getEPackage(ArchitecturaltemplatesPackage.eNS_URI);

		// Obtain or create and register package
		ArchitecturaltemplatesPackageImpl theArchitecturaltemplatesPackage = (ArchitecturaltemplatesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ArchitecturaltemplatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ArchitecturaltemplatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFProfilePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UtilitiesPackage.eINSTANCE.eClass();
		ExpressionsPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArchitecturaltemplatesPackage.createPackageContents();

		// Initialize created meta-data
		theArchitecturaltemplatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitecturaltemplatesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitecturaltemplatesPackage.eNS_URI, theArchitecturaltemplatesPackage);
		return theArchitecturaltemplatesPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAT() {
		return atEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAT_Catalog() {
		return (EReference) atEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAT_Roles() {
		return (EReference) atEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAT_ReconfigurationRuleFolder() {
		return (EReference) atEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAT_Documentation() {
		return (EAttribute) atEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAT_DefaultInstanceURI() {
		return (EAttribute) atEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAT_Dependencies() {
		return (EReference) atEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Role() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstraint_Expression() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_ATs() {
		return (EReference) catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_AT() {
		return (EReference) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Constraints() {
		return (EReference) roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_SuperRoles() {
		return (EReference) roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_RoleIncludingInherited() {
		return (EReference) roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ConstraintsIncludingInherited() {
		return (EReference) roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_CompletionIncludingInherited() {
		return (EReference) roleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Stereotype() {
		return (EReference) roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Completion() {
		return (EReference) roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOCLConstraint() {
		return oclConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQVTOCompletion() {
		return qvtoCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompletion() {
		return completionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompletion_Parameters() {
		return (EReference) completionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompletion_Role() {
		return (EReference) completionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompletion_CompletionFileURI() {
		return (EAttribute) completionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompletionParameter() {
		return completionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompletionParameter_Completion() {
		return (EReference) completionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMBlackboardCompletionParameter() {
		return pcmBlackboardCompletionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMTemplateCompletionParameter() {
		return pcmTemplateCompletionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPCMTemplateCompletionParameter_TemplateFileURI() {
		return (EAttribute) pcmTemplateCompletionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMOutputCompletionParameter() {
		return pcmOutputCompletionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReconfigurationFolder() {
		return reconfigurationFolderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReconfigurationFolder_FolderURI() {
		return (EAttribute) reconfigurationFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIsolatedPCMTemplateCompletionParameter() {
		return isolatedPCMTemplateCompletionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMCompletionParameter() {
		return pcmCompletionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPCMCompletionParameter_FileExtension() {
		return (EReference) pcmCompletionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileExtension() {
		return fileExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPCMFileExtension() {
		return pcmFileExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPCMFileExtension_FileExtension() {
		return (EAttribute) pcmFileExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericFileExtension() {
		return genericFileExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericFileExtension_FileExtension() {
		return (EAttribute) genericFileExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPCMFileExtensions() {
		return pcmFileExtensionsEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitecturaltemplatesFactory getArchitecturaltemplatesFactory() {
		return (ArchitecturaltemplatesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		atEClass = createEClass(AT);
		createEReference(atEClass, AT__CATALOG);
		createEReference(atEClass, AT__ROLES);
		createEReference(atEClass, AT__RECONFIGURATION_RULE_FOLDER);
		createEAttribute(atEClass, AT__DOCUMENTATION);
		createEAttribute(atEClass, AT__DEFAULT_INSTANCE_URI);
		createEReference(atEClass, AT__DEPENDENCIES);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__ROLE);
		createEAttribute(constraintEClass, CONSTRAINT__EXPRESSION);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__ATS);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__AT);
		createEReference(roleEClass, ROLE__STEREOTYPE);
		createEReference(roleEClass, ROLE__COMPLETION);
		createEReference(roleEClass, ROLE__CONSTRAINTS);
		createEReference(roleEClass, ROLE__SUPER_ROLES);
		createEReference(roleEClass, ROLE__ROLE_INCLUDING_INHERITED);
		createEReference(roleEClass, ROLE__CONSTRAINTS_INCLUDING_INHERITED);
		createEReference(roleEClass, ROLE__COMPLETION_INCLUDING_INHERITED);

		oclConstraintEClass = createEClass(OCL_CONSTRAINT);

		qvtoCompletionEClass = createEClass(QVTO_COMPLETION);

		completionEClass = createEClass(COMPLETION);
		createEReference(completionEClass, COMPLETION__PARAMETERS);
		createEReference(completionEClass, COMPLETION__ROLE);
		createEAttribute(completionEClass, COMPLETION__COMPLETION_FILE_URI);

		completionParameterEClass = createEClass(COMPLETION_PARAMETER);
		createEReference(completionParameterEClass, COMPLETION_PARAMETER__COMPLETION);

		pcmBlackboardCompletionParameterEClass = createEClass(PCM_BLACKBOARD_COMPLETION_PARAMETER);

		pcmTemplateCompletionParameterEClass = createEClass(PCM_TEMPLATE_COMPLETION_PARAMETER);
		createEAttribute(pcmTemplateCompletionParameterEClass, PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI);

		pcmOutputCompletionParameterEClass = createEClass(PCM_OUTPUT_COMPLETION_PARAMETER);

		reconfigurationFolderEClass = createEClass(RECONFIGURATION_FOLDER);
		createEAttribute(reconfigurationFolderEClass, RECONFIGURATION_FOLDER__FOLDER_URI);

		isolatedPCMTemplateCompletionParameterEClass = createEClass(ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER);

		pcmCompletionParameterEClass = createEClass(PCM_COMPLETION_PARAMETER);
		createEReference(pcmCompletionParameterEClass, PCM_COMPLETION_PARAMETER__FILE_EXTENSION);

		fileExtensionEClass = createEClass(FILE_EXTENSION);

		pcmFileExtensionEClass = createEClass(PCM_FILE_EXTENSION);
		createEAttribute(pcmFileExtensionEClass, PCM_FILE_EXTENSION__FILE_EXTENSION);

		genericFileExtensionEClass = createEClass(GENERIC_FILE_EXTENSION);
		createEAttribute(genericFileExtensionEClass, GENERIC_FILE_EXTENSION__FILE_EXTENSION);

		// Create enums
		pcmFileExtensionsEEnum = createEEnum(PCM_FILE_EXTENSIONS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EMFProfilePackage theEMFProfilePackage = (EMFProfilePackage) EPackage.Registry.INSTANCE
				.getEPackage(EMFProfilePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atEClass.getESuperTypes().add(theEntityPackage.getEntity());
		constraintEClass.getESuperTypes().add(theEntityPackage.getEntity());
		catalogEClass.getESuperTypes().add(theEntityPackage.getEntity());
		roleEClass.getESuperTypes().add(theEntityPackage.getEntity());
		oclConstraintEClass.getESuperTypes().add(this.getConstraint());
		qvtoCompletionEClass.getESuperTypes().add(this.getCompletion());
		pcmBlackboardCompletionParameterEClass.getESuperTypes().add(this.getPCMCompletionParameter());
		pcmTemplateCompletionParameterEClass.getESuperTypes().add(this.getPCMCompletionParameter());
		pcmOutputCompletionParameterEClass.getESuperTypes().add(this.getPCMCompletionParameter());
		isolatedPCMTemplateCompletionParameterEClass.getESuperTypes().add(this.getPCMTemplateCompletionParameter());
		pcmCompletionParameterEClass.getESuperTypes().add(this.getCompletionParameter());
		pcmFileExtensionEClass.getESuperTypes().add(this.getFileExtension());
		genericFileExtensionEClass.getESuperTypes().add(this.getFileExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(atEClass, org.palladiosimulator.architecturaltemplates.AT.class, "AT", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAT_Catalog(), this.getCatalog(), this.getCatalog_ATs(), "catalog", null, 1, 1,
				org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAT_Roles(), this.getRole(), this.getRole_AT(), "roles", null, 0, -1,
				org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAT_ReconfigurationRuleFolder(), this.getReconfigurationFolder(), null,
				"reconfigurationRuleFolder", null, 0, 1, org.palladiosimulator.architecturaltemplates.AT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAT_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1,
				org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAT_DefaultInstanceURI(), ecorePackage.getEString(), "defaultInstanceURI", null, 0, 1,
				org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAT_Dependencies(), this.getAT(), null, "dependencies", null, 0, -1,
				org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Role(), this.getRole(), this.getRole_Constraints(), "role", null, 1, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Expression(), ecorePackage.getEString(), "expression", null, 1, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_ATs(), this.getAT(), this.getAT_Catalog(), "ATs", null, 0, -1, Catalog.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_AT(), this.getAT(), this.getAT_Roles(), "AT", null, 1, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRole_Stereotype(), theEMFProfilePackage.getStereotype(), null, "stereotype", null, 1, 1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Completion(), this.getCompletion(), this.getCompletion_Role(), "completion", null, 0, 1,
				Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Constraints(), this.getConstraint(), this.getConstraint_Role(), "constraints", null, 0,
				-1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_SuperRoles(), this.getRole(), null, "superRoles", null, 0, -1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRole_RoleIncludingInherited(), this.getRole(), null, "roleIncludingInherited", null, 1, -1,
				Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ConstraintsIncludingInherited(), this.getConstraint(), null,
				"constraintsIncludingInherited", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_CompletionIncludingInherited(), this.getCompletion(), null,
				"completionIncludingInherited", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(oclConstraintEClass, OCLConstraint.class, "OCLConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(qvtoCompletionEClass, QVTOCompletion.class, "QVTOCompletion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(completionEClass, Completion.class, "Completion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompletion_Parameters(), this.getCompletionParameter(),
				this.getCompletionParameter_Completion(), "parameters", null, 1, -1, Completion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCompletion_Role(), this.getRole(), this.getRole_Completion(), "role", null, 1, 1,
				Completion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletion_CompletionFileURI(), theEcorePackage.getEString(), "completionFileURI", null, 1, 1,
				Completion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(completionParameterEClass, CompletionParameter.class, "CompletionParameter", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompletionParameter_Completion(), this.getCompletion(), this.getCompletion_Parameters(),
				"completion", null, 1, 1, CompletionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmBlackboardCompletionParameterEClass, PCMBlackboardCompletionParameter.class,
				"PCMBlackboardCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcmTemplateCompletionParameterEClass, PCMTemplateCompletionParameter.class,
				"PCMTemplateCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCMTemplateCompletionParameter_TemplateFileURI(), theEcorePackage.getEString(),
				"templateFileURI", null, 1, 1, PCMTemplateCompletionParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcmOutputCompletionParameterEClass, PCMOutputCompletionParameter.class,
				"PCMOutputCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reconfigurationFolderEClass, ReconfigurationFolder.class, "ReconfigurationFolder", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReconfigurationFolder_FolderURI(), theEcorePackage.getEString(), "folderURI", null, 1, 1,
				ReconfigurationFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isolatedPCMTemplateCompletionParameterEClass, IsolatedPCMTemplateCompletionParameter.class,
				"IsolatedPCMTemplateCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcmCompletionParameterEClass, PCMCompletionParameter.class, "PCMCompletionParameter", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCMCompletionParameter_FileExtension(), this.getFileExtension(), null, "fileExtension", null,
				1, 1, PCMCompletionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileExtensionEClass, FileExtension.class, "FileExtension", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcmFileExtensionEClass, PCMFileExtension.class, "PCMFileExtension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCMFileExtension_FileExtension(), this.getPCMFileExtensions(), "fileExtension", "system", 1,
				1, PCMFileExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericFileExtensionEClass, GenericFileExtension.class, "GenericFileExtension", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericFileExtension_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 1, 1,
				GenericFileExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pcmFileExtensionsEEnum, PCMFileExtensions.class, "PCMFileExtensions");
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.SYSTEM);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.ALLOCATION);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.RESOURCEENVIRONMENT);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.REPOSITORY);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.USAGEMODEL);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.RESOURCETYPE);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.MONITORREPOSITORY);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.PCMMEASURINGPOINT);
		addEEnumLiteral(pcmFileExtensionsEEnum, PCMFileExtensions.SERVICELEVELOBJECTIVE);

		// Create resource
		createResource(eNS_URI);
	}

} // ArchitecturaltemplatesPackageImpl
