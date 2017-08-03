package circuitbreakerbehaviour.edp2;

import static org.palladiosimulator.architecturaltemplates.microservices.metrics.CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC;
import static org.palladiosimulator.architecturaltemplates.microservices.metrics.CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC_TUPLE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.measurement.RequestContext;
import org.palladiosimulator.probeframework.probes.Probe;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractProbeFrameworkListener;
import org.palladiosimulator.simulizar.interpreter.listener.AbstractRecordingProbeFrameworkListenerDecorator;

import circuitbreaker.CircuitBreaker;
import circuitbreakerbehaviour.observer.CircuitBreakerStateCalculator;
import circuitbreakerbehaviour.observer.CircuitBreakerStateProbe;
import circuitbreakerbehaviour.observer.ICircuitBreakerPassedListener;
import de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe;

public class CircuitBreakerRecorderFactory extends AbstractRecordingProbeFrameworkListenerDecorator implements ICircuitBreakerPassedListener {

	private Map<String, CircuitBreakerStateProbe> stateProbeMap;
	private Map<String, TakeCurrentSimulationTimeProbe> timeProbeMap;
	@Override
	public void registerMeasurements() {
		super.registerMeasurements();
		CircuitBreakerStateRegistry notifier = CircuitBreakerStateRegistry.getNotifier();
		notifier.addObserver(this);
		this.stateProbeMap = new HashMap<String, CircuitBreakerStateProbe>();
		this.timeProbeMap = new HashMap<String, TakeCurrentSimulationTimeProbe>();

		initMeasurements();
	}

	private void initMeasurements() {
		final AbstractProbeFrameworkListener probeFrameworkListener = getProbeFrameworkListener();
		Collection<MeasurementSpecification> specs = probeFrameworkListener.
				getMeasurementSpecificationsForMetricDescription(CIRCUITBREAKERSTATE_METRIC);
		for(MeasurementSpecification spec : specs) {
			MeasuringPoint mp = spec.getMonitor().getMeasuringPoint();
			CircuitBreakerStateProbe pr = new CircuitBreakerStateProbe();
			TakeCurrentSimulationTimeProbe timeProbe = new TakeCurrentSimulationTimeProbe(probeFrameworkListener.getSimuComModel().getSimulationControl());
			this.stateProbeMap.put(mp.getResourceURIRepresentation(), pr);
			this.timeProbeMap.put(mp.getResourceURIRepresentation(), timeProbe);
			List<Probe> probeList = new ArrayList<Probe>();
			probeList.add(timeProbe);
			probeList.add(pr);

			Calculator stateCalculator = new CircuitBreakerStateCalculator(mp, probeList);

			Map<String, Object> recorderConfigurationMap = createRecorderConfigMapWithAcceptedMetricAndMeasuringPoint(
					CIRCUITBREAKERSTATE_METRIC_TUPLE, mp);
			this.registerMeasurementsRecorder(stateCalculator, initializeRecorder(recorderConfigurationMap));
		}
	}

	@Override
	public void circuitBreakerPassed(CircuitBreaker circuitBreaker, RequestContext context) {
		if (this.stateProbeMap.containsKey(circuitBreaker.getId())) {
			this.timeProbeMap.get(circuitBreaker.getId())
			.takeMeasurement(context);
			this.stateProbeMap.get(circuitBreaker.getId())
			.takeMeasurement(circuitBreaker.getCircuitBreakerState(), context);
		}

	}

}
