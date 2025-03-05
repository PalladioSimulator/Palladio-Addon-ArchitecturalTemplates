package org.palladiosimulator.architecturaltemplates.ocl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;
import org.palladiosimulator.analyzer.workflow.core.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.analyzer.workflow.core.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.simucomframework.Context;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class StereotypeEvaluationEnvironment extends EcoreEvaluationEnvironment {

    private final MDSDBlackboard blackboard;

    public StereotypeEvaluationEnvironment(final EcoreEnvironmentFactory factory, final MDSDBlackboard blackboard) {
        super(factory);
        this.blackboard = blackboard;
    }

    public StereotypeEvaluationEnvironment(
            final EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent,
            final MDSDBlackboard blackboard) {
        super(parent);
        this.blackboard = blackboard;
    }

    @Override
    public Object callOperation(final EOperation operation, final int opcode, final Object source,
            final Object[] args) {
        if (operation.getEAnnotation("StereotypeEnvironment") == null) {
            // not our custom stereotype test operation
            return super.callOperation(operation, opcode, source, args);
        }

        switch (operation.getName()) {
        case "hasAppliedStereotype":
            return StereotypeAPI.isStereotypeApplied((Entity) source, (String) args[0]);
        case "getDoubleTaggedValue":
        case "getStringTaggedValue":
            return StereotypeAPI.getTaggedValue((Entity) source, (String) args[0], (String) args[1]);
        case "parseDouble":
            return Double.parseDouble((String) source);
        case "getAllocation":
            return getAllocation();
        case "getResourceEnvironment":
            return getResourceEnvironment();
        case "evaluateStoEx":
            return Context.evaluateStatic((String) source, Double.class);
        }

        throw new UnsupportedOperationException(); // unknown operation

    }

    private org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment getResourceEnvironment() {
        final PCMResourceSetPartition pcmRepositoryPartition = (PCMResourceSetPartition) this.blackboard
                .getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment resEnv = null;
        try {
            resEnv = pcmRepositoryPartition.getResourceEnvironment();
        } catch (final IndexOutOfBoundsException e) {
        }
        if (resEnv == null) {
            throw new RuntimeException("Did not find Resource Environment.");
        }
        return resEnv;
    }

    private org.palladiosimulator.pcm.allocation.Allocation getAllocation() {
        final PCMResourceSetPartition pcmRepositoryPartition = (PCMResourceSetPartition) this.blackboard
                .getPartition(LoadPCMModelsIntoBlackboardJob.PCM_MODELS_PARTITION_ID);
        org.palladiosimulator.pcm.allocation.Allocation allocation = null;
        try {
            allocation = pcmRepositoryPartition.getAllocation();
        } catch (final IndexOutOfBoundsException e) {
        }
        if (allocation == null) {
            throw new RuntimeException("Did not find Allocation.");
        }
        return allocation;
    }
}
