package org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;

public class SimulationTimeRecorderFactory {
	
	private static List<SimulationTimeRecorder> simulationTimeRecorders = new LinkedList<SimulationTimeRecorder>();
	
	public static SimulationTimeRecorder createSimulationTimeRecorder(RuntimeMeasurementModel runtimeMeasurementModel,
			MeasurementSpecification measurementSpecification) {
		
		SimulationTimeRecorder recorder = new SimulationTimeRecorder(runtimeMeasurementModel, measurementSpecification);
		simulationTimeRecorders.add(recorder);
		return recorder;
	}

	public static List<SimulationTimeRecorder> getSimulationTimeRecorders() {
		return simulationTimeRecorders;
	}

	public static void removeSimulationTimeRecorder(SimulationTimeRecorder recorder) {
		simulationTimeRecorders.remove(recorder);
	}
	
	public static void removeAllRecorders() {
		simulationTimeRecorders.clear();
	}
}