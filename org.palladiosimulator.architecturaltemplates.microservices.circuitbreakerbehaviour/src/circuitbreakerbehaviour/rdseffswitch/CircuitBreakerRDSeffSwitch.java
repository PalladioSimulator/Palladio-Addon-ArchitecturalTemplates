package circuitbreakerbehaviour.rdseffswitch;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.simulizar.exceptions.PCMModelInterpreterException;
import org.palladiosimulator.simulizar.interpreter.IComposableSwitch;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.interpreter.listener.EventType;
import org.palladiosimulator.simulizar.interpreter.listener.RDSEFFElementPassedEvent;
import org.palladiosimulator.simulizar.runtimestate.SimulatedBasicComponentInstance;

import circuitbreaker.CircuitBreaker;
import circuitbreaker.CircuitBreakerModel;
import circuitbreaker.CircuitBreakerPackage;
import circuitbreaker.CircuitBreakerState;
import circuitbreakerbehaviour.CircuitBreakerRDSEFF;
import circuitbreakerbehaviour.edp2.CircuitBreakerStateRegistry;
import circuitbreakerbehaviour.util.CircuitbreakerbehaviourSwitch;
import de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe;

/**
 * 
 * @author mrombach
 *
 */
public class CircuitBreakerRDSeffSwitch extends CircuitbreakerbehaviourSwitch<Object> implements IComposableSwitch {
	
    protected static final Logger LOGGER = Logger.getLogger(CircuitBreakerRDSEFF.class);
    private static final Boolean FAIL = false;
    private static final Boolean SUCCESS = true;
    
    private final InterpreterDefaultContext context;
    private final ComposedSwitch<Object> parentSwitch;
    
    /**
     * Constructor.
     *
     * @param context
     *				Default context for the pcm interpreter.
     * @param basicComponentInstance
     *				Simulated component
     * @param parentSwitch
     *				The composed switch which is containing this switch
     */
	public CircuitBreakerRDSeffSwitch(InterpreterDefaultContext context, SimulatedBasicComponentInstance basicComponentInstance,
			ComposedSwitch<Object> parentSwitch) {
		this.context = context;
        this.parentSwitch = parentSwitch;
	}

	@Override
	public Object caseCircuitBreakerRDSEFF(CircuitBreakerRDSEFF object) {
		Object result = SUCCESS;
        AbstractAction currentAction = null;
        // interpret start action
        for (final AbstractAction abstractAction : object.getSteps_Behaviour()) {
            if (abstractAction.eClass() == SeffPackage.eINSTANCE.getStartAction()) {
                this.firePassedEvent(abstractAction, EventType.BEGIN);
                currentAction = abstractAction.getSuccessor_AbstractAction();
                this.firePassedEvent(abstractAction, EventType.END);
                break;
            }
        }
        if (currentAction == null) {
            throw new PCMModelInterpreterException("RDSEFF is invalid, it misses a start action");
        }
        
        while (currentAction.eClass() != SeffPackage.eINSTANCE.getStopAction() 
        		&& getCircuitBreakerState(object.getDescribedService__SEFF()) != CircuitBreakerState.OPEN) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Interpret " + currentAction.eClass().getName() + ": " + currentAction);
            }
            this.firePassedEvent(currentAction, EventType.BEGIN);
            result = this.getParentSwitch().doSwitch(currentAction);
            this.firePassedEvent(currentAction, EventType.END);
            currentAction = currentAction.getSuccessor_AbstractAction();
        }
        
        CircuitBreakerStateRegistry notifier = CircuitBreakerStateRegistry.getNotifier();
        notifier.notifyListeners(getCircuitBreaker(object.getDescribedService__SEFF()), this.context.getThread().getRequestContext());
        if (getCircuitBreakerState(object.getDescribedService__SEFF()) == CircuitBreakerState.OPEN) {
        	result = FAIL;
        }
        
        
        SimulatedStackframe<Object> resultStack = new SimulatedStackframe<Object>();
        resultStack.addValue("CircuitBreakerRDSEFFResult", result);
        return resultStack;
	}

	/**
	 * 
	 * @param abstractAction
	 * @param eventType
	 */
    private <T extends AbstractAction> void firePassedEvent(final T abstractAction, final EventType eventType) {
        this.context.getRuntimeState().getEventNotificationHelper().firePassedEvent(new RDSEFFElementPassedEvent<T>(
                abstractAction, eventType, this.context.getThread(), this.context.getAssemblyContextStack().peek()));
    }
	
    /**
     * 
     * @param signature
     * @return
     */
	public CircuitBreakerState getCircuitBreakerState(Signature signature) {
		Optional<CircuitBreaker> circuitBreaker = getCircuitBreakerModel().getCircuitBreakers().stream().filter(
				cb -> cb.getSignatures().stream().anyMatch(
						s -> s.getId().equals(signature.getId()))).findAny();

		if (circuitBreaker.isPresent()) {
			return circuitBreaker.get().getCircuitBreakerState();
		}
		
		return CircuitBreakerState.CLOSED;
	}

	@Override
	public Switch<Object> getParentSwitch() {
		return this.parentSwitch;
	}
	
	public CircuitBreaker getCircuitBreaker(Signature signature) {
		Optional<CircuitBreaker> circuitBreaker = getCircuitBreakerModel().getCircuitBreakers().stream().filter(
				cb -> cb.getSignatures().stream().anyMatch(
						s -> s.getId().equals(signature.getId()))).findAny();
		return circuitBreaker.get();
	}
	/**
	 * 
	 * @return
	 */
	private CircuitBreakerModel getCircuitBreakerModel() {
		 try {
	            LOGGER.debug("Retrieving CircuitBreaker model");
	            final List<CircuitBreakerModel> result = context.getModelAccess().getGlobalPCMModel()
	            		.getElement(CircuitBreakerPackage.eINSTANCE.getCircuitBreakerModel());
	            return result.get(0);
	        } catch (final Exception e) {
	            LOGGER.info("No CircuitBreaker model found!");
	            throw e;
	        }
	}
}
