package org.palladiosimulator.architecturaltemplates.microservices.metrics;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;

public final class CustomMetricDescriptionConstants {
    private static final String PATHMAP_METRIC_SPEC_MODEL = "platform:/plugin/org.palladiosimulator.architecturaltemplates.microservices.metrics/model/metricDescriptions.metricspec";
    private static final Map<?, ?> OPTIONS = Collections.emptyMap();

    public static final BaseMetricDescription GROUP_AGGREGATION_METRIC;
    public static final BaseMetricDescription SIMULATION_TIME_METRIC;
    public static final BaseMetricDescription LOADBALANCER_ADAPTION_METRIC;
    public static final BaseMetricDescription IDENTIFICATION_METRIC;
    public static final BaseMetricDescription CIRCUITBREAKERSTATE_METRIC;
    public static final MetricSetDescription CIRCUITBREAKERSTATE_METRIC_TUPLE;
    
    
    static {
        final ResourceSet resourceSet = new ResourceSetImpl();
        final URI modelURI = URI.createURI(PATHMAP_METRIC_SPEC_MODEL, true);
        final Resource resource = resourceSet.createResource(modelURI);
        try {
            resource.load(OPTIONS);
        } catch (final IOException e) {
            // TODO Auto-generated catch block. Use eclipse error log instead?
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        GROUP_AGGREGATION_METRIC = (BaseMetricDescription) resource.getEObject("_TRMegv5WEeav4O75Lkiw1Q");
        SIMULATION_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_2hOgogf5Eee7U7c-GphyYw");
        LOADBALANCER_ADAPTION_METRIC = (BaseMetricDescription) resource.getEObject("_-B6Y8gf7Eee7U7c-GphyYw");
        IDENTIFICATION_METRIC = (BaseMetricDescription) resource.getEObject("_6eYyEiQ6EeeEUdNH76D3cg");
        CIRCUITBREAKERSTATE_METRIC = (BaseMetricDescription) resource.getEObject("_XP7AIkH9EeeWWbsKhsd4hg");
        CIRCUITBREAKERSTATE_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_O_4wsUIKEeeWWbsKhsd4hg");
    }
    
    private CustomMetricDescriptionConstants() {}

}
