package circuitbreakerbehaviour.observer;

import org.palladiosimulator.probeframework.measurement.RequestContext;

import circuitbreaker.CircuitBreaker;

public interface ICircuitBreakerPassedListener {
	public void circuitBreakerPassed(CircuitBreaker circuitBreaker, RequestContext measurementContext);
}
