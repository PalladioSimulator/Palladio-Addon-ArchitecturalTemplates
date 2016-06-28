package org.palladiosimulator.architecturaltemplates.jobs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.helper.OCLHelper;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.architecturaltemplates.jobs.config.ATExtensionJobConfiguration;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants;
import org.palladiosimulator.architecturaltemplates.ocl.StereotypeEnvironmentFactory;
import org.palladiosimulator.architecturaltemplates.OCLConstraint;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * Validates blackboard models according to the given AT constraints.
 *
 * @author Sebastian Lehrig, Daria Giacinto
 */
public class ValidateModelsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {

    public ValidateModelsJob(final ATExtensionJobConfiguration configuration) {
    }

    @Override
    public void execute(final IProgressMonitor monitor) throws JobFailedException, UserCanceledException {
        super.execute(monitor);
        this.logger.info("Validating AT Constraints.");
        final List<ProfileApplication> profileApplications = this.getProfileApplications();
        for (final ProfileApplication profileApplication : profileApplications) {
            final EList<StereotypeApplication> stereotypeApplications = profileApplication.getStereotypeApplications();
            final OCL ocl = OCL.newInstance(new StereotypeEnvironmentFactory(this.myBlackboard));
            // create an OCL helper object
            final OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();

            for (final StereotypeApplication stereotypeApplication : stereotypeApplications) {
                // set the OCL context classifier
                helper.setInstanceContext(stereotypeApplication);
                final EList<org.palladiosimulator.architecturaltemplates.Constraint> constraints = this
                        .getConstraintsFromStereotypeApplication(stereotypeApplication);

                Constraint invariant = null;
                for (final org.palladiosimulator.architecturaltemplates.Constraint constraint : constraints) {
                    if (constraint instanceof OCLConstraint) {
                        final OCLConstraint oclConstraint = (OCLConstraint) constraint;
                        try {
                            invariant = helper.createInvariant(oclConstraint.getConstraint());
                            final Query constraintEvaluation = ocl.createQuery(invariant);
                            if (!constraintEvaluation.check(stereotypeApplication)) {
                                this.logger.error("Constraint: " + oclConstraint.getEntityName() + " failed.");
                            } else {
                                this.logger.info("Constraint: " + oclConstraint.getEntityName() + " succeeded.");
                            }
                        } catch (final ParserException e) {
                            this.logger.error("Unable to parse expression " + oclConstraint.getEntityName() + ": "
                                    + e.getMessage());
                        }
                    }
                }
            }
        }
    }

    private List<ProfileApplication> getProfileApplications() {
        final List<ProfileApplication> profileApplications = new LinkedList<ProfileApplication>();

        addProfileApplicationIfPresent(profileApplications, SystemPackage.eINSTANCE.getSystem());
        addProfileApplicationIfPresent(profileApplications,
                ResourceenvironmentPackage.eINSTANCE.getResourceEnvironment());

        return Collections.unmodifiableList(profileApplications);
    }

    private void addProfileApplicationIfPresent(final List<ProfileApplication> profileApplications,
            final EClass eClass) {
        final ResourceSetPartition partition = this.myBlackboard
                .getPartition(ATPartitionConstants.Partition.PCM.getPartitionId());
        if (partition.hasElement(eClass)) {
            final Resource resource = partition.getElement(eClass).get(0).eResource();
            if (ProfileAPI.hasProfileApplication(resource)) {
                profileApplications.add(ProfileAPI.getProfileApplication(resource));
            }
        }
    }

    private EList<org.palladiosimulator.architecturaltemplates.Constraint> getConstraintsFromStereotypeApplication(
            final StereotypeApplication stereotypeApplication) {
        final Stereotype stereotype = stereotypeApplication.getStereotype();
        EList<org.palladiosimulator.architecturaltemplates.Constraint> constraints = new BasicEList<org.palladiosimulator.architecturaltemplates.Constraint>();
        final EStructuralFeature roleURI = stereotype.getTaggedValue("roleURI");
        if (roleURI != null) {
            final EObject eObject = EMFLoadHelper.loadAndResolveEObject(roleURI.getDefaultValueLiteral());
            final Role stereotypeRole = (Role) eObject;
            constraints = stereotypeRole.getConstraints();
            return stereotypeRole.getConstraints();
        }
        return constraints;
    }
}
