package org.scaledl.architecturaltemplates.ocl;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

public class StereotypeEnvironment extends EcoreEnvironment {

    EOperation hasAppliedStereotype;
    EOperation getDoubleTaggedValue;
    EOperation getStringTaggedValue;
    EOperation parseDouble;
    EOperation getAllocation;
    EOperation getResourceEnvironment;
    EOperation evaluateStoEx;

    StereotypeEnvironment(final EcoreEnvironmentFactory fac, final Resource resource) {
        super(fac, resource);
        defineCustomOperations();
    }

    StereotypeEnvironment(final StereotypeEnvironment parent) {
        super(parent);
        // get the parent's custom operations
        this.hasAppliedStereotype = parent.hasAppliedStereotype;
        this.getDoubleTaggedValue = parent.getDoubleTaggedValue;
        this.getStringTaggedValue = parent.getStringTaggedValue;
        this.parseDouble = parent.parseDouble;
        this.getAllocation = parent.getAllocation;
        this.getResourceEnvironment = parent.getResourceEnvironment;
        this.evaluateStoEx = parent.evaluateStoEx;
    }

    // use the AbstractEnvironment's mechanism for defining
    // "additional operations" to add our custom operation to
    // OCL's String primitive type
    private void defineCustomOperations() {

        // hasAppliedStereotype operation
        this.hasAppliedStereotype = createOperation("hasAppliedStereotype", getOCLStandardLibrary().getBoolean());
        final EParameter stereotypeParameter = createParameter("stereotype", getOCLStandardLibrary().getString());
        this.hasAppliedStereotype.getEParameters().add(stereotypeParameter);

        // getDoubleTaggedValue operation
        this.getDoubleTaggedValue = createOperation("getDoubleTaggedValue", getOCLStandardLibrary().getReal());
        final EParameter doubleTaggedValueParameter = createParameter("doubleTaggedValue",
                getOCLStandardLibrary().getString());
        final EParameter stereotypeNameParameter = createParameter("stereotypeName",
                getOCLStandardLibrary().getString());
        this.getDoubleTaggedValue.getEParameters().add(doubleTaggedValueParameter);
        this.getDoubleTaggedValue.getEParameters().add(stereotypeNameParameter);

        // getStringTaggedValue operation
        this.getStringTaggedValue = createOperation("getStringTaggedValue", getOCLStandardLibrary().getString());
        final EParameter stringTaggedValueParameter = createParameter("stringTaggedValue",
                getOCLStandardLibrary().getString());
        final EParameter stereotypeNameParameter2 = createParameter("stereotypeName",
                getOCLStandardLibrary().getString());
        this.getStringTaggedValue.getEParameters().add(stringTaggedValueParameter);
        this.getStringTaggedValue.getEParameters().add(stereotypeNameParameter2);

        // parseDouble operation
        this.parseDouble = createOperation("parseDouble", getOCLStandardLibrary().getReal());

        // getAllocation operation
        this.getAllocation = createOperation("getAllocation", AllocationPackage.Literals.ALLOCATION);

        // getResourceEnvironment operation
        this.getResourceEnvironment = createOperation("getResourceEnvironment",
                ResourceenvironmentPackage.Literals.RESOURCE_ENVIRONMENT);

        // evaluateStoEx operation
        this.evaluateStoEx = createOperation("evaluateStoEx", getOCLStandardLibrary().getReal());

        // define it as an additional operation on OCL String
        addHelperOperation(EntityPackage.Literals.ENTITY, this.getDoubleTaggedValue);
        addHelperOperation(EntityPackage.Literals.ENTITY, this.getStringTaggedValue);
        addHelperOperation(getOCLStandardLibrary().getString(), this.parseDouble);
        addHelperOperation(EntityPackage.Literals.ENTITY, this.hasAppliedStereotype);
        addHelperOperation(EntityPackage.Literals.ENTITY, this.getAllocation);
        addHelperOperation(EntityPackage.Literals.ENTITY, this.getResourceEnvironment);
        addHelperOperation(getOCLStandardLibrary().getString(), this.evaluateStoEx);
    }

    private EOperation createOperation(final String operationName, final EClassifier returnType) {
        final EOperation operation = EcoreFactory.eINSTANCE.createEOperation();
        operation.setName(operationName);
        operation.setEType(returnType);
        final EAnnotation operationAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
        operationAnnotation.setSource("StereotypeEnvironment");
        operation.getEAnnotations().add(operationAnnotation);
        return operation;
    }

    private EParameter createParameter(final String parameterName, final EClassifier parameterType) {
        final EParameter parameter = EcoreFactory.eINSTANCE.createEParameter();
        parameter.setName(parameterName);
        parameter.setEType(parameterType);
        return parameter;
    }
}
