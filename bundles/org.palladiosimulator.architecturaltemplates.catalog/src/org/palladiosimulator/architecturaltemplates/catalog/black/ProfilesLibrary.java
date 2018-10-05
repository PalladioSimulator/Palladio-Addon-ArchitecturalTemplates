package org.palladiosimulator.architecturaltemplates.catalog.black;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.ProfileAPI;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

public class ProfilesLibrary {

    public ProfilesLibrary() {
        super();
    }

    public static boolean isProfileApplied(final EObject eObject, final String profileName) {
        return ProfileAPI.isProfileApplied(eObject.eResource(), profileName);
    }

    public static void applyProfile(final EObject eObject, final String profileName) {
        ProfileAPI.applyProfile(eObject.eResource(), profileName);
    }

    public static boolean hasAppliedStereotype(final Entity pcmEntity, final String stereotypeName) {
        return StereotypeAPI.isStereotypeApplied(pcmEntity, stereotypeName);
    }

    public static boolean hasAppliedStereotype(final Set<Entity> pcmEntitySet, final String stereotypeName) {
        return StereotypeAPI.hasAppliedStereotype(pcmEntitySet, stereotypeName);
    }

    public static Collection<Stereotype> getAppliedStereotypes(final Entity pcmEntity) {
        return StereotypeAPI.getAppliedStereotypes(pcmEntity);
    }

    public static void applyStereotype(final Entity pcmEntity, final String stereotypeName) {
        StereotypeAPI.applyStereotype(pcmEntity, stereotypeName);
    }

    public static void removeStereotypeApplications(final Entity pcmEntity, final String stereotypeName) {
        StereotypeAPI.unapplyStereotype(pcmEntity, stereotypeName);
    }

    public static void setTaggedValue(final Entity pcmEntity, final Object value, final String stereotypeName,
            final String taggedValueName) {
        StereotypeAPI.setTaggedValue(pcmEntity, value, stereotypeName, taggedValueName);
    }

    public static void setTaggedValue(final Entity pcmEntity, final int value, final String stereotypeName,
            final String taggedValueName) {
        StereotypeAPI.setTaggedValue(pcmEntity, value, stereotypeName, taggedValueName);
    }

    public static void setStringTaggedValue(final Entity pcmEntity, final String value, final String stereotypeName,
            final String taggedValueName) {
        StereotypeAPI.setTaggedValue(pcmEntity, value, stereotypeName, taggedValueName);
    }

    public static void setDoubleTaggedValue(final Entity pcmEntity, final double value, final String stereotypeName,
            final String taggedValueName) {
        StereotypeAPI.setTaggedValue(pcmEntity, value, stereotypeName, taggedValueName);
    }

    public static Object getTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    public static int getIntTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    public static long getLongTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    public static double getDoubleTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    public static String getStringTaggedValue(final Entity pcmEntity, final String taggedValueName,
            final String stereotypeName) {
        return StereotypeAPI.getTaggedValue(pcmEntity, taggedValueName, stereotypeName);
    }

    /**
     * Checks whether in the given set exactly one of its members has an applied {@link Stereotype}
     * of the given name.
     * 
     * @param pcmEntitySet
     *            the set of entities
     * @param stereotypeName
     *            the stereotype name
     * @return
     * @see #hasAppliedStereotype(Entity, String)
     */
    public static boolean appliedStereotypesEqualsOne(final Set<Entity> pcmEntitySet, final String stereotypeName) {
        int appliedStereotypes = 0;

        for (final Entity entity : pcmEntitySet) {
            if (StereotypeAPI.isStereotypeApplied(entity, stereotypeName)) {
                appliedStereotypes++;
            }
        }

        if (appliedStereotypes != 1) {
            return false;
        }
        return true;

        // Java 8:
        // return pcmEntitySet.stream().filter(entity -> hasAppliedStereotype(entity,
        // stereotypeName)).count() == 1;
    }

    public static void delete(final List<NamedElement> rootEObjects, final Entity eObject) {
        final Set<EObject> eObjects = new HashSet<EObject>();
        final Set<EObject> crossResourceEObjects = new HashSet<EObject>();
        eObjects.add(eObject);
        for (@SuppressWarnings("unchecked")
        final TreeIterator<InternalEObject> j = (TreeIterator<InternalEObject>) (TreeIterator<?>) eObject
                .eAllContents(); j.hasNext();) {
            final InternalEObject childEObject = j.next();
            if (childEObject.eDirectResource() != null) {
                crossResourceEObjects.add(childEObject);
            } else {
                eObjects.add(childEObject);
            }
        }

        Map<EObject, Collection<EStructuralFeature.Setting>> usages;
        usages = UsageCrossReferencer.findAll(eObjects, rootEObjects);

        for (final Map.Entry<EObject, Collection<EStructuralFeature.Setting>> entry : usages.entrySet()) {
            final EObject deletedEObject = entry.getKey();
            final Collection<EStructuralFeature.Setting> settings = entry.getValue();
            for (final EStructuralFeature.Setting setting : settings) {
                if (!eObjects.contains(setting.getEObject()) && setting.getEStructuralFeature().isChangeable()) {
                    EcoreUtil.remove(setting, deletedEObject);
                }
            }
        }

        EcoreUtil.remove(eObject);

        for (final EObject crossResourceEObject : crossResourceEObjects) {
            EcoreUtil.remove(crossResourceEObject.eContainer(), crossResourceEObject.eContainmentFeature(),
                    crossResourceEObject);
        }
    }
}
