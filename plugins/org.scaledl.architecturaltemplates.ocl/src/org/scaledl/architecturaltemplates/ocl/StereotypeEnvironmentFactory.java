package org.scaledl.architecturaltemplates.ocl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class StereotypeEnvironmentFactory extends EcoreEnvironmentFactory {

    private final MDSDBlackboard blackboard;

    public StereotypeEnvironmentFactory(final MDSDBlackboard blackboard) {
        super();
        this.blackboard = blackboard;
    }

    @Override
    public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> createEnvironment() {
        return new StereotypeEnvironment(this, null);
    }

    @Override
    public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> createEnvironment(
            final Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> parent) {
        if (!(parent instanceof StereotypeEnvironment)) {
            throw new IllegalArgumentException("Parent environment must be my environment: " + parent);
        }

        return new StereotypeEnvironment((StereotypeEnvironment) parent);
    }

    @Override
    public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> createEvaluationEnvironment() {
        return new StereotypeEvaluationEnvironment(this, this.blackboard);
    }

    @Override
    public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> createEvaluationEnvironment(
            final EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
        return new StereotypeEvaluationEnvironment(parent, this.blackboard);
    }
}
