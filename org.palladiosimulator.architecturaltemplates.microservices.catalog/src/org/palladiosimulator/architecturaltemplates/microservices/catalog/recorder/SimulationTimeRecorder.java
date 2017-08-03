package org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder;

import java.util.Objects;

import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public class SimulationTimeRecorder extends PRMRecorder {

	public SimulationTimeRecorder(final RuntimeMeasurementModel runtimeMeasurementModel,
			final MeasurementSpecification measurementSpecification) {
		
		super(runtimeMeasurementModel, Objects.requireNonNull(measurementSpecification));
	}

	public void newMeasurementAvailable(double currentSimulationTime) {
		super.updateMeasurementValue(currentSimulationTime);
	}

	
	public void preUnregister() {
		super.detachFromPRM();
	}
}
