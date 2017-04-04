package org.palladiosimulator.architecturaltemplates.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofile.registry.IProfileRegistry;
import org.modelversioning.emfprofileapplication.ProfileImport;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.Catalog;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.commons.eclipseutils.ExtensionHelper;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.system.System;

/**
 * An API class providing methods to interact with Architectural Templates
 * 
 * @author Max Schettler, Sebastian Lehrig
 *
 */
public final class ArchitecturalTemplateAPI {

    /**
     * Used as source attribute of EAnnotations to mark profiles as Architectural Templates.
     */
    private static final String ARCHITECTURALTEMPLATE_ANNOTATION = "org.palladiosimulator.architecturaltemplate";

    /**
     * Used as key of EAnnotations details to link to an URI of Architectural Templates.
     */
    private static final String ARCHITECTURALTEMPLATE_ANNOTATION_AT_URI = "AT";

    /**
     * The name-suffix that identifies a {@link Role} or its corresponding {@link Stereotype} as a
     * system-role.
     */
    private static final String SYSTEM_ROLE_NAME_SUFFIX = "System";
    
    /**
     * The name-suffix that identifies a {@link Role} or its corresponding {@link Stereotype} as a
     * resource-environment-role.
     */
    private static final String RESOURCEENVIRONMENT_ROLE_NAME_SUFFIX = "ResourceEnvironment";
    
    /**
     * The name-suffix that identifies a {@link Role} or its corresponding {@link Stereotype} as a
     * allocation-role.
     */
    private static final String ALLOCATION_ROLE_NAME_SUFFIX = "Allocation";
    
    /**
     * Hidden constructor.
     */
    private ArchitecturalTemplateAPI() {
    }

    public static AT getArchitecturalTemplate(final Stereotype stereotype) {
        if (!isRole(stereotype)) {
            throw new RuntimeException("Stereotype \"" + stereotype + "\" is no role");
        }
        return getATFromURI(getArchitecturalTemplateURI(stereotype));
    }

    private static String getArchitecturalTemplateURI(final Stereotype stereotype) {
        final String architecturalTemplateURI = getArchitecturalTemplateAnnotation(stereotype).getDetails()
                .get(ARCHITECTURALTEMPLATE_ANNOTATION_AT_URI);

        if (architecturalTemplateURI == null) {
            throw new RuntimeException(
                    "The stereotype \"" + stereotype.getName() + "\" has an AT annotation but does not link an AT!");
        }

        return architecturalTemplateURI;
    }

    private static AT getATFromURI(final String architecturalTemplateURI) {
        final EObject architecturalTemplate = EMFLoadHelper.loadAndResolveEObject(architecturalTemplateURI);
        if (!(architecturalTemplate instanceof AT)) {
            throw new RuntimeException(
                    "ArchitecturalTemplateURI \"" + architecturalTemplateURI + "\" does not refer to an AT!");
        }
        return (AT) architecturalTemplate;
    }

    /**
     * Gets the {@link Role} associated with the given {@link Stereotype}.
     * 
     * @param stereotype
     *            the {@link Stereotype}
     * @return the {@link Role}
     * @throws RuntimeException
     *             if the given stereotype does not conform the role-convention.
     */
    public static Role getRole(final Stereotype stereotype) {
        final AT at = getArchitecturalTemplate(stereotype);

        final Optional<Role> role = at.getRoles().stream()
                .filter(r -> r.getStereotype().getName().equals(stereotype.getName())).findAny();

        if (!role.isPresent()) {
            throw new RuntimeException("Did not find AT role for stereotype \"" + stereotype + "\"!");
        }

        return role.get();
    }

    /**
     * Gets the {@link AT} associated with the given {@link Profile}.
     * 
     * @param profile
     *            the {@link Profile}
     * @return the {@link AT}
     * @throws RuntimeException
     *             if the given architectural template does not conform the
     *             Architectural-Template-convention.
     */
    public static AT getArchitecturalTemplate(final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }
        return getRole(profile.getStereotypes().get(0)).getAT();
    }

    /**
     * Tests whether a {@link Stereotype} conforms the role-convention (a tagged-value for the
     * {@link #ROLE_URI} exists). {@see #isRole}
     */
    public static boolean isRole(final Stereotype stereotype) {
        return getArchitecturalTemplateAnnotation(stereotype) != null;
    }

    private static EAnnotation getArchitecturalTemplateAnnotation(final Stereotype stereotype) {
        return getArchitecturalTemplateAnnotation(stereotype.getProfile());
    }

    private static EAnnotation getArchitecturalTemplateAnnotation(final Profile profile) {
        return profile.getEAnnotation(ARCHITECTURALTEMPLATE_ANNOTATION);
    }

    /**
     * Tests whether a {@link Stereotype} is a system-role. {@see #isSystemRole}
     */
    public static boolean isSystemRole(final Stereotype stereotype) {
        return isRole(stereotype) && stereotype.getName().endsWith(SYSTEM_ROLE_NAME_SUFFIX);
    }
    
    /**
     * Tests whether a {@link Stereotype} is a resource-environment-role. {@see #isResourceEnvironmentRole}
     */
    public static boolean isResourceEnvironmentRole(final Stereotype stereotype) {
        return isRole(stereotype) && stereotype.getName().endsWith(RESOURCEENVIRONMENT_ROLE_NAME_SUFFIX);
    }
    
    /**
     * Tests whether a {@link Stereotype} is a allocation-role. {@see #isAllocationRole}
     */
    public static boolean isAllocationRole(final Stereotype stereotype) {
        return isRole(stereotype) && stereotype.getName().endsWith(ALLOCATION_ROLE_NAME_SUFFIX);
    }

    /**
     * Tests whether a {@link Profile} is an Architectural-Template. {@see #isArchitecturalTemplate}
     */
    public static boolean isArchitecturalTemplate(final Profile profile) {
        return getArchitecturalTemplateAnnotation(profile) != null;
    }

    /**
     * Gets the {@link Stereotype} that represents the system-role for the given {@link Profile}.
     * 
     * @param profile
     *            the ArchitecturalTemplate-{@link Profile}
     * @return the SystemRole-{@link Stereotype}
     * @throws RuntimeException
     *             if the given profile is no Architectural Template
     */
    public static Stereotype getSystemRoleStereotype(final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }

        for (final Stereotype s : profile.getStereotypes()) {
            if (isSystemRole(s))
                return s;
        }

        return null;
    }
    
    /**
     * Gets the {@link Stereotype} that represents the resource-environment-role for the given {@link Profile}.
     * 
     * @param profile
     *            the ArchitecturalTemplate-{@link Profile}
     * @return the ResourceEnvironmentRole-{@link Stereotype}
     * @throws RuntimeException
     *             if the given profile is no Architectural Template
     */
    public static Stereotype getResourceEnvironmentRoleStereotype(final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }

        for (final Stereotype s : profile.getStereotypes()) {
            if (isResourceEnvironmentRole(s))
                return s;
        }

        return null;
    }
    
    /**
     * Gets the {@link Stereotype} that represents the allocation-role for the given {@link Profile}.
     * 
     * @param profile
     *            the ArchitecturalTemplate-{@link Profile}
     * @return the AllocationRole-{@link Stereotype}
     * @throws RuntimeException
     *             if the given profile is no Architectural Template
     */
    public static Stereotype getAllocationRoleStereotype(final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }

        for (final Stereotype s : profile.getStereotypes()) {
            if (isAllocationRole(s))
                return s;
        }

        return null;
    }

    /**
     * Applies the given {@link AT} to the {@link System}.
     * 
     * @param system
     *            the {@link System}
     * @param architecturalTemplate
     *            the {@link AT}
     * @throws RuntimeException
     *             if the Architectural Template does not define any roles.
     * @see #applyArchitecturalTemplate(System, Profile)
     */
    public static void applyArchitecturalTemplate(final System system, final AT architecturalTemplate) {
        if (architecturalTemplate.getRoles().size() == 0) {
            throw new RuntimeException(
                    "Architectural Template \"" + architecturalTemplate + "\" does not contain any roles");
        }

        applyArchitecturalTemplate(system, architecturalTemplate.getRoles().get(0).getStereotype().getProfile());
    }

    /**
     * Applies the given Architectural-Template-{@link Profile} to the {@link System}.
     * 
     * @param system
     *            the {@link System}
     * @param profile
     *            the {@link Profile}
     * @throws RuntimeException
     *             if the profile does not define an Architectural Template.
     */
    public static void applyArchitecturalTemplate(final System system, final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }

        final Stereotype systemRoleStereotype = getSystemRoleStereotype(profile);

        ProfileAPI.applyProfile(system.eResource(), profile);
        StereotypeAPI.applyStereotype(system, systemRoleStereotype);
        EPackage.Registry.INSTANCE.put(profile.getNsURI(), profile);
    }

    /**
     * Applies the given {@link AT} to the {@link ResourceEnvironment}.
     * 
     * @param system
     *            the {@link ResourceEnvironment}
     * @param architecturalTemplate
     *            the {@link AT}
     * @throws RuntimeException
     *             if the Architectural Template does not define any roles.
     * @see #applyArchitecturalTemplate(System, Profile)
     */
    public static void applyArchitecturalTemplate(final ResourceEnvironment resourceenvironment,
            final AT architecturalTemplate) {
        if (architecturalTemplate.getRoles().size() == 0) {
            throw new RuntimeException(
                    "Architectural Template \"" + architecturalTemplate + "\" does not contain any roles");
        }

        applyArchitecturalTemplate(resourceenvironment,
                architecturalTemplate.getRoles().get(0).getStereotype().getProfile());
    }

    /**
     * Applies the given Architectural-Template-{@link Profile} to the {@link ResourceEnvironment}.
     * 
     * @param system
     *            the {@link ResourceEnvironment}
     * @param profile
     *            the {@link Profile}
     * @throws RuntimeException
     *             if the profile does not define an Architectural Template.
     */
    public static void applyArchitecturalTemplate(final ResourceEnvironment resourceenvironment,
            final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }
        
        final Stereotype resourceenvironmentRoleStereotype = getResourceEnvironmentRoleStereotype(profile);
        
        ProfileAPI.applyProfile(resourceenvironment.eResource(), profile);
        EPackage.Registry.INSTANCE.put(profile.getNsURI(), profile);
        
        if(null != resourceenvironmentRoleStereotype)
        	StereotypeAPI.applyStereotype(resourceenvironment, resourceenvironmentRoleStereotype);
    }
    
    /**
     * Applies the given {@link AT} to the {@link Allocation}.
     * 
     * @param system
     *            the {@link Allocation}
     * @param architecturalTemplate
     *            the {@link AT}
     * @throws RuntimeException
     *             if the Architectural Template does not define any roles.
     * @see #applyArchitecturalTemplate(System, Profile)
     */
    public static void applyArchitecturalTemplate(final Allocation allocation,
            final AT architecturalTemplate) {
        if (architecturalTemplate.getRoles().size() == 0) {
            throw new RuntimeException(
                    "Architectural Template \"" + architecturalTemplate + "\" does not contain any roles");
        }

        applyArchitecturalTemplate(allocation,
                architecturalTemplate.getRoles().get(0).getStereotype().getProfile());
    }

    /**
     * Applies the given Architectural-Template-{@link Profile} to the {@link Allocation}.
     * 
     * @param system
     *            the {@link Allocation}
     * @param profile
     *            the {@link Profile}
     * @throws RuntimeException
     *             if the profile does not define an Architectural Template.
     */
    public static void applyArchitecturalTemplate(final Allocation allocation,
            final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }
        
        final Stereotype allocationRoleStereotype = getAllocationRoleStereotype(profile);

        ProfileAPI.applyProfile(allocation.eResource(), profile);
        StereotypeAPI.applyStereotype(allocation, allocationRoleStereotype);
        EPackage.Registry.INSTANCE.put(profile.getNsURI(), profile);
    }

    /**
     * Unapplies the given {@link AT} from the {@link System}.
     * 
     * @param system
     *            the {@link System}
     * @param architecturalTemplate
     *            the {@link AT}
     * @throws RuntimeException
     *             if the Architectural Template does not define any roles.
     * @see #unapplyArchitecturalTemplate(System, Profile)
     */
    public static void unapplyArchitecturalTemplate(final System system, final AT architecturalTemplate) {
        if (architecturalTemplate.getRoles().size() == 0) {
            throw new RuntimeException(
                    "Architectural Template \"" + architecturalTemplate + "\" does not contain any roles");
        }

        unapplyArchitecturalTemplate(system, architecturalTemplate.getRoles().get(0).getStereotype().getProfile());
    }

    /**
     * Unapplies the given Architectural-Template-{@link Profile} from the {@link System}.
     * 
     * @param system
     *            the {@link System}
     * @param profile
     *            the {@link Profile}
     * @throws RuntimeException
     *             if the profile does not define an Architectural Template.
     */
    public static void unapplyArchitecturalTemplate(final System system, final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }
        ProfileAPI.unapplyProfile(system.eResource(), profile);
    }

    /**
     * Unapplies the given {@link AT} from the {@link Allocation}.
     * 
     * @param system
     *            the {@link Allocation}
     * @param architecturalTemplate
     *            the {@link AT}
     * @throws RuntimeException
     *             if the Architectural Template does not define any roles.
     * @see #unapplyArchitecturalTemplate(System, Profile)
     */
    public static void unapplyArchitecturalTemplate(final Allocation allocation,
            final AT architecturalTemplate) {
        if (architecturalTemplate.getRoles().size() == 0) {
            throw new RuntimeException(
                    "Architectural Template \"" + architecturalTemplate + "\" does not contain any roles");
        }

        unapplyArchitecturalTemplate(allocation,
                architecturalTemplate.getRoles().get(0).getStereotype().getProfile());
    }

    /**
     * Unapplies the given Architectural-Template-{@link Profile} from the
     * {@link Allocation}.
     * 
     * @param system
     *            the {@link Allocation}
     * @param profile
     *            the {@link Profile}
     * @throws RuntimeException
     *             if the profile does not define an Architectural Template.
     */
    public static void unapplyArchitecturalTemplate(final Allocation allocation,
            final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }
        ProfileAPI.unapplyProfile(allocation.eResource(), profile);
    }
    
    /**
     * Unapplies the given {@link AT} from the {@link ResourceEnvironment}.
     * 
     * @param system
     *            the {@link ResourceEnvironment}
     * @param architecturalTemplate
     *            the {@link AT}
     * @throws RuntimeException
     *             if the Architectural Template does not define any roles.
     * @see #unapplyArchitecturalTemplate(System, Profile)
     */
    public static void unapplyArchitecturalTemplate(final ResourceEnvironment resourceenvironment,
            final AT architecturalTemplate) {
        if (architecturalTemplate.getRoles().size() == 0) {
            throw new RuntimeException(
                    "Architectural Template \"" + architecturalTemplate + "\" does not contain any roles");
        }

        unapplyArchitecturalTemplate(resourceenvironment,
                architecturalTemplate.getRoles().get(0).getStereotype().getProfile());
    }

    /**
     * Unapplies the given Architectural-Template-{@link Profile} from the
     * {@link ResourceEnvironment}.
     * 
     * @param system
     *            the {@link ResourceEnvironment}
     * @param profile
     *            the {@link Profile}
     * @throws RuntimeException
     *             if the profile does not define an Architectural Template.
     */
    public static void unapplyArchitecturalTemplate(final ResourceEnvironment resourceenvironment,
            final Profile profile) {
        if (!isArchitecturalTemplate(profile)) {
            throw new RuntimeException("Profile \"" + profile + "\" is no Architectural Template");
        }
        ProfileAPI.unapplyProfile(resourceenvironment.eResource(), profile);
    }

    /**
     * Applies the given {@link Role} to the {@link EObject}.
     * 
     * @param eObject
     *            the {@link EObject}
     * @param role
     *            the {@link Role}
     */
    public static void applyRole(final EObject eObject, final Role role) {
        StereotypeAPI.applyStereotype(eObject, role.getStereotype());
    }

    /**
     * Applies the given Role-{@link Stereotype} to the {@link EObject}.
     * 
     * @param eObject
     *            the {@link EObject}
     * @param stereotype
     *            the {@link Stereotype}
     * @throws RuntimeException
     *             if the given stereotype does not conform the role-convention.
     */
    public static void applyRole(final EObject eObject, final Stereotype stereotype) {
        if (!isRole(stereotype)) {
            throw new RuntimeException("Stereotype \"" + stereotype + "\" is no role");
        }
        StereotypeAPI.applyStereotype(eObject, stereotype);
    }

    /**
     * Unapplies the given {@link Role} from the {@link EObject}.
     * 
     * @param eObject
     *            the {@link EObject}
     * @param role
     *            the {@link Role}
     */
    public static void unapplyRole(final EObject eObject, final Role role) {
        StereotypeAPI.unapplyStereotype(eObject, role.getStereotype());
    }

    /**
     * Unapplies the given Role-{@link Stereotype} from the {@link EObject}.
     * 
     * @param eObject
     *            the {@link EObject}
     * @param stereotype
     *            the {@link Stereotype}
     * @throws RuntimeException
     *             if the given stereotype does not conform the role-convention.
     */
    public static void unapplyRole(final EObject eObject, final Stereotype stereotype) {
        if (!isRole(stereotype)) {
            throw new RuntimeException("Stereotype \"" + stereotype + "\" is no role");
        }
        StereotypeAPI.unapplyStereotype(eObject, stereotype);
    }

    /**
     * Returns all {@link AT}s applied to the {@link System}.
     * 
     * @param resource
     *            the {@link System}
     * @return applied {@link AT}s
     */
    public static Collection<AT> getAppliedArchitecturalTemplates(final Resource resource) {
        final Collection<AT> appliedATs = new LinkedList<>();

        for (final Profile appliedProfile : ProfileAPI.getAppliedProfiles(resource)) {
            if (isArchitecturalTemplate(appliedProfile)) {
                appliedATs.add(getArchitecturalTemplate(appliedProfile));
            }
        }

        return appliedATs;
    }

    /**
     * Returns all {@link StereotypeApplication}s applied to the {@link System} that are
     * role-applications (their {@link Stereotype} is a {@link Role}).
     * 
     * @param eObject
     *            the {@link EObject}
     * @return role-{@link StereotypeApplication}s
     */
    public static Collection<StereotypeApplication> getArchitecturalTemplateApplications(final System system) {
        final Collection<StereotypeApplication> systemRoleStereotypeApplications = new LinkedList<>();

        for (final StereotypeApplication stereotypeApplication : StereotypeAPI.getStereotypeApplications(system)) {
            if (isSystemRole(stereotypeApplication.getStereotype())) {
                systemRoleStereotypeApplications.add(stereotypeApplication);
            }
        }

        return Collections.unmodifiableCollection(systemRoleStereotypeApplications);
    }

    /**
     * Receives the architectural templates attached to a system. Such an attachment is realized via
     * an annotation to an profile with an AT annotation. The annotation references the AT the role;
     * the role is identified by matching the stereotype name to the roles of the AT. If no such
     * role can be found, an empty <code>List</code> is returned.
     * 
     * @return the architectural template applied to this system; an empty <code>List</code> if no
     *         such template can be found.
     */
    public static Collection<AT> getATsFromSystem(final System system) {
        final List<AT> ATs = new LinkedList<>();

        if (system != null) {
            for (final Stereotype stereotype : StereotypeAPI.getAppliedStereotypes(system)) {
                if (isSystemRole(stereotype)) {
                    ATs.add(getRole(stereotype).getAT());
                }
            }
        }

        return Collections.unmodifiableCollection(ATs);
    }

    /**
     * Returns all {@link Role}s applied to the {@link EObject}.
     * 
     * @param eObject
     *            the {@link EObject}
     * @return applied {@link Role}s
     */
    public static Collection<Role> getAppliedRoles(final EObject eObject) {
        final Collection<Role> appliedRoles = new ArrayList<>();

        for (final Stereotype stereotype : StereotypeAPI.getAppliedStereotypes(eObject)) {
            if (isRole(stereotype)) {
                appliedRoles.add(getRole(stereotype));
            }
        }

        return appliedRoles;
    }

    /**
     * Returns all {@link StereotypeApplication}s applied to the {@link EObject} that are
     * role-applications (their {@link Stereotype} is a {@link Role}).
     * 
     * @param eObject
     *            the {@link EObject}
     * @return role-{@link StereotypeApplication}s
     */
    public static Collection<StereotypeApplication> getRoleApplications(final EObject eObject) {
        final Collection<StereotypeApplication> roleStereotypeApplications = new ArrayList<>();

        for (final StereotypeApplication stereotypeApplication : StereotypeAPI.getStereotypeApplications(eObject)) {
            if (isRole(stereotypeApplication.getStereotype())) {
                roleStereotypeApplications.add(stereotypeApplication);
            }
        }

        return roleStereotypeApplications;
    }

    public static Collection<StereotypeApplication> getStereotypeApplicationsWithoutRoles(final EObject eObject) {
        final Collection<StereotypeApplication> roleStereotypeApplications = new ArrayList<>();

        for (final StereotypeApplication stereotypeApplication : StereotypeAPI.getStereotypeApplications(eObject)) {
            if (!isRole(stereotypeApplication.getStereotype())) {
                roleStereotypeApplications.add(stereotypeApplication);
            }
        }

        return roleStereotypeApplications;
    }

    /**
     * TODO documentation
     */
    public static final Collection<ProfileImport> getProfileImports(final EObject eObject) {
        if (ProfileAPI.hasProfileApplication(eObject.eResource())) {
            return Collections.unmodifiableCollection(
                    ProfileAPI.getProfileApplication(eObject.eResource()).getImportedProfiles());
        }
        return Collections.emptyList();
    }

    /**
     * Returns all {@link AT}s that are currently registered.
     * 
     * @return the {@link AT}s
     */
    public static Collection<AT> getRegisteredArchitecturalTemplates() {
        final Collection<AT> registeredATs = new ArrayList<>();

        for (final Profile profile : IProfileRegistry.eINSTANCE.getRegisteredProfiles()) {
            if (isArchitecturalTemplate(profile)) {
                registeredATs.add(getArchitecturalTemplate(profile));
            }
        }

        return registeredATs;
    }

    /**
     * Returns all {@link Role}s that are applicable to the given {@link EObject}.
     * 
     * @param eObject
     *            the {@link EObject}
     * @return applicable {@link Role}s
     */
    public static Collection<Role> getApplicableRoles(final EObject eObject) {
        final Collection<Role> applicableRoles = new ArrayList<>();

        for (final Stereotype applicableStereotype : StereotypeAPI.getApplicableStereotypes(eObject)) {
            if (isRole(applicableStereotype) && !StereotypeAPI.isStereotypeApplied(eObject, applicableStereotype)) {
                applicableRoles.add(getRole(applicableStereotype));
            }

        }
        return applicableRoles;
    }

    /**
     * Tests whether the given {@link EObject} has roles attached.
     * 
     * @param eObject
     *            the {@link EObject} to test
     * @return the test result
     */
    public static boolean hasRoles(final EObject eObject) {
        return !getAppliedRoles(eObject).isEmpty();
    }

    public static Set<AT> getInitiatorATs() {
        return ArchitecturalTemplateAPI.getRegisteredATCatlogs().stream().flatMap(catalog -> catalog.getATs().stream())
                .filter(at -> (at.getDefaultInstanceURI() != null) && (!at.getDefaultInstanceURI().isEmpty()))
                .collect(Collectors.toSet());
    }

    public static Set<Catalog> getRegisteredATCatlogs() {
        final List<String> catalogURIs = ExtensionHelper
                .getAttributes("org.palladiosimulator.architecturaltemplates.catalogs", "ATCatalog", "catalogURI");

        return catalogURIs.stream().map(EMFLoadHelper::loadAndResolveEObject).map(eObject -> (Catalog) eObject)
                .collect(Collectors.toSet());
    }

}
