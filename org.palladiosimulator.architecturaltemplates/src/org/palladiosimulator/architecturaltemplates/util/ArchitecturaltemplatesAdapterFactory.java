/**
 */
package org.palladiosimulator.architecturaltemplates.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage
 * @generated
 */
public class ArchitecturaltemplatesAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ArchitecturaltemplatesPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ArchitecturaltemplatesAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ArchitecturaltemplatesPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ArchitecturaltemplatesSwitch<Adapter> modelSwitch = new ArchitecturaltemplatesSwitch<Adapter>() {

        @Override
        public Adapter caseAT(final AT object) {
            return ArchitecturaltemplatesAdapterFactory.this.createATAdapter();
        }

        @Override
        public Adapter caseConstraint(final Constraint object) {
            return ArchitecturaltemplatesAdapterFactory.this.createConstraintAdapter();
        }

        @Override
        public Adapter caseCatalog(final Catalog object) {
            return ArchitecturaltemplatesAdapterFactory.this.createCatalogAdapter();
        }

        @Override
        public Adapter caseRole(final Role object) {
            return ArchitecturaltemplatesAdapterFactory.this.createRoleAdapter();
        }

        @Override
        public Adapter caseOCLConstraint(final OCLConstraint object) {
            return ArchitecturaltemplatesAdapterFactory.this.createOCLConstraintAdapter();
        }

        @Override
        public Adapter caseQVTOCompletion(final QVTOCompletion object) {
            return ArchitecturaltemplatesAdapterFactory.this.createQVTOCompletionAdapter();
        }

        @Override
        public Adapter caseCompletion(final Completion object) {
            return ArchitecturaltemplatesAdapterFactory.this.createCompletionAdapter();
        }

        @Override
        public Adapter caseCompletionParameter(final CompletionParameter object) {
            return ArchitecturaltemplatesAdapterFactory.this.createCompletionParameterAdapter();
        }

        @Override
        public Adapter casePCMBlackboardCompletionParameter(final PCMBlackboardCompletionParameter object) {
            return ArchitecturaltemplatesAdapterFactory.this.createPCMBlackboardCompletionParameterAdapter();
        }

        @Override
        public Adapter casePCMTemplateCompletionParameter(final PCMTemplateCompletionParameter object) {
            return ArchitecturaltemplatesAdapterFactory.this.createPCMTemplateCompletionParameterAdapter();
        }

        @Override
        public Adapter casePCMOutputCompletionParameter(final PCMOutputCompletionParameter object) {
            return ArchitecturaltemplatesAdapterFactory.this.createPCMOutputCompletionParameterAdapter();
        }

        @Override
        public Adapter caseReconfigurationFolder(final ReconfigurationFolder object) {
            return ArchitecturaltemplatesAdapterFactory.this.createReconfigurationFolderAdapter();
        }

        @Override
        public Adapter caseIsolatedPCMTemplateCompletionParameter(final IsolatedPCMTemplateCompletionParameter object) {
            return ArchitecturaltemplatesAdapterFactory.this.createIsolatedPCMTemplateCompletionParameterAdapter();
        }

        @Override
        public Adapter casePCMCompletionParameter(final PCMCompletionParameter object) {
            return ArchitecturaltemplatesAdapterFactory.this.createPCMCompletionParameterAdapter();
        }

        @Override
        public Adapter caseFileExtension(final FileExtension object) {
            return ArchitecturaltemplatesAdapterFactory.this.createFileExtensionAdapter();
        }

        @Override
        public Adapter casePCMFileExtension(final PCMFileExtension object) {
            return ArchitecturaltemplatesAdapterFactory.this.createPCMFileExtensionAdapter();
        }

        @Override
        public Adapter caseGenericFileExtension(final GenericFileExtension object) {
            return ArchitecturaltemplatesAdapterFactory.this.createGenericFileExtensionAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return ArchitecturaltemplatesAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object) {
            return ArchitecturaltemplatesAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return ArchitecturaltemplatesAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return ArchitecturaltemplatesAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.AT <em>AT</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.AT
     * @generated
     */
    public Adapter createATAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.Constraint <em>Constraint</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.Constraint
     * @generated
     */
    public Adapter createConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.Catalog <em>Catalog</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.Catalog
     * @generated
     */
    public Adapter createCatalogAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.Role <em>Role</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.Role
     * @generated
     */
    public Adapter createRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.OCLConstraint <em>OCL Constraint</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.OCLConstraint
     * @generated
     */
    public Adapter createOCLConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.QVTOCompletion <em>QVTO
     * Completion</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.QVTOCompletion
     * @generated
     */
    public Adapter createQVTOCompletionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.Completion <em>Completion</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.Completion
     * @generated
     */
    public Adapter createCompletionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.CompletionParameter <em>Completion
     * Parameter</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.CompletionParameter
     * @generated
     */
    public Adapter createCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter <em>PCM
     * Blackboard Completion Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.PCMBlackboardCompletionParameter
     * @generated
     */
    public Adapter createPCMBlackboardCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter <em>PCM
     * Template Completion Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.PCMTemplateCompletionParameter
     * @generated
     */
    public Adapter createPCMTemplateCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter <em>PCM
     * Output Completion Parameter</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.PCMOutputCompletionParameter
     * @generated
     */
    public Adapter createPCMOutputCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.ReconfigurationFolder
     * <em>Reconfiguration Folder</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.ReconfigurationFolder
     * @generated
     */
    public Adapter createReconfigurationFolderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter
     * <em>Isolated PCM Template Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.IsolatedPCMTemplateCompletionParameter
     * @generated
     */
    public Adapter createIsolatedPCMTemplateCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.PCMCompletionParameter <em>PCM
     * Completion Parameter</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.PCMCompletionParameter
     * @generated
     */
    public Adapter createPCMCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.FileExtension <em>File Extension</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.FileExtension
     * @generated
     */
    public Adapter createFileExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.PCMFileExtension <em>PCM File
     * Extension</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.PCMFileExtension
     * @generated
     */
    public Adapter createPCMFileExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.architecturaltemplates.GenericFileExtension <em>Generic File
     * Extension</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.architecturaltemplates.GenericFileExtension
     * @generated
     */
    public Adapter createGenericFileExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ArchitecturaltemplatesAdapterFactory
