package circuitbreakerbehaviour.edp2;

import org.palladiosimulator.commons.designpatterns.AbstractObservable;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.probeframework.measurement.RequestContext;

import circuitbreaker.CircuitBreaker;
import circuitbreakerbehaviour.observer.ICircuitBreakerPassedListener;

public class CircuitBreakerStateRegistry extends AbstractObservable<ICircuitBreakerPassedListener> {

	    private static CircuitBreakerStateRegistry INSTANCE;

	    private CircuitBreakerStateRegistry() {
	    }

	    public static CircuitBreakerStateRegistry getNotifier() {
	        if(INSTANCE == null) {
	            INSTANCE = new CircuitBreakerStateRegistry();
	        }
	        return INSTANCE;
	    }
	    
	    public void notifyListeners(CircuitBreaker circuitBreaker, RequestContext context) {
	        for(ICircuitBreakerPassedListener listener : this.getObservers()) {
	            listener.circuitBreakerPassed(circuitBreaker, context);
	        }
	    }
	}