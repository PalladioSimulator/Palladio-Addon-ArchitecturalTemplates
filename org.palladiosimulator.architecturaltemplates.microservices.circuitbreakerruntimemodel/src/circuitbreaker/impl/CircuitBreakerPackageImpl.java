/**
 */
package circuitbreaker.impl;

import circuitbreaker.CircuitBreakerFactory;
import circuitbreaker.CircuitBreakerPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitBreakerPackageImpl extends EPackageImpl implements CircuitBreakerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "circuitbreaker.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitBreakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitBreakerModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum circuitBreakerStateEEnum = null;

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
	 * @see circuitbreaker.CircuitBreakerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircuitBreakerPackageImpl() {
		super(eNS_URI, CircuitBreakerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CircuitBreakerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CircuitBreakerPackage init() {
		if (isInited) return (CircuitBreakerPackage)EPackage.Registry.INSTANCE.getEPackage(CircuitBreakerPackage.eNS_URI);

		// Obtain or create and register package
		CircuitBreakerPackageImpl theCircuitBreakerPackage = (CircuitBreakerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CircuitBreakerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CircuitBreakerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Load packages
		theCircuitBreakerPackage.loadPackage();

		// Fix loaded packages
		theCircuitBreakerPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCircuitBreakerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircuitBreakerPackage.eNS_URI, theCircuitBreakerPackage);
		return theCircuitBreakerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitBreaker() {
		if (circuitBreakerEClass == null) {
			circuitBreakerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CircuitBreakerPackage.eNS_URI).getEClassifiers().get(0);
		}
		return circuitBreakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreaker_CircuitBreakerState() {
        return (EAttribute)getCircuitBreaker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreaker_NumberOfFails() {
        return (EAttribute)getCircuitBreaker().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuitBreaker_OpenTimeStamp() {
        return (EAttribute)getCircuitBreaker().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitBreaker_Signatures() {
        return (EReference)getCircuitBreaker().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitBreaker_CircuitBreakerModel() {
        return (EReference)getCircuitBreaker().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitBreakerModel() {
		if (circuitBreakerModelEClass == null) {
			circuitBreakerModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CircuitBreakerPackage.eNS_URI).getEClassifiers().get(2);
		}
		return circuitBreakerModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitBreakerModel_CircuitBreakers() {
        return (EReference)getCircuitBreakerModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCircuitBreakerState() {
		if (circuitBreakerStateEEnum == null) {
			circuitBreakerStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CircuitBreakerPackage.eNS_URI).getEClassifiers().get(1);
		}
		return circuitBreakerStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitBreakerFactory getCircuitBreakerFactory() {
		return (CircuitBreakerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("circuitbreaker." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CircuitBreakerPackageImpl
