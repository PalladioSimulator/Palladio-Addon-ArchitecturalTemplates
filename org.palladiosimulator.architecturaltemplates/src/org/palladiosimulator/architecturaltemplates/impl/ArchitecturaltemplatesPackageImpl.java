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
 *
 * @generated
 */
public class ArchitecturaltemplatesPackageImpl extends EPackageImpl implements ArchitecturaltemplatesPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass atEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass constraintEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass catalogEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass roleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass oclConstraintEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass qvtoCompletionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass completionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass completionParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pcmBlackboardCompletionParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pcmTemplateCompletionParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pcmOutputCompletionParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass reconfigurationFolderEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass isolatedPCMTemplateCompletionParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pcmCompletionParameterEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fileExtensionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pcmFileExtensionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass genericFileExtensionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum pcmFileExtensionsEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link ArchitecturaltemplatesPackage#eINSTANCE} when that
     * field is accessed. Clients should not invoke it directly. Instead, they should simply access
     * that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ArchitecturaltemplatesPackage init() {
        if (isInited) {
            return (ArchitecturaltemplatesPackage) EPackage.Registry.INSTANCE
                    .getEPackage(ArchitecturaltemplatesPackage.eNS_URI);
        }

        // Obtain or create and register package
        final ArchitecturaltemplatesPackageImpl theArchitecturaltemplatesPackage = (ArchitecturaltemplatesPackageImpl) (EPackage.Registry.INSTANCE
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
     *
     * @generated
     */
    @Override
    public EClass getAT() {
        return this.atEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAT_Catalog() {
        return (EReference) this.atEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAT_Roles() {
        return (EReference) this.atEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAT_ReconfigurationRuleFolder() {
        return (EReference) this.atEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAT_Documentation() {
        return (EAttribute) this.atEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getAT_DefaultInstanceURI() {
        return (EAttribute) this.atEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getConstraint() {
        return this.constraintEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getConstraint_Role() {
        return (EReference) this.constraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getConstraint_Expression() {
        return (EAttribute) this.constraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCatalog() {
        return this.catalogEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCatalog_ATs() {
        return (EReference) this.catalogEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRole() {
        return this.roleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRole_AT() {
        return (EReference) this.roleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRole_Constraints() {
        return (EReference) this.roleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRole_SuperRoles() {
        return (EReference) this.roleEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRole_Stereotype() {
        return (EReference) this.roleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRole_Completion() {
        return (EReference) this.roleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOCLConstraint() {
        return this.oclConstraintEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQVTOCompletion() {
        return this.qvtoCompletionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCompletion() {
        return this.completionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompletion_Parameters() {
        return (EReference) this.completionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompletion_Role() {
        return (EReference) this.completionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getCompletion_CompletionFileURI() {
        return (EAttribute) this.completionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCompletionParameter() {
        return this.completionParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompletionParameter_Completion() {
        return (EReference) this.completionParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPCMBlackboardCompletionParameter() {
        return this.pcmBlackboardCompletionParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPCMTemplateCompletionParameter() {
        return this.pcmTemplateCompletionParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPCMTemplateCompletionParameter_TemplateFileURI() {
        return (EAttribute) this.pcmTemplateCompletionParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPCMOutputCompletionParameter() {
        return this.pcmOutputCompletionParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getReconfigurationFolder() {
        return this.reconfigurationFolderEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getReconfigurationFolder_FolderURI() {
        return (EAttribute) this.reconfigurationFolderEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getIsolatedPCMTemplateCompletionParameter() {
        return this.isolatedPCMTemplateCompletionParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPCMCompletionParameter() {
        return this.pcmCompletionParameterEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getPCMCompletionParameter_FileExtension() {
        return (EReference) this.pcmCompletionParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFileExtension() {
        return this.fileExtensionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPCMFileExtension() {
        return this.pcmFileExtensionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPCMFileExtension_FileExtension() {
        return (EAttribute) this.pcmFileExtensionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getGenericFileExtension() {
        return this.genericFileExtensionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getGenericFileExtension_FileExtension() {
        return (EAttribute) this.genericFileExtensionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getPCMFileExtensions() {
        return this.pcmFileExtensionsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ArchitecturaltemplatesFactory getArchitecturaltemplatesFactory() {
        return (ArchitecturaltemplatesFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.atEClass = this.createEClass(AT);
        this.createEReference(this.atEClass, AT__CATALOG);
        this.createEReference(this.atEClass, AT__ROLES);
        this.createEReference(this.atEClass, AT__RECONFIGURATION_RULE_FOLDER);
        this.createEAttribute(this.atEClass, AT__DOCUMENTATION);
        this.createEAttribute(this.atEClass, AT__DEFAULT_INSTANCE_URI);

        this.constraintEClass = this.createEClass(CONSTRAINT);
        this.createEReference(this.constraintEClass, CONSTRAINT__ROLE);
        this.createEAttribute(this.constraintEClass, CONSTRAINT__EXPRESSION);

        this.catalogEClass = this.createEClass(CATALOG);
        this.createEReference(this.catalogEClass, CATALOG__ATS);

        this.roleEClass = this.createEClass(ROLE);
        this.createEReference(this.roleEClass, ROLE__AT);
        this.createEReference(this.roleEClass, ROLE__STEREOTYPE);
        this.createEReference(this.roleEClass, ROLE__COMPLETION);
        this.createEReference(this.roleEClass, ROLE__CONSTRAINTS);
        this.createEReference(this.roleEClass, ROLE__SUPER_ROLES);

        this.oclConstraintEClass = this.createEClass(OCL_CONSTRAINT);

        this.qvtoCompletionEClass = this.createEClass(QVTO_COMPLETION);

        this.completionEClass = this.createEClass(COMPLETION);
        this.createEReference(this.completionEClass, COMPLETION__PARAMETERS);
        this.createEReference(this.completionEClass, COMPLETION__ROLE);
        this.createEAttribute(this.completionEClass, COMPLETION__COMPLETION_FILE_URI);

        this.completionParameterEClass = this.createEClass(COMPLETION_PARAMETER);
        this.createEReference(this.completionParameterEClass, COMPLETION_PARAMETER__COMPLETION);

        this.pcmBlackboardCompletionParameterEClass = this.createEClass(PCM_BLACKBOARD_COMPLETION_PARAMETER);

        this.pcmTemplateCompletionParameterEClass = this.createEClass(PCM_TEMPLATE_COMPLETION_PARAMETER);
        this.createEAttribute(this.pcmTemplateCompletionParameterEClass,
                PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI);

        this.pcmOutputCompletionParameterEClass = this.createEClass(PCM_OUTPUT_COMPLETION_PARAMETER);

        this.reconfigurationFolderEClass = this.createEClass(RECONFIGURATION_FOLDER);
        this.createEAttribute(this.reconfigurationFolderEClass, RECONFIGURATION_FOLDER__FOLDER_URI);

        this.isolatedPCMTemplateCompletionParameterEClass = this
                .createEClass(ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER);

        this.pcmCompletionParameterEClass = this.createEClass(PCM_COMPLETION_PARAMETER);
        this.createEReference(this.pcmCompletionParameterEClass, PCM_COMPLETION_PARAMETER__FILE_EXTENSION);

        this.fileExtensionEClass = this.createEClass(FILE_EXTENSION);

        this.pcmFileExtensionEClass = this.createEClass(PCM_FILE_EXTENSION);
        this.createEAttribute(this.pcmFileExtensionEClass, PCM_FILE_EXTENSION__FILE_EXTENSION);

        this.genericFileExtensionEClass = this.createEClass(GENERIC_FILE_EXTENSION);
        this.createEAttribute(this.genericFileExtensionEClass, GENERIC_FILE_EXTENSION__FILE_EXTENSION);

        // Create enums
        this.pcmFileExtensionsEEnum = this.createEEnum(PCM_FILE_EXTENSIONS);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);
        final EMFProfilePackage theEMFProfilePackage = (EMFProfilePackage) EPackage.Registry.INSTANCE
                .getEPackage(EMFProfilePackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
                .getEPackage(EcorePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.atEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.constraintEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.catalogEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.roleEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.oclConstraintEClass.getESuperTypes().add(this.getConstraint());
        this.qvtoCompletionEClass.getESuperTypes().add(this.getCompletion());
        this.pcmBlackboardCompletionParameterEClass.getESuperTypes().add(this.getPCMCompletionParameter());
        this.pcmTemplateCompletionParameterEClass.getESuperTypes().add(this.getPCMCompletionParameter());
        this.pcmOutputCompletionParameterEClass.getESuperTypes().add(this.getPCMCompletionParameter());
        this.isolatedPCMTemplateCompletionParameterEClass.getESuperTypes()
                .add(this.getPCMTemplateCompletionParameter());
        this.pcmCompletionParameterEClass.getESuperTypes().add(this.getCompletionParameter());
        this.pcmFileExtensionEClass.getESuperTypes().add(this.getFileExtension());
        this.genericFileExtensionEClass.getESuperTypes().add(this.getFileExtension());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.atEClass, org.palladiosimulator.architecturaltemplates.AT.class, "AT", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAT_Catalog(), this.getCatalog(), this.getCatalog_ATs(), "catalog", null, 1, 1,
                org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getAT_Roles(), this.getRole(), this.getRole_AT(), "roles", null, 0, -1,
                org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getAT_ReconfigurationRuleFolder(), this.getReconfigurationFolder(), null,
                "reconfigurationRuleFolder", null, 0, 1, org.palladiosimulator.architecturaltemplates.AT.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getAT_Documentation(), this.ecorePackage.getEString(), "documentation", null, 0, 1,
                org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getAT_DefaultInstanceURI(), this.ecorePackage.getEString(), "defaultInstanceURI", null,
                0, 1, org.palladiosimulator.architecturaltemplates.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getConstraint_Role(), this.getRole(), this.getRole_Constraints(), "role", null, 1, 1,
                Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getConstraint_Expression(), this.ecorePackage.getEString(), "expression", null, 1, 1,
                Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCatalog_ATs(), this.getAT(), this.getAT_Catalog(), "ATs", null, 0, -1,
                Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRole_AT(), this.getAT(), this.getAT_Roles(), "AT", null, 1, 1, Role.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getRole_Stereotype(), theEMFProfilePackage.getStereotype(), null, "stereotype", null,
                1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getRole_Completion(), this.getCompletion(), this.getCompletion_Role(), "completion",
                null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getRole_Constraints(), this.getConstraint(), this.getConstraint_Role(), "constraints",
                null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getRole_SuperRoles(), this.getRole(), null, "superRoles", null, 0, -1, Role.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.oclConstraintEClass, OCLConstraint.class, "OCLConstraint", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.qvtoCompletionEClass, QVTOCompletion.class, "QVTOCompletion", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.completionEClass, Completion.class, "Completion", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompletion_Parameters(), this.getCompletionParameter(),
                this.getCompletionParameter_Completion(), "parameters", null, 1, -1, Completion.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEReference(this.getCompletion_Role(), this.getRole(), this.getRole_Completion(), "role", null, 1, 1,
                Completion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getCompletion_CompletionFileURI(), theEcorePackage.getEString(), "completionFileURI",
                null, 1, 1, Completion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.completionParameterEClass, CompletionParameter.class, "CompletionParameter", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompletionParameter_Completion(), this.getCompletion(),
                this.getCompletion_Parameters(), "completion", null, 1, 1, CompletionParameter.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        this.initEClass(this.pcmBlackboardCompletionParameterEClass, PCMBlackboardCompletionParameter.class,
                "PCMBlackboardCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.pcmTemplateCompletionParameterEClass, PCMTemplateCompletionParameter.class,
                "PCMTemplateCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getPCMTemplateCompletionParameter_TemplateFileURI(), theEcorePackage.getEString(),
                "templateFileURI", null, 1, 1, PCMTemplateCompletionParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.pcmOutputCompletionParameterEClass, PCMOutputCompletionParameter.class,
                "PCMOutputCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.reconfigurationFolderEClass, ReconfigurationFolder.class, "ReconfigurationFolder",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getReconfigurationFolder_FolderURI(), theEcorePackage.getEString(), "folderURI", null,
                1, 1, ReconfigurationFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.isolatedPCMTemplateCompletionParameterEClass, IsolatedPCMTemplateCompletionParameter.class,
                "IsolatedPCMTemplateCompletionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.pcmCompletionParameterEClass, PCMCompletionParameter.class, "PCMCompletionParameter",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getPCMCompletionParameter_FileExtension(), this.getFileExtension(), null,
                "fileExtension", null, 1, 1, PCMCompletionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.fileExtensionEClass, FileExtension.class, "FileExtension", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.pcmFileExtensionEClass, PCMFileExtension.class, "PCMFileExtension", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getPCMFileExtension_FileExtension(), this.getPCMFileExtensions(), "fileExtension",
                "system", 1, 1, PCMFileExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
                !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.genericFileExtensionEClass, GenericFileExtension.class, "GenericFileExtension",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getGenericFileExtension_FileExtension(), this.ecorePackage.getEString(),
                "fileExtension", null, 1, 1, GenericFileExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.pcmFileExtensionsEEnum, PCMFileExtensions.class, "PCMFileExtensions");
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.SYSTEM);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.ALLOCATION);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.RESOURCEENVIRONMENT);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.REPOSITORY);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.USAGEMODEL);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.RESOURCETYPE);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.MONITORREPOSITORY);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.PCMMEASURINGPOINT);
        this.addEEnumLiteral(this.pcmFileExtensionsEEnum, PCMFileExtensions.SERVICELEVELOBJECTIVE);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ArchitecturaltemplatesPackageImpl
