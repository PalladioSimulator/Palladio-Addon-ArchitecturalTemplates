package org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public final class IdentificationRecorderFactory {
	
	private static List<IdentificationRecorder> recorders = new LinkedList<IdentificationRecorder>();

	public static PRMRecorder createRecorder(RuntimeMeasurementModel runtimeMeasurementModel,
			MeasurementSpecification measurementSpecification) {
		IdentificationRecorder recorder = new IdentificationRecorder(runtimeMeasurementModel, measurementSpecification);
		recorders.add(recorder);
		return recorder;
	}
	
	public static final List<IdentificationRecorder> getRecorders() {
		return recorders;
	}
	
	public static final void removeAllRecorders() {
		recorders.clear();
	}
}