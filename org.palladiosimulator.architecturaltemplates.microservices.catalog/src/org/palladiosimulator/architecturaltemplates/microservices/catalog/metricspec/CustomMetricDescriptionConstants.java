package org.palladiosimulator.architecturaltemplates.microservices.catalog.metricspec;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;

public final class CustomMetricDescriptionConstants {
    private static final String PATHMAP_METRIC_SPEC_MODEL = "platform:/plugin/org.palladiosimulator.architecturaltemplates.microservices.catalog/models/metricDescriptions.metricspec";
    private static final Map<?, ?> OPTIONS = Collections.emptyMap();

    public final static BaseMetricDescription GROUP_AGGREGATION_METRIC;
    public final static BaseMetricDescription SIMULATION_TIME_METRIC;
    public final static BaseMetricDescription LOADBALANCER_ADAPTION_METRIC;
    public final static BaseMetricDescription IDENTIFICATION_METRIC;
    
    
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

    }
    
    private CustomMetricDescriptionConstants() {}

}
