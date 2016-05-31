/**
 */
package org.scaledl.architecturaltemplates.type.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.scaledl.architecturaltemplates.type.AT;
import org.scaledl.architecturaltemplates.type.Catalog;
import org.scaledl.architecturaltemplates.type.Completion;
import org.scaledl.architecturaltemplates.type.CompletionParameter;
import org.scaledl.architecturaltemplates.type.Constraint;
import org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter;
import org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter;
import org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.OCLConstraint;
import org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter;
import org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter;
import org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.Parameter;
import org.scaledl.architecturaltemplates.type.QVTOCompletion;
import org.scaledl.architecturaltemplates.type.ReconfigurationFolder;
import org.scaledl.architecturaltemplates.type.Role;
import org.scaledl.architecturaltemplates.type.TemplateProvidingEntity;
import org.scaledl.architecturaltemplates.type.TypePackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.scaledl.architecturaltemplates.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {

    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case TypePackage.AT: {
            final AT at = (AT) theEObject;
            T result = this.caseAT(at);
            if (result == null) {
                result = this.caseEntity(at);
            }
            if (result == null) {
                result = this.caseIdentifier(at);
            }
            if (result == null) {
                result = this.caseNamedElement(at);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.CONSTRAINT: {
            final Constraint constraint = (Constraint) theEObject;
            T result = this.caseConstraint(constraint);
            if (result == null) {
                result = this.caseEntity(constraint);
            }
            if (result == null) {
                result = this.caseIdentifier(constraint);
            }
            if (result == null) {
                result = this.caseNamedElement(constraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.PARAMETER: {
            final Parameter parameter = (Parameter) theEObject;
            T result = this.caseParameter(parameter);
            if (result == null) {
                result = this.caseEntity(parameter);
            }
            if (result == null) {
                result = this.caseIdentifier(parameter);
            }
            if (result == null) {
                result = this.caseNamedElement(parameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.CATALOG: {
            final Catalog catalog = (Catalog) theEObject;
            T result = this.caseCatalog(catalog);
            if (result == null) {
                result = this.caseEntity(catalog);
            }
            if (result == null) {
                result = this.caseIdentifier(catalog);
            }
            if (result == null) {
                result = this.caseNamedElement(catalog);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.ROLE: {
            final Role role = (Role) theEObject;
            T result = this.caseRole(role);
            if (result == null) {
                result = this.caseEntity(role);
            }
            if (result == null) {
                result = this.caseIdentifier(role);
            }
            if (result == null) {
                result = this.caseNamedElement(role);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.OCL_CONSTRAINT: {
            final OCLConstraint oclConstraint = (OCLConstraint) theEObject;
            T result = this.caseOCLConstraint(oclConstraint);
            if (result == null) {
                result = this.caseConstraint(oclConstraint);
            }
            if (result == null) {
                result = this.caseEntity(oclConstraint);
            }
            if (result == null) {
                result = this.caseIdentifier(oclConstraint);
            }
            if (result == null) {
                result = this.caseNamedElement(oclConstraint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.QVTO_COMPLETION: {
            final QVTOCompletion qvtoCompletion = (QVTOCompletion) theEObject;
            T result = this.caseQVTOCompletion(qvtoCompletion);
            if (result == null) {
                result = this.caseCompletion(qvtoCompletion);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.COMPLETION: {
            final Completion completion = (Completion) theEObject;
            T result = this.caseCompletion(completion);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.COMPLETION_PARAMETER: {
            final CompletionParameter completionParameter = (CompletionParameter) theEObject;
            T result = this.caseCompletionParameter(completionParameter);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.GENERIC_TEMPLATE_COMPLETION_PARAMETER: {
            final GenericTemplateCompletionParameter genericTemplateCompletionParameter = (GenericTemplateCompletionParameter) theEObject;
            T result = this.caseGenericTemplateCompletionParameter(genericTemplateCompletionParameter);
            if (result == null) {
                result = this.caseGenericBlackboardCompletionParameter(genericTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.caseTemplateProvidingEntity(genericTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.caseCompletionParameter(genericTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.GENERIC_BLACKBOARD_COMPLETION_PARAMETER: {
            final GenericBlackboardCompletionParameter genericBlackboardCompletionParameter = (GenericBlackboardCompletionParameter) theEObject;
            T result = this.caseGenericBlackboardCompletionParameter(genericBlackboardCompletionParameter);
            if (result == null) {
                result = this.caseCompletionParameter(genericBlackboardCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.PCM_BLACKBOARD_COMPLETION_PARAMETER: {
            final PCMBlackboardCompletionParameter pcmBlackboardCompletionParameter = (PCMBlackboardCompletionParameter) theEObject;
            T result = this.casePCMBlackboardCompletionParameter(pcmBlackboardCompletionParameter);
            if (result == null) {
                result = this.caseCompletionParameter(pcmBlackboardCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.PCM_TEMPLATE_COMPLETION_PARAMETER: {
            final PCMTemplateCompletionParameter pcmTemplateCompletionParameter = (PCMTemplateCompletionParameter) theEObject;
            T result = this.casePCMTemplateCompletionParameter(pcmTemplateCompletionParameter);
            if (result == null) {
                result = this.casePCMBlackboardCompletionParameter(pcmTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.caseTemplateProvidingEntity(pcmTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.caseCompletionParameter(pcmTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.TEMPLATE_PROVIDING_ENTITY: {
            final TemplateProvidingEntity templateProvidingEntity = (TemplateProvidingEntity) theEObject;
            T result = this.caseTemplateProvidingEntity(templateProvidingEntity);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.PCM_OUTPUT_COMPLETION_PARAMETER: {
            final PCMOutputCompletionParameter pcmOutputCompletionParameter = (PCMOutputCompletionParameter) theEObject;
            T result = this.casePCMOutputCompletionParameter(pcmOutputCompletionParameter);
            if (result == null) {
                result = this.caseCompletionParameter(pcmOutputCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.GENERIC_OUTPUT_COMPLETION_PARAMETER: {
            final GenericOutputCompletionParameter genericOutputCompletionParameter = (GenericOutputCompletionParameter) theEObject;
            T result = this.caseGenericOutputCompletionParameter(genericOutputCompletionParameter);
            if (result == null) {
                result = this.caseCompletionParameter(genericOutputCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.RECONFIGURATION_FOLDER: {
            final ReconfigurationFolder reconfigurationFolder = (ReconfigurationFolder) theEObject;
            T result = this.caseReconfigurationFolder(reconfigurationFolder);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER: {
            final IsolatedPCMTemplateCompletionParameter isolatedPCMTemplateCompletionParameter = (IsolatedPCMTemplateCompletionParameter) theEObject;
            T result = this.caseIsolatedPCMTemplateCompletionParameter(isolatedPCMTemplateCompletionParameter);
            if (result == null) {
                result = this.casePCMBlackboardCompletionParameter(isolatedPCMTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.caseTemplateProvidingEntity(isolatedPCMTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.caseCompletionParameter(isolatedPCMTemplateCompletionParameter);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
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
    public T caseAT(final AT object) {
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
    public T caseConstraint(final Constraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameter(final Parameter object) {
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
    public T caseCatalog(final Catalog object) {
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
    public T caseRole(final Role object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>OCL Constraint</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>OCL Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOCLConstraint(final OCLConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>QVTO Completion</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>QVTO Completion</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQVTOCompletion(final QVTOCompletion object) {
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
    public T caseCompletion(final Completion object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Completion Parameter</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompletionParameter(final CompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Generic Template Completion Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Generic Template Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericTemplateCompletionParameter(final GenericTemplateCompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Generic Blackboard Completion Parameter</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Generic Blackboard Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericBlackboardCompletionParameter(final GenericBlackboardCompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>PCM Blackboard Completion Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>PCM Blackboard Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMBlackboardCompletionParameter(final PCMBlackboardCompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>PCM Template Completion Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>PCM Template Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMTemplateCompletionParameter(final PCMTemplateCompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Template Providing Entity</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Template Providing Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemplateProvidingEntity(final TemplateProvidingEntity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>PCM Output Completion Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>PCM Output Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMOutputCompletionParameter(final PCMOutputCompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Generic Output Completion Parameter</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Generic Output Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericOutputCompletionParameter(final GenericOutputCompletionParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Reconfiguration Folder</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Reconfiguration Folder</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReconfigurationFolder(final ReconfigurationFolder object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Isolated PCM Template Completion Parameter</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Isolated PCM Template Completion Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIsolatedPCMTemplateCompletionParameter(final IsolatedPCMTemplateCompletionParameter object) {
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
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
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
    public T caseEntity(final Entity object) {
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
    public T defaultCase(final EObject object) {
        return null;
    }

} // TypeSwitch
