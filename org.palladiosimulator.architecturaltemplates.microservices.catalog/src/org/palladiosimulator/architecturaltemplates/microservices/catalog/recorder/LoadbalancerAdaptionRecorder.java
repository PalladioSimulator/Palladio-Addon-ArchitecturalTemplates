package org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.metrics.PRMRecorder;

public class LoadbalancerAdaptionRecorder extends PRMRecorder {
	
	private Map<String, Double> correspondingResponseTimeMeasuringPoints;
	private boolean blocked;

	public LoadbalancerAdaptionRecorder(final RuntimeMeasurementModel runtimeMeasurementModel,
			final MeasurementSpecification measurementSpecification) {
		
		super(runtimeMeasurementModel, Objects.requireNonNull(measurementSpecification));
		this.correspondingResponseTimeMeasuringPoints = new HashMap<String, Double>();
		this.blocked = false;
	}
	
	public void newMeasurementAvailable(MeasuringPoint measuringPoint, double currentTime) {
		
		this.addCorrespondingMeasurement(measuringPoint.getResourceURIRepresentation(), currentTime);
		
		if(this.allCorrespondingResponseTimesAggregated()) {
			super.updateMeasurementValue(currentTime);
		}
	}

	public void preUnregister() {
		super.detachFromPRM();
	}
	
	public boolean allCorrespondingResponseTimesAggregated() {
		if(this.correspondingResponseTimeMeasuringPoints.isEmpty()) {
			return false;
		}
		double first = this.correspondingResponseTimeMeasuringPoints.values().iterator().next();
		return this.blocked = this.correspondingResponseTimeMeasuringPoints.values().stream().allMatch(simTime -> simTime == first && simTime > 0 && !this.blocked);
	}

	private void addCorrespondingMeasurement(String MeasuringPointId, double currentTime) {
		int numberOfResponseTimeMeasuringPoints = correspondingResponseTimeMeasuringPoints.size();
		this.correspondingResponseTimeMeasuringPoints.put(MeasuringPointId, currentTime);
		assert numberOfResponseTimeMeasuringPoints == correspondingResponseTimeMeasuringPoints.size();
		blocked = false;
	}
	
	public void addCorrespondingMeasurement(String MeasuringPointId) {
		this.correspondingResponseTimeMeasuringPoints.put(MeasuringPointId, -1.0);
	}
	
	public void removeCorrespondingMeasurement(String MeasuringPointId) {
		this.correspondingResponseTimeMeasuringPoints.remove(MeasuringPointId);
	}
	
	public Set<String> getWachtedMeasuringPointIds() {
		return this.correspondingResponseTimeMeasuringPoints.keySet();
	}
}
