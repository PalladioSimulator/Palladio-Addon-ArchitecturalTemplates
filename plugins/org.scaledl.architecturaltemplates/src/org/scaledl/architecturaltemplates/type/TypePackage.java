/**
 */
package org.scaledl.architecturaltemplates.type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.scaledl.architecturaltemplates.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {

    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://scaledl.org/ArchitecturalTemplates/Type/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "org.scaledl.architecturaltemplates";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TypePackage eINSTANCE = org.scaledl.architecturaltemplates.type.impl.TypePackageImpl.init();

    /**
     * The meta object id for the '{@link org.scaledl.architecturaltemplates.type.impl.ATImpl
     * <em>AT</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.ATImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getAT()
     * @generated
     */
    int AT = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Catalog</b></em>' container reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT__CATALOG = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Roles</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT__ROLES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT__CONSTRAINTS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Reconfiguration Rule Folder</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT__RECONFIGURATION_RULE_FOLDER = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>AT</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.ConstraintImpl <em>Constraint</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.ConstraintImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getConstraint()
     * @generated
     */
    int CONSTRAINT = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CONSTRAINT__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CONSTRAINT__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>AT</b></em>' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CONSTRAINT__AT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Roles</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CONSTRAINT__ROLES = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Constraint</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CONSTRAINT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.scaledl.architecturaltemplates.type.impl.ParameterImpl
     * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.ParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARAMETER__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARAMETER__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Role</b></em>' container reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARAMETER__ROLE = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARAMETER__DATA_TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Parameter</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.scaledl.architecturaltemplates.type.impl.CatalogImpl
     * <em>Catalog</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.CatalogImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getCatalog()
     * @generated
     */
    int CATALOG = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CATALOG__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CATALOG__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>ATs</b></em>' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CATALOG__ATS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Catalog</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int CATALOG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.scaledl.architecturaltemplates.type.impl.RoleImpl
     * <em>Role</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.RoleImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getRole()
     * @generated
     */
    int ROLE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__PARAMETERS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>AT</b></em>' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__AT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' reference list. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__CONSTRAINTS = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__STEREOTYPE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Completion</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE__COMPLETION = EntityPackage.ENTITY_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Role</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ROLE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.OCLConstraintImpl <em>OCL Constraint</em>
     * }' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.OCLConstraintImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getOCLConstraint()
     * @generated
     */
    int OCL_CONSTRAINT = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OCL_CONSTRAINT__ID = CONSTRAINT__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OCL_CONSTRAINT__ENTITY_NAME = CONSTRAINT__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>AT</b></em>' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OCL_CONSTRAINT__AT = CONSTRAINT__AT;

    /**
     * The feature id for the '<em><b>Roles</b></em>' reference list. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OCL_CONSTRAINT__ROLES = CONSTRAINT__ROLES;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OCL_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>OCL Constraint</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int OCL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.CompletionImpl <em>Completion</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.CompletionImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getCompletion()
     * @generated
     */
    int COMPLETION = 7;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPLETION__PARAMETERS = 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' container reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPLETION__ROLE = 1;

    /**
     * The number of structural features of the '<em>Completion</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPLETION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.QVTOCompletionImpl
     * <em>QVTO Completion</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.QVTOCompletionImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getQVTOCompletion()
     * @generated
     */
    int QVTO_COMPLETION = 6;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QVTO_COMPLETION__PARAMETERS = COMPLETION__PARAMETERS;

    /**
     * The feature id for the '<em><b>Role</b></em>' container reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QVTO_COMPLETION__ROLE = COMPLETION__ROLE;

    /**
     * The feature id for the '<em><b>Qvto File URI</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QVTO_COMPLETION__QVTO_FILE_URI = COMPLETION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>QVTO Completion</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int QVTO_COMPLETION_FEATURE_COUNT = COMPLETION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.CompletionParameterImpl
     * <em>Completion Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.CompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getCompletionParameter()
     * @generated
     */
    int COMPLETION_PARAMETER = 8;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPLETION_PARAMETER__COMPLETION = 0;

    /**
     * The number of structural features of the '<em>Completion Parameter</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPLETION_PARAMETER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.GenericBlackboardCompletionParameterImpl
     * <em>Generic Blackboard Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.GenericBlackboardCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getGenericBlackboardCompletionParameter()
     * @generated
     */
    int GENERIC_BLACKBOARD_COMPLETION_PARAMETER = 10;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_BLACKBOARD_COMPLETION_PARAMETER__COMPLETION = COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION = COMPLETION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Generic Blackboard Completion Parameter</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT = COMPLETION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.GenericTemplateCompletionParameterImpl
     * <em>Generic Template Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.GenericTemplateCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getGenericTemplateCompletionParameter()
     * @generated
     */
    int GENERIC_TEMPLATE_COMPLETION_PARAMETER = 9;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_TEMPLATE_COMPLETION_PARAMETER__COMPLETION = GENERIC_BLACKBOARD_COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_TEMPLATE_COMPLETION_PARAMETER__FILE_EXTENSION = GENERIC_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Template File URI</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI = GENERIC_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT
            + 0;

    /**
     * The number of structural features of the '<em>Generic Template Completion Parameter</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_TEMPLATE_COMPLETION_PARAMETER_FEATURE_COUNT = GENERIC_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.PCMBlackboardCompletionParameterImpl
     * <em>PCM Blackboard Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.PCMBlackboardCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMBlackboardCompletionParameter()
     * @generated
     */
    int PCM_BLACKBOARD_COMPLETION_PARAMETER = 11;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_BLACKBOARD_COMPLETION_PARAMETER__COMPLETION = COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION = COMPLETION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>PCM Blackboard Completion Parameter</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT = COMPLETION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.PCMTemplateCompletionParameterImpl
     * <em>PCM Template Completion Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.PCMTemplateCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMTemplateCompletionParameter()
     * @generated
     */
    int PCM_TEMPLATE_COMPLETION_PARAMETER = 12;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_TEMPLATE_COMPLETION_PARAMETER__COMPLETION = PCM_BLACKBOARD_COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_TEMPLATE_COMPLETION_PARAMETER__FILE_EXTENSION = PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Template File URI</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI = PCM_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>PCM Template Completion Parameter</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_TEMPLATE_COMPLETION_PARAMETER_FEATURE_COUNT = PCM_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.TemplateProvidingEntityImpl
     * <em>Template Providing Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.TemplateProvidingEntityImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getTemplateProvidingEntity()
     * @generated
     */
    int TEMPLATE_PROVIDING_ENTITY = 13;

    /**
     * The feature id for the '<em><b>Template File URI</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI = 0;

    /**
     * The number of structural features of the '<em>Template Providing Entity</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TEMPLATE_PROVIDING_ENTITY_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.PCMOutputCompletionParameterImpl
     * <em>PCM Output Completion Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.PCMOutputCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMOutputCompletionParameter()
     * @generated
     */
    int PCM_OUTPUT_COMPLETION_PARAMETER = 14;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_OUTPUT_COMPLETION_PARAMETER__COMPLETION = COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_OUTPUT_COMPLETION_PARAMETER__FILE_EXTENSION = COMPLETION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>PCM Output Completion Parameter</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int PCM_OUTPUT_COMPLETION_PARAMETER_FEATURE_COUNT = COMPLETION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.GenericOutputCompletionParameterImpl
     * <em>Generic Output Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.GenericOutputCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getGenericOutputCompletionParameter()
     * @generated
     */
    int GENERIC_OUTPUT_COMPLETION_PARAMETER = 15;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_OUTPUT_COMPLETION_PARAMETER__COMPLETION = COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_OUTPUT_COMPLETION_PARAMETER__FILE_EXTENSION = COMPLETION_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Generic Output Completion Parameter</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int GENERIC_OUTPUT_COMPLETION_PARAMETER_FEATURE_COUNT = COMPLETION_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.ReconfigurationFolderImpl
     * <em>Reconfiguration Folder</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.ReconfigurationFolderImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getReconfigurationFolder()
     * @generated
     */
    int RECONFIGURATION_FOLDER = 16;

    /**
     * The feature id for the '<em><b>Folder URI</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RECONFIGURATION_FOLDER__FOLDER_URI = 0;

    /**
     * The number of structural features of the '<em>Reconfiguration Folder</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int RECONFIGURATION_FOLDER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '
     * {@link org.scaledl.architecturaltemplates.type.impl.IsolatedPCMTemplateCompletionParameterImpl
     * <em>Isolated PCM Template Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.impl.IsolatedPCMTemplateCompletionParameterImpl
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getIsolatedPCMTemplateCompletionParameter()
     * @generated
     */
    int ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER = 17;

    /**
     * The feature id for the '<em><b>Completion</b></em>' container reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__COMPLETION = PCM_BLACKBOARD_COMPLETION_PARAMETER__COMPLETION;

    /**
     * The feature id for the '<em><b>File Extension</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__FILE_EXTENSION = PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION;

    /**
     * The feature id for the '<em><b>Template File URI</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI = PCM_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT
            + 0;

    /**
     * The number of structural features of the '<em>Isolated PCM Template Completion Parameter</em>
     * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER_FEATURE_COUNT = PCM_BLACKBOARD_COMPLETION_PARAMETER_FEATURE_COUNT
            + 1;

    /**
     * The meta object id for the '{@link org.scaledl.architecturaltemplates.type.PCMFileExtensions
     * <em>PCM File Extensions</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.architecturaltemplates.type.PCMFileExtensions
     * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMFileExtensions()
     * @generated
     */
    int PCM_FILE_EXTENSIONS = 18;

    /**
     * Returns the meta object for class '{@link org.scaledl.architecturaltemplates.type.AT
     * <em>AT</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>AT</em>'.
     * @see org.scaledl.architecturaltemplates.type.AT
     * @generated
     */
    EClass getAT();

    /**
     * Returns the meta object for the container reference '
     * {@link org.scaledl.architecturaltemplates.type.AT#getCatalog <em>Catalog</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>Catalog</em>'.
     * @see org.scaledl.architecturaltemplates.type.AT#getCatalog()
     * @see #getAT()
     * @generated
     */
    EReference getAT_Catalog();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.architecturaltemplates.type.AT#getRoles <em>Roles</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Roles</em>'.
     * @see org.scaledl.architecturaltemplates.type.AT#getRoles()
     * @see #getAT()
     * @generated
     */
    EReference getAT_Roles();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.architecturaltemplates.type.AT#getConstraints <em>Constraints</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see org.scaledl.architecturaltemplates.type.AT#getConstraints()
     * @see #getAT()
     * @generated
     */
    EReference getAT_Constraints();

    /**
     * Returns the meta object for the containment reference '
     * {@link org.scaledl.architecturaltemplates.type.AT#getReconfigurationRuleFolder
     * <em>Reconfiguration Rule Folder</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Reconfiguration Rule Folder</em>'.
     * @see org.scaledl.architecturaltemplates.type.AT#getReconfigurationRuleFolder()
     * @see #getAT()
     * @generated
     */
    EReference getAT_ReconfigurationRuleFolder();

    /**
     * Returns the meta object for class '{@link org.scaledl.architecturaltemplates.type.Constraint
     * <em>Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Constraint</em>'.
     * @see org.scaledl.architecturaltemplates.type.Constraint
     * @generated
     */
    EClass getConstraint();

    /**
     * Returns the meta object for the container reference '
     * {@link org.scaledl.architecturaltemplates.type.Constraint#getAT <em>AT</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>AT</em>'.
     * @see org.scaledl.architecturaltemplates.type.Constraint#getAT()
     * @see #getConstraint()
     * @generated
     */
    EReference getConstraint_AT();

    /**
     * Returns the meta object for the reference list '
     * {@link org.scaledl.architecturaltemplates.type.Constraint#getRoles <em>Roles</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Roles</em>'.
     * @see org.scaledl.architecturaltemplates.type.Constraint#getRoles()
     * @see #getConstraint()
     * @generated
     */
    EReference getConstraint_Roles();

    /**
     * Returns the meta object for class '{@link org.scaledl.architecturaltemplates.type.Parameter
     * <em>Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the container reference '
     * {@link org.scaledl.architecturaltemplates.type.Parameter#getRole <em>Role</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>Role</em>'.
     * @see org.scaledl.architecturaltemplates.type.Parameter#getRole()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_Role();

    /**
     * Returns the meta object for the reference '
     * {@link org.scaledl.architecturaltemplates.type.Parameter#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Data Type</em>'.
     * @see org.scaledl.architecturaltemplates.type.Parameter#getDataType()
     * @see #getParameter()
     * @generated
     */
    EReference getParameter_DataType();

    /**
     * Returns the meta object for class '{@link org.scaledl.architecturaltemplates.type.Catalog
     * <em>Catalog</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Catalog</em>'.
     * @see org.scaledl.architecturaltemplates.type.Catalog
     * @generated
     */
    EClass getCatalog();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.architecturaltemplates.type.Catalog#getATs <em>ATs</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>ATs</em>'.
     * @see org.scaledl.architecturaltemplates.type.Catalog#getATs()
     * @see #getCatalog()
     * @generated
     */
    EReference getCatalog_ATs();

    /**
     * Returns the meta object for class '{@link org.scaledl.architecturaltemplates.type.Role
     * <em>Role</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Role</em>'.
     * @see org.scaledl.architecturaltemplates.type.Role
     * @generated
     */
    EClass getRole();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.architecturaltemplates.type.Role#getParameters <em>Parameters</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see org.scaledl.architecturaltemplates.type.Role#getParameters()
     * @see #getRole()
     * @generated
     */
    EReference getRole_Parameters();

    /**
     * Returns the meta object for the container reference '
     * {@link org.scaledl.architecturaltemplates.type.Role#getAT <em>AT</em>}'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>AT</em>'.
     * @see org.scaledl.architecturaltemplates.type.Role#getAT()
     * @see #getRole()
     * @generated
     */
    EReference getRole_AT();

    /**
     * Returns the meta object for the reference list '
     * {@link org.scaledl.architecturaltemplates.type.Role#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference list '<em>Constraints</em>'.
     * @see org.scaledl.architecturaltemplates.type.Role#getConstraints()
     * @see #getRole()
     * @generated
     */
    EReference getRole_Constraints();

    /**
     * Returns the meta object for the reference '
     * {@link org.scaledl.architecturaltemplates.type.Role#getStereotype <em>Stereotype</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Stereotype</em>'.
     * @see org.scaledl.architecturaltemplates.type.Role#getStereotype()
     * @see #getRole()
     * @generated
     */
    EReference getRole_Stereotype();

    /**
     * Returns the meta object for the containment reference '
     * {@link org.scaledl.architecturaltemplates.type.Role#getCompletion <em>Completion</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference '<em>Completion</em>'.
     * @see org.scaledl.architecturaltemplates.type.Role#getCompletion()
     * @see #getRole()
     * @generated
     */
    EReference getRole_Completion();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.OCLConstraint <em>OCL Constraint</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>OCL Constraint</em>'.
     * @see org.scaledl.architecturaltemplates.type.OCLConstraint
     * @generated
     */
    EClass getOCLConstraint();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.OCLConstraint#getConstraint
     * <em>Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Constraint</em>'.
     * @see org.scaledl.architecturaltemplates.type.OCLConstraint#getConstraint()
     * @see #getOCLConstraint()
     * @generated
     */
    EAttribute getOCLConstraint_Constraint();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.QVTOCompletion <em>QVTO Completion</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>QVTO Completion</em>'.
     * @see org.scaledl.architecturaltemplates.type.QVTOCompletion
     * @generated
     */
    EClass getQVTOCompletion();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.QVTOCompletion#getQvtoFileURI
     * <em>Qvto File URI</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Qvto File URI</em>'.
     * @see org.scaledl.architecturaltemplates.type.QVTOCompletion#getQvtoFileURI()
     * @see #getQVTOCompletion()
     * @generated
     */
    EAttribute getQVTOCompletion_QvtoFileURI();

    /**
     * Returns the meta object for class '{@link org.scaledl.architecturaltemplates.type.Completion
     * <em>Completion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Completion</em>'.
     * @see org.scaledl.architecturaltemplates.type.Completion
     * @generated
     */
    EClass getCompletion();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.architecturaltemplates.type.Completion#getParameters <em>Parameters</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see org.scaledl.architecturaltemplates.type.Completion#getParameters()
     * @see #getCompletion()
     * @generated
     */
    EReference getCompletion_Parameters();

    /**
     * Returns the meta object for the container reference '
     * {@link org.scaledl.architecturaltemplates.type.Completion#getRole <em>Role</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>Role</em>'.
     * @see org.scaledl.architecturaltemplates.type.Completion#getRole()
     * @see #getCompletion()
     * @generated
     */
    EReference getCompletion_Role();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.CompletionParameter
     * <em>Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.CompletionParameter
     * @generated
     */
    EClass getCompletionParameter();

    /**
     * Returns the meta object for the container reference '
     * {@link org.scaledl.architecturaltemplates.type.CompletionParameter#getCompletion
     * <em>Completion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the container reference '<em>Completion</em>'.
     * @see org.scaledl.architecturaltemplates.type.CompletionParameter#getCompletion()
     * @see #getCompletionParameter()
     * @generated
     */
    EReference getCompletionParameter_Completion();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter
     * <em>Generic Template Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for class '<em>Generic Template Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter
     * @generated
     */
    EClass getGenericTemplateCompletionParameter();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter
     * <em>Generic Blackboard Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for class '<em>Generic Blackboard Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter
     * @generated
     */
    EClass getGenericBlackboardCompletionParameter();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter#getFileExtension
     * <em>File Extension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Extension</em>'.
     * @see org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter#getFileExtension()
     * @see #getGenericBlackboardCompletionParameter()
     * @generated
     */
    EAttribute getGenericBlackboardCompletionParameter_FileExtension();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter
     * <em>PCM Blackboard Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>PCM Blackboard Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter
     * @generated
     */
    EClass getPCMBlackboardCompletionParameter();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter#getFileExtension
     * <em>File Extension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Extension</em>'.
     * @see org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter#getFileExtension()
     * @see #getPCMBlackboardCompletionParameter()
     * @generated
     */
    EAttribute getPCMBlackboardCompletionParameter_FileExtension();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter
     * <em>PCM Template Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>PCM Template Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter
     * @generated
     */
    EClass getPCMTemplateCompletionParameter();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.TemplateProvidingEntity
     * <em>Template Providing Entity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Template Providing Entity</em>'.
     * @see org.scaledl.architecturaltemplates.type.TemplateProvidingEntity
     * @generated
     */
    EClass getTemplateProvidingEntity();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.TemplateProvidingEntity#getTemplateFileURI
     * <em>Template File URI</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Template File URI</em>'.
     * @see org.scaledl.architecturaltemplates.type.TemplateProvidingEntity#getTemplateFileURI()
     * @see #getTemplateProvidingEntity()
     * @generated
     */
    EAttribute getTemplateProvidingEntity_TemplateFileURI();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter
     * <em>PCM Output Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>PCM Output Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter
     * @generated
     */
    EClass getPCMOutputCompletionParameter();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter#getFileExtension
     * <em>File Extension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Extension</em>'.
     * @see org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter#getFileExtension()
     * @see #getPCMOutputCompletionParameter()
     * @generated
     */
    EAttribute getPCMOutputCompletionParameter_FileExtension();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter
     * <em>Generic Output Completion Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Generic Output Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter
     * @generated
     */
    EClass getGenericOutputCompletionParameter();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter#getFileExtension
     * <em>File Extension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>File Extension</em>'.
     * @see org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter#getFileExtension()
     * @see #getGenericOutputCompletionParameter()
     * @generated
     */
    EAttribute getGenericOutputCompletionParameter_FileExtension();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.ReconfigurationFolder
     * <em>Reconfiguration Folder</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Reconfiguration Folder</em>'.
     * @see org.scaledl.architecturaltemplates.type.ReconfigurationFolder
     * @generated
     */
    EClass getReconfigurationFolder();

    /**
     * Returns the meta object for the attribute '
     * {@link org.scaledl.architecturaltemplates.type.ReconfigurationFolder#getFolderURI
     * <em>Folder URI</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the attribute '<em>Folder URI</em>'.
     * @see org.scaledl.architecturaltemplates.type.ReconfigurationFolder#getFolderURI()
     * @see #getReconfigurationFolder()
     * @generated
     */
    EAttribute getReconfigurationFolder_FolderURI();

    /**
     * Returns the meta object for class '
     * {@link org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter
     * <em>Isolated PCM Template Completion Parameter</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for class '<em>Isolated PCM Template Completion Parameter</em>'.
     * @see org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter
     * @generated
     */
    EClass getIsolatedPCMTemplateCompletionParameter();

    /**
     * Returns the meta object for enum '
     * {@link org.scaledl.architecturaltemplates.type.PCMFileExtensions <em>PCM File Extensions</em>
     * }'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for enum '<em>PCM File Extensions</em>'.
     * @see org.scaledl.architecturaltemplates.type.PCMFileExtensions
     * @generated
     */
    EEnum getPCMFileExtensions();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TypeFactory getTypeFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.ATImpl <em>AT</em>}' class. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.ATImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getAT()
         * @generated
         */
        EClass AT = eINSTANCE.getAT();

        /**
         * The meta object literal for the '<em><b>Catalog</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference AT__CATALOG = eINSTANCE.getAT_Catalog();

        /**
         * The meta object literal for the '<em><b>Roles</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference AT__ROLES = eINSTANCE.getAT_Roles();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference AT__CONSTRAINTS = eINSTANCE.getAT_Constraints();

        /**
         * The meta object literal for the '<em><b>Reconfiguration Rule Folder</b></em>' containment
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference AT__RECONFIGURATION_RULE_FOLDER = eINSTANCE.getAT_ReconfigurationRuleFolder();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.ConstraintImpl <em>Constraint</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.ConstraintImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getConstraint()
         * @generated
         */
        EClass CONSTRAINT = eINSTANCE.getConstraint();

        /**
         * The meta object literal for the '<em><b>AT</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference CONSTRAINT__AT = eINSTANCE.getConstraint_AT();

        /**
         * The meta object literal for the '<em><b>Roles</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference CONSTRAINT__ROLES = eINSTANCE.getConstraint_Roles();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.ParameterImpl <em>Parameter</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.ParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PARAMETER__ROLE = eINSTANCE.getParameter_Role();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference PARAMETER__DATA_TYPE = eINSTANCE.getParameter_DataType();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.CatalogImpl <em>Catalog</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.CatalogImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getCatalog()
         * @generated
         */
        EClass CATALOG = eINSTANCE.getCatalog();

        /**
         * The meta object literal for the '<em><b>ATs</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference CATALOG__ATS = eINSTANCE.getCatalog_ATs();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.RoleImpl <em>Role</em>}' class. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.RoleImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getRole()
         * @generated
         */
        EClass ROLE = eINSTANCE.getRole();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROLE__PARAMETERS = eINSTANCE.getRole_Parameters();

        /**
         * The meta object literal for the '<em><b>AT</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROLE__AT = eINSTANCE.getRole_AT();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROLE__CONSTRAINTS = eINSTANCE.getRole_Constraints();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROLE__STEREOTYPE = eINSTANCE.getRole_Stereotype();

        /**
         * The meta object literal for the '<em><b>Completion</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference ROLE__COMPLETION = eINSTANCE.getRole_Completion();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.OCLConstraintImpl
         * <em>OCL Constraint</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.OCLConstraintImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getOCLConstraint()
         * @generated
         */
        EClass OCL_CONSTRAINT = eINSTANCE.getOCLConstraint();

        /**
         * The meta object literal for the '<em><b>Constraint</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute OCL_CONSTRAINT__CONSTRAINT = eINSTANCE.getOCLConstraint_Constraint();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.QVTOCompletionImpl
         * <em>QVTO Completion</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.QVTOCompletionImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getQVTOCompletion()
         * @generated
         */
        EClass QVTO_COMPLETION = eINSTANCE.getQVTOCompletion();

        /**
         * The meta object literal for the '<em><b>Qvto File URI</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute QVTO_COMPLETION__QVTO_FILE_URI = eINSTANCE.getQVTOCompletion_QvtoFileURI();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.CompletionImpl <em>Completion</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.CompletionImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getCompletion()
         * @generated
         */
        EClass COMPLETION = eINSTANCE.getCompletion();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPLETION__PARAMETERS = eINSTANCE.getCompletion_Parameters();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPLETION__ROLE = eINSTANCE.getCompletion_Role();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.CompletionParameterImpl
         * <em>Completion Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.CompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getCompletionParameter()
         * @generated
         */
        EClass COMPLETION_PARAMETER = eINSTANCE.getCompletionParameter();

        /**
         * The meta object literal for the '<em><b>Completion</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPLETION_PARAMETER__COMPLETION = eINSTANCE.getCompletionParameter_Completion();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.GenericTemplateCompletionParameterImpl
         * <em>Generic Template Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.GenericTemplateCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getGenericTemplateCompletionParameter()
         * @generated
         */
        EClass GENERIC_TEMPLATE_COMPLETION_PARAMETER = eINSTANCE.getGenericTemplateCompletionParameter();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.GenericBlackboardCompletionParameterImpl
         * <em>Generic Blackboard Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.GenericBlackboardCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getGenericBlackboardCompletionParameter()
         * @generated
         */
        EClass GENERIC_BLACKBOARD_COMPLETION_PARAMETER = eINSTANCE.getGenericBlackboardCompletionParameter();

        /**
         * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GENERIC_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION = eINSTANCE
                .getGenericBlackboardCompletionParameter_FileExtension();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.PCMBlackboardCompletionParameterImpl
         * <em>PCM Blackboard Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.PCMBlackboardCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMBlackboardCompletionParameter()
         * @generated
         */
        EClass PCM_BLACKBOARD_COMPLETION_PARAMETER = eINSTANCE.getPCMBlackboardCompletionParameter();

        /**
         * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PCM_BLACKBOARD_COMPLETION_PARAMETER__FILE_EXTENSION = eINSTANCE
                .getPCMBlackboardCompletionParameter_FileExtension();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.PCMTemplateCompletionParameterImpl
         * <em>PCM Template Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.PCMTemplateCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMTemplateCompletionParameter()
         * @generated
         */
        EClass PCM_TEMPLATE_COMPLETION_PARAMETER = eINSTANCE.getPCMTemplateCompletionParameter();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.TemplateProvidingEntityImpl
         * <em>Template Providing Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.TemplateProvidingEntityImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getTemplateProvidingEntity()
         * @generated
         */
        EClass TEMPLATE_PROVIDING_ENTITY = eINSTANCE.getTemplateProvidingEntity();

        /**
         * The meta object literal for the '<em><b>Template File URI</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI = eINSTANCE
                .getTemplateProvidingEntity_TemplateFileURI();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.PCMOutputCompletionParameterImpl
         * <em>PCM Output Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.PCMOutputCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMOutputCompletionParameter()
         * @generated
         */
        EClass PCM_OUTPUT_COMPLETION_PARAMETER = eINSTANCE.getPCMOutputCompletionParameter();

        /**
         * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute PCM_OUTPUT_COMPLETION_PARAMETER__FILE_EXTENSION = eINSTANCE
                .getPCMOutputCompletionParameter_FileExtension();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.GenericOutputCompletionParameterImpl
         * <em>Generic Output Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.GenericOutputCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getGenericOutputCompletionParameter()
         * @generated
         */
        EClass GENERIC_OUTPUT_COMPLETION_PARAMETER = eINSTANCE.getGenericOutputCompletionParameter();

        /**
         * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute GENERIC_OUTPUT_COMPLETION_PARAMETER__FILE_EXTENSION = eINSTANCE
                .getGenericOutputCompletionParameter_FileExtension();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.ReconfigurationFolderImpl
         * <em>Reconfiguration Folder</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.ReconfigurationFolderImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getReconfigurationFolder()
         * @generated
         */
        EClass RECONFIGURATION_FOLDER = eINSTANCE.getReconfigurationFolder();

        /**
         * The meta object literal for the '<em><b>Folder URI</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute RECONFIGURATION_FOLDER__FOLDER_URI = eINSTANCE.getReconfigurationFolder_FolderURI();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.impl.IsolatedPCMTemplateCompletionParameterImpl
         * <em>Isolated PCM Template Completion Parameter</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.impl.IsolatedPCMTemplateCompletionParameterImpl
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getIsolatedPCMTemplateCompletionParameter()
         * @generated
         */
        EClass ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER = eINSTANCE.getIsolatedPCMTemplateCompletionParameter();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.architecturaltemplates.type.PCMFileExtensions
         * <em>PCM File Extensions</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.architecturaltemplates.type.PCMFileExtensions
         * @see org.scaledl.architecturaltemplates.type.impl.TypePackageImpl#getPCMFileExtensions()
         * @generated
         */
        EEnum PCM_FILE_EXTENSIONS = eINSTANCE.getPCMFileExtensions();

    }

} // TypePackage
