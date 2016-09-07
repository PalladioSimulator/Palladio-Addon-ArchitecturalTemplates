/**
 */
package org.palladiosimulator.architecturaltemplates.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesFactory;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Catalog;
import org.palladiosimulator.architecturaltemplates.GenericBlackboardCompletionParameter;
import org.palladiosimulator.architecturaltemplates.GenericOutputCompletionParameter;
import org.palladiosimulator.architecturaltemplates.GenericTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.OCLConstraint;
import org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMFileExtensions;
import org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.QVTOCompletion;
import org.palladiosimulator.architecturaltemplates.ReconfigurationFolder;
import org.palladiosimulator.architecturaltemplates.Role;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ArchitecturaltemplatesFactoryImpl extends EFactoryImpl implements ArchitecturaltemplatesFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ArchitecturaltemplatesFactory init() {
        try {
            final ArchitecturaltemplatesFactory theArchitecturaltemplatesFactory = (ArchitecturaltemplatesFactory) EPackage.Registry.INSTANCE
                    .getEFactory(ArchitecturaltemplatesPackage.eNS_URI);
            if (theArchitecturaltemplatesFactory != null) {
                return theArchitecturaltemplatesFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ArchitecturaltemplatesFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ArchitecturaltemplatesFactoryImpl() {
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
        case ArchitecturaltemplatesPackage.AT:
            return this.createAT();
        case ArchitecturaltemplatesPackage.CATALOG:
            return this.createCatalog();
        case ArchitecturaltemplatesPackage.ROLE:
            return this.createRole();
        case ArchitecturaltemplatesPackage.OCL_CONSTRAINT:
            return this.createOCLConstraint();
        case ArchitecturaltemplatesPackage.QVTO_COMPLETION:
            return this.createQVTOCompletion();
        case ArchitecturaltemplatesPackage.GENERIC_TEMPLATE_COMPLETION_PARAMETER:
            return this.createGenericTemplateCompletionParameter();
        case ArchitecturaltemplatesPackage.GENERIC_BLACKBOARD_COMPLETION_PARAMETER:
            return this.createGenericBlackboardCompletionParameter();
        case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER:
            return this.createPCMBlackboardCompletionParameter();
        case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER:
            return this.createPCMTemplateCompletionParameter();
        case ArchitecturaltemplatesPackage.PCM_OUTPUT_COMPLETION_PARAMETER:
            return this.createPCMOutputCompletionParameter();
        case ArchitecturaltemplatesPackage.GENERIC_OUTPUT_COMPLETION_PARAMETER:
            return this.createGenericOutputCompletionParameter();
        case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER:
            return this.createReconfigurationFolder();
        case ArchitecturaltemplatesPackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER:
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
        case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSIONS:
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
        case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSIONS:
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
    public ArchitecturaltemplatesPackage getArchitecturaltemplatesPackage() {
        return (ArchitecturaltemplatesPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ArchitecturaltemplatesPackage getPackage() {
        return ArchitecturaltemplatesPackage.eINSTANCE;
    }

} // ArchitecturaltemplatesFactoryImpl
