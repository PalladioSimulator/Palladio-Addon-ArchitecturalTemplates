/**
 */
package org.scaledl.architecturaltemplates.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.scaledl.architecturaltemplates.type.AT;
import org.scaledl.architecturaltemplates.type.Catalog;
import org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter;
import org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter;
import org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.OCLConstraint;
import org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter;
import org.scaledl.architecturaltemplates.type.PCMFileExtensions;
import org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter;
import org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.Parameter;
import org.scaledl.architecturaltemplates.type.QVTOCompletion;
import org.scaledl.architecturaltemplates.type.ReconfigurationFolder;
import org.scaledl.architecturaltemplates.type.Role;
import org.scaledl.architecturaltemplates.type.TypeFactory;
import org.scaledl.architecturaltemplates.type.TypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TypeFactory init() {
        try {
            final TypeFactory theTypeFactory = (TypeFactory) EPackage.Registry.INSTANCE
                    .getEFactory(TypePackage.eNS_URI);
            if (theTypeFactory != null) {
                return theTypeFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case TypePackage.AT:
            return this.createAT();
        case TypePackage.PARAMETER:
            return this.createParameter();
        case TypePackage.CATALOG:
            return this.createCatalog();
        case TypePackage.ROLE:
            return this.createRole();
        case TypePackage.OCL_CONSTRAINT:
            return this.createOCLConstraint();
        case TypePackage.QVTO_COMPLETION:
            return this.createQVTOCompletion();
        case TypePackage.GENERIC_TEMPLATE_COMPLETION_PARAMETER:
            return this.createGenericTemplateCompletionParameter();
        case TypePackage.GENERIC_BLACKBOARD_COMPLETION_PARAMETER:
            return this.createGenericBlackboardCompletionParameter();
        case TypePackage.PCM_BLACKBOARD_COMPLETION_PARAMETER:
            return this.createPCMBlackboardCompletionParameter();
        case TypePackage.PCM_TEMPLATE_COMPLETION_PARAMETER:
            return this.createPCMTemplateCompletionParameter();
        case TypePackage.PCM_OUTPUT_COMPLETION_PARAMETER:
            return this.createPCMOutputCompletionParameter();
        case TypePackage.GENERIC_OUTPUT_COMPLETION_PARAMETER:
            return this.createGenericOutputCompletionParameter();
        case TypePackage.RECONFIGURATION_FOLDER:
            return this.createReconfigurationFolder();
        case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER:
            return this.createIsolatedPCMTemplateCompletionParameter();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case TypePackage.PCM_FILE_EXTENSIONS:
            return this.createPCMFileExtensionsFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case TypePackage.PCM_FILE_EXTENSIONS:
            return this.convertPCMFileExtensionsToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AT createAT() {
        final ATImpl at = new ATImpl();
        return at;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Parameter createParameter() {
        final ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Catalog createCatalog() {
        final CatalogImpl catalog = new CatalogImpl();
        return catalog;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Role createRole() {
        final RoleImpl role = new RoleImpl();
        return role;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OCLConstraint createOCLConstraint() {
        final OCLConstraintImpl oclConstraint = new OCLConstraintImpl();
        return oclConstraint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QVTOCompletion createQVTOCompletion() {
        final QVTOCompletionImpl qvtoCompletion = new QVTOCompletionImpl();
        return qvtoCompletion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public GenericTemplateCompletionParameter createGenericTemplateCompletionParameter() {
        final GenericTemplateCompletionParameterImpl genericTemplateCompletionParameter = new GenericTemplateCompletionParameterImpl();
        return genericTemplateCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public GenericBlackboardCompletionParameter createGenericBlackboardCompletionParameter() {
        final GenericBlackboardCompletionParameterImpl genericBlackboardCompletionParameter = new GenericBlackboardCompletionParameterImpl();
        return genericBlackboardCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMBlackboardCompletionParameter createPCMBlackboardCompletionParameter() {
        final PCMBlackboardCompletionParameterImpl pcmBlackboardCompletionParameter = new PCMBlackboardCompletionParameterImpl();
        return pcmBlackboardCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMTemplateCompletionParameter createPCMTemplateCompletionParameter() {
        final PCMTemplateCompletionParameterImpl pcmTemplateCompletionParameter = new PCMTemplateCompletionParameterImpl();
        return pcmTemplateCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PCMOutputCompletionParameter createPCMOutputCompletionParameter() {
        final PCMOutputCompletionParameterImpl pcmOutputCompletionParameter = new PCMOutputCompletionParameterImpl();
        return pcmOutputCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public GenericOutputCompletionParameter createGenericOutputCompletionParameter() {
        final GenericOutputCompletionParameterImpl genericOutputCompletionParameter = new GenericOutputCompletionParameterImpl();
        return genericOutputCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ReconfigurationFolder createReconfigurationFolder() {
        final ReconfigurationFolderImpl reconfigurationFolder = new ReconfigurationFolderImpl();
        return reconfigurationFolder;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public IsolatedPCMTemplateCompletionParameter createIsolatedPCMTemplateCompletionParameter() {
        final IsolatedPCMTemplateCompletionParameterImpl isolatedPCMTemplateCompletionParameter = new IsolatedPCMTemplateCompletionParameterImpl();
        return isolatedPCMTemplateCompletionParameter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PCMFileExtensions createPCMFileExtensionsFromString(final EDataType eDataType, final String initialValue) {
        final PCMFileExtensions result = PCMFileExtensions.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertPCMFileExtensionsToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TypePackage getTypePackage() {
        return (TypePackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TypePackage getPackage() {
        return TypePackage.eINSTANCE;
    }

} // TypeFactoryImpl
