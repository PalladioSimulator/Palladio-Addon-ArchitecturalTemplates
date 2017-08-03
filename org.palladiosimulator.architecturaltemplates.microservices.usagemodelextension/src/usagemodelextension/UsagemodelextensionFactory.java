/**
 */
package usagemodelextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see usagemodelextension.UsagemodelextensionPackage
 * @generated
 */
public interface UsagemodelextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsagemodelextensionFactory eINSTANCE = usagemodelextension.impl.UsagemodelextensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>API Gateway Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Gateway Entry Level System Call</em>'.
	 * @generated
	 */
	APIGatewayEntryLevelSystemCall createAPIGatewayEntryLevelSystemCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsagemodelextensionPackage getUsagemodelextensionPackage();

} //UsagemodelextensionFactory
