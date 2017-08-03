/**
 */
package usagemodelextension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import usagemodelextension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsagemodelextensionFactoryImpl extends EFactoryImpl implements UsagemodelextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsagemodelextensionFactory init() {
		try {
			UsagemodelextensionFactory theUsagemodelextensionFactory = (UsagemodelextensionFactory)EPackage.Registry.INSTANCE.getEFactory(UsagemodelextensionPackage.eNS_URI);
			if (theUsagemodelextensionFactory != null) {
				return theUsagemodelextensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsagemodelextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagemodelextensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsagemodelextensionPackage.API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL: return createAPIGatewayEntryLevelSystemCall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIGatewayEntryLevelSystemCall createAPIGatewayEntryLevelSystemCall() {
		APIGatewayEntryLevelSystemCallImpl apiGatewayEntryLevelSystemCall = new APIGatewayEntryLevelSystemCallImpl();
		return apiGatewayEntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagemodelextensionPackage getUsagemodelextensionPackage() {
		return (UsagemodelextensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsagemodelextensionPackage getPackage() {
		return UsagemodelextensionPackage.eINSTANCE;
	}

} //UsagemodelextensionFactoryImpl
