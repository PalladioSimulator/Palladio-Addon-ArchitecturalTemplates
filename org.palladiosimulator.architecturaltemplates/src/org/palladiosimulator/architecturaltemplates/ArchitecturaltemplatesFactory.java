/**
 */
package org.palladiosimulator.architecturaltemplates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage
 * @generated
 */
public interface ArchitecturaltemplatesFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturaltemplatesFactory eINSTANCE = org.palladiosimulator.architecturaltemplates.impl.ArchitecturaltemplatesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>AT</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AT</em>'.
	 * @generated
	 */
	AT createAT();

	/**
	 * Returns a new object of class '<em>Catalog</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return a new object of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>OCL Constraint</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>OCL Constraint</em>'.
	 * @generated
	 */
	OCLConstraint createOCLConstraint();

	/**
	 * Returns a new object of class '<em>QVTO Completion</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>QVTO Completion</em>'.
	 * @generated
	 */
	QVTOCompletion createQVTOCompletion();

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
	 * Returns a new object of class '<em>PCM Output Completion Parameter</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>PCM Output Completion Parameter</em>'.
	 * @generated
	 */
	PCMOutputCompletionParameter createPCMOutputCompletionParameter();

	/**
	 * Returns a new object of class '<em>Reconfiguration Folder</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * Returns a new object of class '<em>PCM File Extension</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>PCM File Extension</em>'.
	 * @generated
	 */
	PCMFileExtension createPCMFileExtension();

	/**
	 * Returns a new object of class '<em>Generic File Extension</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Generic File Extension</em>'.
	 * @generated
	 */
	GenericFileExtension createGenericFileExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArchitecturaltemplatesPackage getArchitecturaltemplatesPackage();

} // ArchitecturaltemplatesFactory
