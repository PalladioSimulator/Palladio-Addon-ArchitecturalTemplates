/**
 */
package circuitbreakerbehaviour.impl;

import circuitbreakerbehaviour.CircuitBreakerRDSEFF;
import circuitbreakerbehaviour.CircuitbreakerbehaviourFactory;
import circuitbreakerbehaviour.CircuitbreakerbehaviourPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.seff.SeffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitbreakerbehaviourPackageImpl extends EPackageImpl implements CircuitbreakerbehaviourPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitBreakerRDSEFFEClass = null;
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
	 * @see circuitbreakerbehaviour.CircuitbreakerbehaviourPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircuitbreakerbehaviourPackageImpl() {
		super(eNS_URI, CircuitbreakerbehaviourFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CircuitbreakerbehaviourPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CircuitbreakerbehaviourPackage init() {
		if (isInited) return (CircuitbreakerbehaviourPackage)EPackage.Registry.INSTANCE.getEPackage(CircuitbreakerbehaviourPackage.eNS_URI);

		// Obtain or create and register package
		CircuitbreakerbehaviourPackageImpl theCircuitbreakerbehaviourPackage = (CircuitbreakerbehaviourPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CircuitbreakerbehaviourPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CircuitbreakerbehaviourPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCircuitbreakerbehaviourPackage.createPackageContents();

		// Initialize created meta-data
		theCircuitbreakerbehaviourPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCircuitbreakerbehaviourPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircuitbreakerbehaviourPackage.eNS_URI, theCircuitbreakerbehaviourPackage);
		return theCircuitbreakerbehaviourPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitBreakerRDSEFF() {
		return circuitBreakerRDSEFFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreakerRDSEFF_Timeout() {
		return (EAttribute)circuitBreakerRDSEFFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitbreakerbehaviourFactory getCircuitbreakerbehaviourFactory() {
		return (CircuitbreakerbehaviourFactory)getEFactoryInstance();
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
		circuitBreakerRDSEFFEClass = createEClass(CIRCUIT_BREAKER_RDSEFF);
		createEAttribute(circuitBreakerRDSEFFEClass, CIRCUIT_BREAKER_RDSEFF__TIMEOUT);
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
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		circuitBreakerRDSEFFEClass.getESuperTypes().add(theSeffPackage.getResourceDemandingSEFF());

		// Initialize classes and features; add operations and parameters
		initEClass(circuitBreakerRDSEFFEClass, CircuitBreakerRDSEFF.class, "CircuitBreakerRDSEFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircuitBreakerRDSEFF_Timeout(), ecorePackage.getEDouble(), "timeout", "3000.0", 1, 1, CircuitBreakerRDSEFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CircuitbreakerbehaviourPackageImpl
