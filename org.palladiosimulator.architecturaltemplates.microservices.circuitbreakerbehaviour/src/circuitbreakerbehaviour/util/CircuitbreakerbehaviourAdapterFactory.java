/**
 */
package circuitbreakerbehaviour.util;

import circuitbreakerbehaviour.*;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see circuitbreakerbehaviour.CircuitbreakerbehaviourPackage
 * @generated
 */
public class CircuitbreakerbehaviourAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircuitbreakerbehaviourPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitbreakerbehaviourAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CircuitbreakerbehaviourPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitbreakerbehaviourSwitch<Adapter> modelSwitch =
		new CircuitbreakerbehaviourSwitch<Adapter>() {
			@Override
			public Adapter caseCircuitBreakerRDSEFF(CircuitBreakerRDSEFF object) {
				return createCircuitBreakerRDSEFFAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseServiceEffectSpecification(ServiceEffectSpecification object) {
				return createServiceEffectSpecificationAdapter();
			}
			@Override
			public Adapter caseResourceDemandingBehaviour(ResourceDemandingBehaviour object) {
				return createResourceDemandingBehaviourAdapter();
			}
			@Override
			public Adapter caseResourceDemandingSEFF(ResourceDemandingSEFF object) {
				return createResourceDemandingSEFFAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link circuitbreakerbehaviour.CircuitBreakerRDSEFF <em>Circuit Breaker RDSEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuitbreakerbehaviour.CircuitBreakerRDSEFF
	 * @generated
	 */
	public Adapter createCircuitBreakerRDSEFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.seff.ServiceEffectSpecification <em>Service Effect Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.seff.ServiceEffectSpecification
	 * @generated
	 */
	public Adapter createServiceEffectSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour <em>Resource Demanding Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.seff.ResourceDemandingBehaviour
	 * @generated
	 */
	public Adapter createResourceDemandingBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.seff.ResourceDemandingSEFF <em>Resource Demanding SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.seff.ResourceDemandingSEFF
	 * @generated
	 */
	public Adapter createResourceDemandingSEFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CircuitbreakerbehaviourAdapterFactory
