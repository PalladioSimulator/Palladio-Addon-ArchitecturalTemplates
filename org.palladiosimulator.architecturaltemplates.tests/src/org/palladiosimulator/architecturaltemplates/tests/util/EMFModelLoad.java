package org.palladiosimulator.architecturaltemplates.tests.util;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage;
import org.palladiosimulator.architecturaltemplates.Catalog;

public class EMFModelLoad {
	
        public Catalog load() {
                // Initialize the model
                ArchitecturaltemplatesPackage.eINSTANCE.eClass();

                // Register the XMI resource factory for the .architecturaltemplates extension
                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put("architecturaltemplates", new XMIResourceFactoryImpl());

                // Obtain a new resource set
                ResourceSet resSet = new ResourceSetImpl();

                // Get the resource
                Resource resource = resSet.getResource(URI
                                .createURI("../org.palladiosimulator.architecturaltemplates.catalog/Default.architecturaltemplates"), true);
                // Get the first model element and cast it to the right type, in my
                // example everything is hierarchical included in this first node
                Catalog catalog = (Catalog) resource.getContents().get(0);
                return catalog;
        }

}