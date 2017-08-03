package org.palladiosimulator.architecturaltemplates.microservices.catalog.observer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.metricspec.CustomMetricDescriptionConstants;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.IdentificationRecorderFactory;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.LoadbalancerAdaptionRecorder;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.LoadbalancerAdaptionRecorderFactory;
import org.palladiosimulator.architecturaltemplates.microservices.catalog.recorder.SimulationTimeRecorderFactory;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.simulizar.modelobserver.AbstractModelObserver;
import org.palladiosimulator.simulizar.runtimestate.AbstractSimuLizarRuntimeState;

public class MonitorRepositoryObserver extends AbstractModelObserver<MonitorRepository> {
	
	List<MeasurementSpecification> responseTimeMetricSpecs;

	@Override
	public void initialize(AbstractSimuLizarRuntimeState runtimeState) {
		Optional.ofNullable(runtimeState.getModelAccess().getMonitorRepositoryModel())
		.ifPresent(repo -> initialize(repo, runtimeState));		
	}
	
	@Override
	public void initialize(MonitorRepository model, AbstractSimuLizarRuntimeState runtimeState) {
		super.initialize(model, runtimeState);
		
        if (model != null) {
    		List<MeasurementSpecification> allSpecs = model.getMonitors().stream()//.filter(Monitor::isActivated)
    		.flatMap(m -> m.getMeasurementSpecifications().stream()).collect(Collectors.toList());
    		
    		this.responseTimeMetricSpecs = allSpecs.stream().filter(spec -> spec.getMetricDescription().getId()
    				.equals(MetricDescriptionConstants.RESPONSE_TIME_METRIC.getId())).collect(Collectors.toList());
    		
    		createRecorders(allSpecs);
        }
	}

	private void createRecorders(List<MeasurementSpecification> specs) {
		specs.stream().filter(spec -> spec.getMetricDescription().getId()
				.equals(CustomMetricDescriptionConstants.LOADBALANCER_ADAPTION_METRIC.getId()))
		.forEach(this::addLoadbalancerAdaptionRecorder);
		
		specs.stream().filter(spec -> spec.getMetricDescription().getId()
				.equals(CustomMetricDescriptionConstants.SIMULATION_TIME_METRIC.getId()))
		.forEach(this::addSimulationTimeRecorder);
		
		specs.stream().filter(spec -> spec.getMetricDescription().getId()
				.equals(CustomMetricDescriptionConstants.IDENTIFICATION_METRIC.getId()))
		.forEach(this::addIdentificationRecorder);
	}
	
	private void addSimulationTimeRecorder(MeasurementSpecification spec) {
		SimulationTimeRecorderFactory.createSimulationTimeRecorder(runtimeModel.getModelAccess().getRuntimeMeasurementModel(), spec);
	}
	
	private void addIdentificationRecorder(MeasurementSpecification spec) {
		IdentificationRecorderFactory.createRecorder(runtimeModel.getModelAccess().getRuntimeMeasurementModel(), spec);
	}
	
	private void addLoadbalancerAdaptionRecorder(MeasurementSpecification spec) {
		LoadbalancerAdaptionRecorder recorder = LoadbalancerAdaptionRecorderFactory
				.createLoadbalancerAdaptionRecorder(runtimeModel.getModelAccess().getRuntimeMeasurementModel(), spec);
		
		for(MeasurementSpecification responseTimeLinkSpec : spec.getMonitor().getMeasurementSpecifications()) {
			if(responseTimeLinkSpec.getMetricDescription().getId().equals(CustomMetricDescriptionConstants.GROUP_AGGREGATION_METRIC.getId())) {
				Optional<MeasurementSpecification> correspondingResponsTimeMetricSpec = this.responseTimeMetricSpecs.stream()
						.filter(s -> s.getId().equals(responseTimeLinkSpec.getId())).findAny();
				
				registerResponseTimeAggregation(correspondingResponsTimeMetricSpec.orElseThrow(
						() -> new IllegalStateException("No corresponding ResponsTimeMeasurementSpecisfication found" 
								+ "for GroupAggragation Secification " + responseTimeLinkSpec.getName() + "!")), 
						recorder);
			}
		}
	}
	
	private void registerResponseTimeAggregation(MeasurementSpecification externalCall, LoadbalancerAdaptionRecorder recorder) {
		recorder.addCorrespondingMeasurement(externalCall.getMonitor().getMeasuringPoint().getResourceURIRepresentation());
	}
	
	@Override
	protected void add(Notification notification) {
		if (MonitorRepositoryPackage.eINSTANCE.getMonitorRepository_Monitors().equals(notification.getFeature())) {
			// TODO dynamic creation and removal of monitors
			//Monitor newMonitor = (Monitor) notification.getNewValue();
			//List<MeasurementSpecification> specs = newMonitor.getMeasurementSpecifications().stream().collect(Collectors.toList());
		}
		super.add(notification);
	}
	
	@Override
	protected void remove(Notification notification) {
		if (MonitorRepositoryPackage.eINSTANCE.getMonitorRepository_Monitors().equals(notification.getFeature())) {
			// TODO dynamic creation and removal of monitors
			//Monitor oldMonitor = (Monitor) notification.getOldValue();
			//List<MeasurementSpecification> specs = oldMonitor.getMeasurementSpecifications().stream().collect(Collectors.toList());
		}
		super.remove(notification);
	}
}