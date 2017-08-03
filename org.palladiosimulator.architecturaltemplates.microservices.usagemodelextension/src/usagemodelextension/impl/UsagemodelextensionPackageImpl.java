/**
 */
package usagemodelextension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.parameter.ParameterPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import usagemodelextension.APIGatewayEntryLevelSystemCall;
import usagemodelextension.UsagemodelextensionFactory;
import usagemodelextension.UsagemodelextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsagemodelextensionPackageImpl extends EPackageImpl implements UsagemodelextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiGatewayEntryLevelSystemCallEClass = null;
	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see usagemodelextension.UsagemodelextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsagemodelextensionPackageImpl() {
		super(eNS_URI, UsagemodelextensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UsagemodelextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsagemodelextensionPackage init() {
		if (isInited) return (UsagemodelextensionPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelextensionPackage.eNS_URI);

		// Obtain or create and register package
		UsagemodelextensionPackageImpl theUsagemodelextensionPackage = (UsagemodelextensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsagemodelextensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsagemodelextensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUsagemodelextensionPackage.createPackageContents();

		// Initialize created meta-data
		theUsagemodelextensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsagemodelextensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsagemodelextensionPackage.eNS_URI, theUsagemodelextensionPackage);
		return theUsagemodelextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIGatewayEntryLevelSystemCall() {
		return apiGatewayEntryLevelSystemCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIGatewayEntryLevelSystemCall_Priority() {
		return (EAttribute)apiGatewayEntryLevelSystemCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIGatewayEntryLevelSystemCall_OperationSignature__APIGatewayEntryLevelSystemCall() {
		return (EReference)apiGatewayEntryLevelSystemCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIGatewayEntryLevelSystemCall_OutputParameterUsages_APIGatewayEntryLevelSystemCall() {
		return (EReference)apiGatewayEntryLevelSystemCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPIGatewayEntryLevelSystemCall_InputParameterUsages_APIGatewayEntryLevelSystemCall() {
		return (EReference)apiGatewayEntryLevelSystemCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsagemodelextensionFactory getUsagemodelextensionFactory() {
		return (UsagemodelextensionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apiGatewayEntryLevelSystemCallEClass = createEClass(API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL);
		createEAttribute(apiGatewayEntryLevelSystemCallEClass, API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__PRIORITY);
		createEReference(apiGatewayEntryLevelSystemCallEClass, API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OPERATION_SIGNATURE_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL);
		createEReference(apiGatewayEntryLevelSystemCallEClass, API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__OUTPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL);
		createEReference(apiGatewayEntryLevelSystemCallEClass, API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL__INPUT_PARAMETER_USAGES_API_GATEWAY_ENTRY_LEVEL_SYSTEM_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		ParameterPackage theParameterPackage = (ParameterPackage)EPackage.Registry.INSTANCE.getEPackage(ParameterPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apiGatewayEntryLevelSystemCallEClass.getESuperTypes().add(theUsagemodelPackage.getAbstractUserAction());

		// Initialize classes and features; add operations and parameters
		initEClass(apiGatewayEntryLevelSystemCallEClass, APIGatewayEntryLevelSystemCall.class, "APIGatewayEntryLevelSystemCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIGatewayEntryLevelSystemCall_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, APIGatewayEntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIGatewayEntryLevelSystemCall_OperationSignature__APIGatewayEntryLevelSystemCall(), theRepositoryPackage.getOperationSignature(), null, "operationSignature__APIGatewayEntryLevelSystemCall", null, 1, 1, APIGatewayEntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIGatewayEntryLevelSystemCall_OutputParameterUsages_APIGatewayEntryLevelSystemCall(), theParameterPackage.getVariableUsage(), null, "outputParameterUsages_APIGatewayEntryLevelSystemCall", null, 0, -1, APIGatewayEntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAPIGatewayEntryLevelSystemCall_InputParameterUsages_APIGatewayEntryLevelSystemCall(), theParameterPackage.getVariableUsage(), null, "inputParameterUsages_APIGatewayEntryLevelSystemCall", null, 0, -1, APIGatewayEntryLevelSystemCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UsagemodelextensionPackageImpl
