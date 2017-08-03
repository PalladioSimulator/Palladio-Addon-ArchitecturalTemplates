package circuitbreakerbehaviour.observer;

import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.unit.Unit;

import org.palladiosimulator.architecturaltemplates.microservices.metrics.CustomMetricDescriptionConstants;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.measurement.RequestContext;
import org.palladiosimulator.probeframework.probes.BasicTriggeredProbe;
import org.palladiosimulator.probeframework.probes.TriggeredProbe;

import circuitbreaker.CircuitBreakerState;

public class CircuitBreakerStateProbe extends BasicTriggeredProbe<Long, Dimensionless> {

	private CircuitBreakerState state;

	public CircuitBreakerStateProbe() {
		super(CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC);
	}

	public ProbeMeasurement takeMeasurement(CircuitBreakerState state, RequestContext measurementContext) {
		this.state = state;
		return super.takeMeasurement(measurementContext);
	}

//	private MeasuringValue getMeasuringValue() {
//		return new MeasuringValue(CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC) {
//			
//			@Override
//			public Measure<Integer, Dimensionless> getMeasureForMetric(
//					MetricDescription wantedMetric) {
//				return getMeasure();
//			}
//			
//			@Override
//			public List<Measure<?, ?>> asList() {
//				throw new IllegalStateException("Not yet implemented!");
//			}
//		};
//		
//	}
	


	@Override
	protected Measure<Long, Dimensionless> getBasicMeasure(RequestContext measurementContext) {
		switch (this.state) {
			case CLOSED: return Measure.valueOf((long) CircuitBreakerState.CLOSED_VALUE, Unit.ONE);
			case OPEN: return Measure.valueOf((long) CircuitBreakerState.OPEN_VALUE, Unit.ONE);
			case HALF_OPEN: return Measure.valueOf((long) CircuitBreakerState.HALF_OPEN_VALUE, Unit.ONE);
			default: return null;
		}
	}
}
