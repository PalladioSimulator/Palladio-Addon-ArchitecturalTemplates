package org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder;

import java.util.Objects;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public class IdentificationRecorder extends PRMRecorder {
	
	public IdentificationRecorder(final RuntimeMeasurementModel runtimeMeasurementModel,
			final MeasurementSpecification measurementSpecification) {
		
		super(runtimeMeasurementModel, Objects.requireNonNull(measurementSpecification));
	}
	
	public void newMeasurementAvailable(MeasuringPoint measuringPoint) {
		
		this.getPRMMeasurement().setMeasuringPoint(Objects.requireNonNull(measuringPoint));
		super.updateMeasurementValue(0.0);
	}

	public void preUnregister() {
		super.detachFromPRM();
	}
}
