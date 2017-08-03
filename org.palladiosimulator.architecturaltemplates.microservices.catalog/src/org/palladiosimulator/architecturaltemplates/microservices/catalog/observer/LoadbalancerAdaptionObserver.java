package org.palladiosimulator.architecturaltemplates.microservices.catalog.observer;

import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.metricspec.CustomMetricDescriptionConstants;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.LoadbalancerAdaptionRecorder;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.LoadbalancerAdaptionRecorderFactory;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.SimulationTimeRecorder;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.SimulationTimeRecorderFactory;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurement;
import org.palladiosimulator.runtimemeasurement.RuntimeMeasurementModel;
import org.palladiosimulator.simulizar.modelobserver.AbstractModelObserver;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

public class LoadbalancerAdaptionObserver extends AbstractModelObserver<RuntimeMeasurementModel> {

	@Override
	public void initialize(AbstractSimuLizarRuntimeState runtimeState) {

		Optional.ofNullable(runtimeState.getModelAccess().getRuntimeMeasurementModel())
		.ifPresent(prm -> initialize(prm, runtimeState));
	}

	@Override
	public void initialize(RuntimeMeasurementModel runtimeMeasurementModel, AbstractSimuLizarRuntimeState runtimeState) {

		super.initialize(runtimeMeasurementModel, runtimeState);
	}

	@Override
	protected void set(Notification notification) {
		RuntimeMeasurement rm = (RuntimeMeasurement) notification.getNotifier();

		if(isNoSimulationTimeMeasurement(rm)) {
			if(isWatchedMeasurement(rm)) {
				double currentSimulationTime = this.runtimeModel.getModel().getSimulationControl().getCurrentSimulationTime();
				for(SimulationTimeRecorder recorder : SimulationTimeRecorderFactory.getSimulationTimeRecorders()) {
					recorder.newMeasurementAvailable(currentSimulationTime);
				}
			
				for(LoadbalancerAdaptionRecorder recorder : LoadbalancerAdaptionRecorderFactory.getLoadbalancerAdaptionRecorders()) {
					recorder.newMeasurementAvailable(rm.getMeasuringPoint(), currentSimulationTime);
				}
			}
		}
		super.set(notification);
	}

	private boolean isNoSimulationTimeMeasurement(RuntimeMeasurement rm) {
		return !rm.getMeasurementSpecification().getMetricDescription().getId()
				.equals(CustomMetricDescriptionConstants.SIMULATION_TIME_METRIC.getId());
	}

	private boolean isWatchedMeasurement(RuntimeMeasurement rm) {
		return LoadbalancerAdaptionRecorderFactory.getLoadbalancerAdaptionRecorders().stream()
				.anyMatch(recorder -> recorder.getWachtedMeasuringPointIds().contains(rm.getMeasuringPoint().getResourceURIRepresentation()));
	}

	@Override
	protected void remove(Notification notification) {
		LoadbalancerAdaptionRecorderFactory.removeAllRecorders();	
		super.remove(notification);
	}
}
