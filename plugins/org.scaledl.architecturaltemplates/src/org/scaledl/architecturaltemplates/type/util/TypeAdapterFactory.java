/**
 */
package org.scaledl.architecturaltemplates.type.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.scaledl.architecturaltemplates.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
    protected TypeSwitch<Adapter> modelSwitch = new TypeSwitch<Adapter>() {

        @Override
        public Adapter caseAT(final AT object) {
            return TypeAdapterFactory.this.createATAdapter();
        }

        @Override
        public Adapter caseConstraint(final Constraint object) {
            return TypeAdapterFactory.this.createConstraintAdapter();
        }

        @Override
        public Adapter caseParameter(final Parameter object) {
            return TypeAdapterFactory.this.createParameterAdapter();
        }

        @Override
        public Adapter caseCatalog(final Catalog object) {
            return TypeAdapterFactory.this.createCatalogAdapter();
        }

        @Override
        public Adapter caseRole(final Role object) {
            return TypeAdapterFactory.this.createRoleAdapter();
        }

        @Override
        public Adapter caseOCLConstraint(final OCLConstraint object) {
            return TypeAdapterFactory.this.createOCLConstraintAdapter();
        }

        @Override
        public Adapter caseQVTOCompletion(final QVTOCompletion object) {
            return TypeAdapterFactory.this.createQVTOCompletionAdapter();
        }

        @Override
        public Adapter caseCompletion(final Completion object) {
            return TypeAdapterFactory.this.createCompletionAdapter();
        }

        @Override
        public Adapter caseCompletionParameter(final CompletionParameter object) {
            return TypeAdapterFactory.this.createCompletionParameterAdapter();
        }

        @Override
        public Adapter caseGenericTemplateCompletionParameter(final GenericTemplateCompletionParameter object) {
            return TypeAdapterFactory.this.createGenericTemplateCompletionParameterAdapter();
        }

        @Override
        public Adapter caseGenericBlackboardCompletionParameter(final GenericBlackboardCompletionParameter object) {
            return TypeAdapterFactory.this.createGenericBlackboardCompletionParameterAdapter();
        }

        @Override
        public Adapter casePCMBlackboardCompletionParameter(final PCMBlackboardCompletionParameter object) {
            return TypeAdapterFactory.this.createPCMBlackboardCompletionParameterAdapter();
        }

        @Override
        public Adapter casePCMTemplateCompletionParameter(final PCMTemplateCompletionParameter object) {
            return TypeAdapterFactory.this.createPCMTemplateCompletionParameterAdapter();
        }

        @Override
        public Adapter caseTemplateProvidingEntity(final TemplateProvidingEntity object) {
            return TypeAdapterFactory.this.createTemplateProvidingEntityAdapter();
        }

        @Override
        public Adapter casePCMOutputCompletionParameter(final PCMOutputCompletionParameter object) {
            return TypeAdapterFactory.this.createPCMOutputCompletionParameterAdapter();
        }

        @Override
        public Adapter caseGenericOutputCompletionParameter(final GenericOutputCompletionParameter object) {
            return TypeAdapterFactory.this.createGenericOutputCompletionParameterAdapter();
        }

        @Override
        public Adapter caseReconfigurationFolder(final ReconfigurationFolder object) {
            return TypeAdapterFactory.this.createReconfigurationFolderAdapter();
        }

        @Override
        public Adapter caseIsolatedPCMTemplateCompletionParameter(final IsolatedPCMTemplateCompletionParameter object) {
            return TypeAdapterFactory.this.createIsolatedPCMTemplateCompletionParameterAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return TypeAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object) {
            return TypeAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return TypeAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return TypeAdapterFactory.this.createEObjectAdapter();
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
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.AT <em>AT</em>}'. <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases; it's useful to ignore
     * a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.AT
     * @generated
     */
    public Adapter createATAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.Constraint <em>Constraint</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.Constraint
     * @generated
     */
    public Adapter createConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.Parameter <em>Parameter</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.Catalog <em>Catalog</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.Catalog
     * @generated
     */
    public Adapter createCatalogAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.Role <em>Role</em>}'. <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases; it's useful to
     * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.Role
     * @generated
     */
    public Adapter createRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.OCLConstraint <em>OCL Constraint</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.OCLConstraint
     * @generated
     */
    public Adapter createOCLConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.QVTOCompletion <em>QVTO Completion</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.QVTOCompletion
     * @generated
     */
    public Adapter createQVTOCompletionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.Completion <em>Completion</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.Completion
     * @generated
     */
    public Adapter createCompletionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.CompletionParameter
     * <em>Completion Parameter</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.CompletionParameter
     * @generated
     */
    public Adapter createCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter
     * <em>Generic Template Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.GenericTemplateCompletionParameter
     * @generated
     */
    public Adapter createGenericTemplateCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter
     * <em>Generic Blackboard Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.GenericBlackboardCompletionParameter
     * @generated
     */
    public Adapter createGenericBlackboardCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter
     * <em>PCM Blackboard Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.PCMBlackboardCompletionParameter
     * @generated
     */
    public Adapter createPCMBlackboardCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter
     * <em>PCM Template Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.PCMTemplateCompletionParameter
     * @generated
     */
    public Adapter createPCMTemplateCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.TemplateProvidingEntity
     * <em>Template Providing Entity</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.TemplateProvidingEntity
     * @generated
     */
    public Adapter createTemplateProvidingEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter
     * <em>PCM Output Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.PCMOutputCompletionParameter
     * @generated
     */
    public Adapter createPCMOutputCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter
     * <em>Generic Output Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.GenericOutputCompletionParameter
     * @generated
     */
    public Adapter createGenericOutputCompletionParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.ReconfigurationFolder
     * <em>Reconfiguration Folder</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.ReconfigurationFolder
     * @generated
     */
    public Adapter createReconfigurationFolderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter
     * <em>Isolated PCM Template Completion Parameter</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter
     * @generated
     */
    public Adapter createIsolatedPCMTemplateCompletionParameterAdapter() {
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
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
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
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
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

} // TypeAdapterFactory
