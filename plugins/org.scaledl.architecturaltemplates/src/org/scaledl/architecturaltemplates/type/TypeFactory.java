/**
 */
package org.scaledl.architecturaltemplates.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.scaledl.architecturaltemplates.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TypeFactory eINSTANCE = org.scaledl.architecturaltemplates.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>AT</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>AT</em>'.
     * @generated
     */
    AT createAT();

    /**
     * Returns a new object of class '<em>Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Catalog</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return a new object of class '<em>Catalog</em>'.
     * @generated
     */
    Catalog createCatalog();

    /**
     * Returns a new object of class '<em>Role</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Role</em>'.
     * @generated
     */
    Role createRole();

    /**
     * Returns a new object of class '<em>OCL Constraint</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>OCL Constraint</em>'.
     * @generated
     */
    OCLConstraint createOCLConstraint();

    /**
     * Returns a new object of class '<em>QVTO Completion</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>QVTO Completion</em>'.
     * @generated
     */
    QVTOCompletion createQVTOCompletion();

    /**
     * Returns a new object of class '<em>Generic Template Completion Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Generic Template Completion Parameter</em>'.
     * @generated
     */
    GenericTemplateCompletionParameter createGenericTemplateCompletionParameter();

    /**
     * Returns a new object of class '<em>Generic Blackboard Completion Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Generic Blackboard Completion Parameter</em>'.
     * @generated
     */
    GenericBlackboardCompletionParameter createGenericBlackboardCompletionParameter();

    /**
     * Returns a new object of class '<em>PCM Blackboard Completion Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>PCM Blackboard Completion Parameter</em>'.
     * @generated
     */
    PCMBlackboardCompletionParameter createPCMBlackboardCompletionParameter();

    /**
     * Returns a new object of class '<em>PCM Template Completion Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>PCM Template Completion Parameter</em>'.
     * @generated
     */
    PCMTemplateCompletionParameter createPCMTemplateCompletionParameter();

    /**
     * Returns a new object of class '<em>PCM Output Completion Parameter</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>PCM Output Completion Parameter</em>'.
     * @generated
     */
    PCMOutputCompletionParameter createPCMOutputCompletionParameter();

    /**
     * Returns a new object of class '<em>Generic Output Completion Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Generic Output Completion Parameter</em>'.
     * @generated
     */
    GenericOutputCompletionParameter createGenericOutputCompletionParameter();

    /**
     * Returns a new object of class '<em>Reconfiguration Folder</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Reconfiguration Folder</em>'.
     * @generated
     */
    ReconfigurationFolder createReconfigurationFolder();

    /**
     * Returns a new object of class '<em>Isolated PCM Template Completion Parameter</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Isolated PCM Template Completion Parameter</em>'.
     * @generated
     */
    IsolatedPCMTemplateCompletionParameter createIsolatedPCMTemplateCompletionParameter();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} // TypeFactory
