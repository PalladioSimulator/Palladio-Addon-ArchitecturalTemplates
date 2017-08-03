package org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;

public class LoadbalancerAdaptionRecorderFactory {
	
	private static List<LoadbalancerAdaptionRecorder> loadbalancerAdaptionRecorders = new LinkedList<LoadbalancerAdaptionRecorder>();
	
	public static LoadbalancerAdaptionRecorder createLoadbalancerAdaptionRecorder(RuntimeMeasurementModel runtimeMeasurementModel,
			MeasurementSpecification measurementSpecification) {
		
		LoadbalancerAdaptionRecorder recorder = new LoadbalancerAdaptionRecorder(runtimeMeasurementModel, measurementSpecification);
		loadbalancerAdaptionRecorders.add(recorder);
		return recorder;
	}

	public static List<LoadbalancerAdaptionRecorder> getLoadbalancerAdaptionRecorders() {
		return loadbalancerAdaptionRecorders;
	}
	
	public static void removeLoadbalancerAdaptionRecorder(LoadbalancerAdaptionRecorder recorder) {
		loadbalancerAdaptionRecorders.remove(recorder);
	}
	
	public static void removeAllRecorders() {
		loadbalancerAdaptionRecorders.clear();
	}
}