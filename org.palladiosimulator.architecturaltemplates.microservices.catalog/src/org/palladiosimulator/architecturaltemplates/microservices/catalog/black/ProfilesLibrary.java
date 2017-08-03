package org.palladiosimulator.architecturaltemplates.microservices.catalog.black;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

public class ProfilesLibrary {
	
	public static void setOriginalAssemblyContext(final Entity duplicateAssemblyContext, final Entity originalAssemblyContext) {
		List<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes(duplicateAssemblyContext).stream()
   				.filter(s -> s.getName().equals("DuplicateAssemblyContext")).collect(Collectors.toList());
    	if(stereotypes.size() != 1) {
    		throw new IllegalStateException(
    				"The given PCM Entity has no or several applied stereotypes named 'DuplicateAssemblyContext'!");
    	}
    	EStructuralFeature ref = (EStructuralFeature) StereotypeAPI.getParameter(stereotypes.get(0), "originalAssemblyContext");
    	StereotypeAPI.getStereotypeApplication(duplicateAssemblyContext, stereotypes.get(0)).eSet(ref, originalAssemblyContext);
	}
	
    public static AssemblyContext getOriginalAssemblyContext(final AssemblyContext assemblyContext) {
   		List<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes(assemblyContext).stream()
   				.filter(s -> s.getName().equals("DuplicateAssemblyContext")).collect(Collectors.toList());
    	if(stereotypes.size() != 1) {
    		throw new IllegalStateException(
    				"The given PCM Entity has no or several applied stereotypes named 'DuplicateAssemblyContext'!");
    	}
    	EStructuralFeature ref = (EStructuralFeature) StereotypeAPI.getParameter(stereotypes.get(0), "originalAssemblyContext");
    	return (AssemblyContext) StereotypeAPI.getStereotypeApplication(assemblyContext, stereotypes.get(0)).eGet(ref);
    }
    
    public static void setOriginalResourceContainer(final ResourceContainer duplicateResourceContainer,
    		final ResourceContainer originalResourceContainer) {
		List<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes(duplicateResourceContainer).stream()
   				.filter(s -> s.getName().equals("DuplicateResourceContainer")).collect(Collectors.toList());
    	if(stereotypes.size() != 1) {
    		throw new IllegalStateException(
    				"The given PCM Entity has no or several applied stereotypes named 'DuplicateResourceContainer'!");
    	}
    	EStructuralFeature ref = (EStructuralFeature) StereotypeAPI.getParameter(stereotypes.get(0), "originalResourceContainer");
    	StereotypeAPI.getStereotypeApplication(duplicateResourceContainer, stereotypes.get(0)).eSet(ref, originalResourceContainer);
	}
    
    public static ResourceContainer getOriginalResourceContainer(final ResourceContainer resourceContainer) {
   		List<Stereotype> stereotypes = StereotypeAPI.getAppliedStereotypes((EObject) resourceContainer).stream()
   				.filter(s -> s.getName().equals("DuplicateResourceContainer")).collect(Collectors.toList());
    	if(stereotypes.size() != 1) {
    		throw new IllegalStateException(
    				"The given PCM Entity has no or several applied stereotypes named 'DuplicateResourceContainer'!");
    	}
    	EStructuralFeature ref = (EStructuralFeature) StereotypeAPI.getParameter(stereotypes.get(0), "originalResourceContainer");
    	return (ResourceContainer) StereotypeAPI.getStereotypeApplication(resourceContainer, stereotypes.get(0)).eGet(ref);
    }

}
