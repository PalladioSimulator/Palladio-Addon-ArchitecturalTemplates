package circuitbreakerbehaviour.observer;

import java.util.ArrayList;
import java.util.List;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.palladiosimulator.architecturaltemplates.microservices.metrics.CustomMetricDescriptionConstants;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.exceptions.CalculatorException;
import org.palladiosimulator.probeframework.measurement.ProbeMeasurement;
import org.palladiosimulator.probeframework.probes.Probe;

public class CircuitBreakerStateCalculator extends Calculator {

	public CircuitBreakerStateCalculator(MeasuringPoint measuringPoint,
			List<Probe> childProbes) {
		super(CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC_TUPLE, measuringPoint, childProbes);
	}

	@Override
	protected MeasuringValue calculate(List<ProbeMeasurement> probeMeasurements) throws CalculatorException {
		final List<MeasuringValue> result = new ArrayList<MeasuringValue>(2);

        final MeasuringValue endTimeMeasurement = probeMeasurements.get(0).getBasicMeasurement()
                .getMeasuringValueForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
        result.add(endTimeMeasurement);
		
        final Measure<Double, Quantity> state = probeMeasurements.get(1).getMeasureProvider()
                .getMeasureForMetric(CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC);
        final MeasuringValue stateMeasurement = new BasicMeasurement<Double, Quantity>(state,
        		CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC);
        result.add(stateMeasurement);

        return new TupleMeasurement(result, CustomMetricDescriptionConstants.CIRCUITBREAKERSTATE_METRIC_TUPLE);
	}

}
