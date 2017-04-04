/**
 */
package org.palladiosimulator.architecturaltemplates.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.architecturaltemplates.AT;
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
import org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter;
import org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter;
import org.palladiosimulator.architecturaltemplates.QVTOCompletion;
import org.palladiosimulator.architecturaltemplates.ReconfigurationFolder;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage
 * @generated
 */
public class ArchitecturaltemplatesSwitch<T> extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturaltemplatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturaltemplatesSwitch() {
		if (modelPackage == null) {
			modelPackage = ArchitecturaltemplatesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ArchitecturaltemplatesPackage.AT: {
			AT at = (AT) theEObject;
			T result = caseAT(at);
			if (result == null)
				result = caseEntity(at);
			if (result == null)
				result = caseIdentifier(at);
			if (result == null)
				result = caseNamedElement(at);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = caseEntity(constraint);
			if (result == null)
				result = caseIdentifier(constraint);
			if (result == null)
				result = caseNamedElement(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.CATALOG: {
			Catalog catalog = (Catalog) theEObject;
			T result = caseCatalog(catalog);
			if (result == null)
				result = caseEntity(catalog);
			if (result == null)
				result = caseIdentifier(catalog);
			if (result == null)
				result = caseNamedElement(catalog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = caseEntity(role);
			if (result == null)
				result = caseIdentifier(role);
			if (result == null)
				result = caseNamedElement(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.OCL_CONSTRAINT: {
			OCLConstraint oclConstraint = (OCLConstraint) theEObject;
			T result = caseOCLConstraint(oclConstraint);
			if (result == null)
				result = caseConstraint(oclConstraint);
			if (result == null)
				result = caseEntity(oclConstraint);
			if (result == null)
				result = caseIdentifier(oclConstraint);
			if (result == null)
				result = caseNamedElement(oclConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.QVTO_COMPLETION: {
			QVTOCompletion qvtoCompletion = (QVTOCompletion) theEObject;
			T result = caseQVTOCompletion(qvtoCompletion);
			if (result == null)
				result = caseCompletion(qvtoCompletion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.COMPLETION: {
			Completion completion = (Completion) theEObject;
			T result = caseCompletion(completion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.COMPLETION_PARAMETER: {
			CompletionParameter completionParameter = (CompletionParameter) theEObject;
			T result = caseCompletionParameter(completionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.PCM_BLACKBOARD_COMPLETION_PARAMETER: {
			PCMBlackboardCompletionParameter pcmBlackboardCompletionParameter = (PCMBlackboardCompletionParameter) theEObject;
			T result = casePCMBlackboardCompletionParameter(pcmBlackboardCompletionParameter);
			if (result == null)
				result = casePCMCompletionParameter(pcmBlackboardCompletionParameter);
			if (result == null)
				result = caseCompletionParameter(pcmBlackboardCompletionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.PCM_TEMPLATE_COMPLETION_PARAMETER: {
			PCMTemplateCompletionParameter pcmTemplateCompletionParameter = (PCMTemplateCompletionParameter) theEObject;
			T result = casePCMTemplateCompletionParameter(pcmTemplateCompletionParameter);
			if (result == null)
				result = casePCMCompletionParameter(pcmTemplateCompletionParameter);
			if (result == null)
				result = caseCompletionParameter(pcmTemplateCompletionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.PCM_OUTPUT_COMPLETION_PARAMETER: {
			PCMOutputCompletionParameter pcmOutputCompletionParameter = (PCMOutputCompletionParameter) theEObject;
			T result = casePCMOutputCompletionParameter(pcmOutputCompletionParameter);
			if (result == null)
				result = casePCMCompletionParameter(pcmOutputCompletionParameter);
			if (result == null)
				result = caseCompletionParameter(pcmOutputCompletionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.RECONFIGURATION_FOLDER: {
			ReconfigurationFolder reconfigurationFolder = (ReconfigurationFolder) theEObject;
			T result = caseReconfigurationFolder(reconfigurationFolder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER: {
			IsolatedPCMTemplateCompletionParameter isolatedPCMTemplateCompletionParameter = (IsolatedPCMTemplateCompletionParameter) theEObject;
			T result = caseIsolatedPCMTemplateCompletionParameter(isolatedPCMTemplateCompletionParameter);
			if (result == null)
				result = casePCMTemplateCompletionParameter(isolatedPCMTemplateCompletionParameter);
			if (result == null)
				result = casePCMCompletionParameter(isolatedPCMTemplateCompletionParameter);
			if (result == null)
				result = caseCompletionParameter(isolatedPCMTemplateCompletionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.PCM_COMPLETION_PARAMETER: {
			PCMCompletionParameter pcmCompletionParameter = (PCMCompletionParameter) theEObject;
			T result = casePCMCompletionParameter(pcmCompletionParameter);
			if (result == null)
				result = caseCompletionParameter(pcmCompletionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.FILE_EXTENSION: {
			FileExtension fileExtension = (FileExtension) theEObject;
			T result = caseFileExtension(fileExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.PCM_FILE_EXTENSION: {
			PCMFileExtension pcmFileExtension = (PCMFileExtension) theEObject;
			T result = casePCMFileExtension(pcmFileExtension);
			if (result == null)
				result = caseFileExtension(pcmFileExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArchitecturaltemplatesPackage.GENERIC_FILE_EXTENSION: {
			GenericFileExtension genericFileExtension = (GenericFileExtension) theEObject;
			T result = caseGenericFileExtension(genericFileExtension);
			if (result == null)
				result = caseFileExtension(genericFileExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AT</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAT(AT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalog(Catalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Constraint</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLConstraint(OCLConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QVTO Completion</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QVTO Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQVTOCompletion(QVTOCompletion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletion(Completion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Completion Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Completion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompletionParameter(CompletionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Blackboard Completion Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Blackboard Completion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMBlackboardCompletionParameter(PCMBlackboardCompletionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Template Completion Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Template Completion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMTemplateCompletionParameter(PCMTemplateCompletionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Output Completion Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Output Completion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMOutputCompletionParameter(PCMOutputCompletionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reconfiguration Folder</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reconfiguration Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReconfigurationFolder(ReconfigurationFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Isolated PCM Template Completion Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Isolated PCM Template Completion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsolatedPCMTemplateCompletionParameter(IsolatedPCMTemplateCompletionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Completion Parameter</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Completion Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMCompletionParameter(PCMCompletionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Extension</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileExtension(FileExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM File Extension</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM File Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCMFileExtension(PCMFileExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic File Extension</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a
	 * non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic File Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericFileExtension(GenericFileExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // ArchitecturaltemplatesSwitch
