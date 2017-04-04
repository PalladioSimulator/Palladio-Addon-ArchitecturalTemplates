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
import org.palladiosimulator.architecturaltemplates.GenericFileExtension;
import org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.OCLConstraint;
import org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMFileExtension;
import org.palladiosimulator.architecturaltemplates.PCMFileExtensions;
import org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.QVTOCompletion;
import org.palladiosimulator.architecturaltemplates.ReconfigurationFolder;
import org.palladiosimulator.architecturaltemplates.Role;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturaltemplatesFactoryImpl extends EFactoryImpl implements ArchitecturaltemplatesFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitecturaltemplatesFactory init() {
		try {
			ArchitecturaltemplatesFactory theArchitecturaltemplatesFactory = (ArchitecturaltemplatesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ArchitecturaltemplatesPackage.eNS_URI);
			if (theArchitecturaltemplatesFactory != null) {
				return theArchitecturaltemplatesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitecturaltemplatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturaltemplatesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArchitecturaltemplatesPackage.AT:
			return createAT();
		case ArchitecturaltemplatesPackage.CATALOG:
			return createCatalog();
		case ArchitecturaltemplatesPackage.ROLE:
			return createRole();
		case ArchitecturaltemplatesPackage.OCL_CONSTRAINT:
			return createOCLConstraint();
		case ArchitecturaltemplatesPackage.QVTO_COMPLETION:
			return createQVTOCompletion();
		case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER:
			return createPCMBlackboardCompletionParameter();
		case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER:
			return createPCMTemplateCompletionParameter();
		case ArchitecturaltemplatesPackage.PCM_OUTPUT_COMPLETION_PARAMETER:
			return createPCMOutputCompletionParameter();
		case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER:
			return createReconfigurationFolder();
		case ArchitecturaltemplatesPackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER:
			return createIsolatedPCMTemplateCompletionParameter();
		case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION:
			return createPCMFileExtension();
		case ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION:
			return createGenericFileExtension();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSIONS:
			return createPCMFileExtensionsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSIONS:
			return convertPCMFileExtensionsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AT createAT() {
		ATImpl at = new ATImpl();
		return at;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OCLConstraint createOCLConstraint() {
		OCLConstraintImpl oclConstraint = new OCLConstraintImpl();
		return oclConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QVTOCompletion createQVTOCompletion() {
		QVTOCompletionImpl qvtoCompletion = new QVTOCompletionImpl();
		return qvtoCompletion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMBlackboardCompletionParameter createPCMBlackboardCompletionParameter() {
		PCMBlackboardCompletionParameterImpl pcmBlackboardCompletionParameter = new PCMBlackboardCompletionParameterImpl();
		return pcmBlackboardCompletionParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMTemplateCompletionParameter createPCMTemplateCompletionParameter() {
		PCMTemplateCompletionParameterImpl pcmTemplateCompletionParameter = new PCMTemplateCompletionParameterImpl();
		return pcmTemplateCompletionParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMOutputCompletionParameter createPCMOutputCompletionParameter() {
		PCMOutputCompletionParameterImpl pcmOutputCompletionParameter = new PCMOutputCompletionParameterImpl();
		return pcmOutputCompletionParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconfigurationFolder createReconfigurationFolder() {
		ReconfigurationFolderImpl reconfigurationFolder = new ReconfigurationFolderImpl();
		return reconfigurationFolder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsolatedPCMTemplateCompletionParameter createIsolatedPCMTemplateCompletionParameter() {
		IsolatedPCMTemplateCompletionParameterImpl isolatedPCMTemplateCompletionParameter = new IsolatedPCMTemplateCompletionParameterImpl();
		return isolatedPCMTemplateCompletionParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMFileExtension createPCMFileExtension() {
		PCMFileExtensionImpl pcmFileExtension = new PCMFileExtensionImpl();
		return pcmFileExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericFileExtension createGenericFileExtension() {
		GenericFileExtensionImpl genericFileExtension = new GenericFileExtensionImpl();
		return genericFileExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PCMFileExtensions createPCMFileExtensionsFromString(EDataType eDataType, String initialValue) {
		PCMFileExtensions result = PCMFileExtensions.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPCMFileExtensionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchitecturaltemplatesPackage getArchitecturaltemplatesPackage() {
		return (ArchitecturaltemplatesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturaltemplatesPackage getPackage() {
		return ArchitecturaltemplatesPackage.eINSTANCE;
	}

} // ArchitecturaltemplatesFactoryImpl
