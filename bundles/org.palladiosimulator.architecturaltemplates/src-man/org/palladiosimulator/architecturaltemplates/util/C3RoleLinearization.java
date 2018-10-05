package org.palladiosimulator.architecturaltemplates.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.palladiosimulator.architecturaltemplates.Role;

/**
 * TODO add docu
 * 
 * @see https://en.wikipedia.org/wiki/C3_linearization
 * @see https://www.python.org/download/releases/2.3/mro/
 * 
 * @author Alexander Openkowski
 */
public final class C3RoleLinearization {

    /**
     * Private constructor to forbid instantiation.
     */
    private C3RoleLinearization() {
    }

    public static List<Role> linearize(final Role roleToLinearize) {
        return Collections.unmodifiableList(linearizeInternal(roleToLinearize));
    }

    public static List<Role> linearizeReversed(final Role roleToLinearize) {
        final List<Role> linearization = linearizeInternal(roleToLinearize);
        Collections.reverse(linearization);
        return Collections.unmodifiableList(linearization);
    }

    private static List<Role> linearizeInternal(final Role roleToLinearize) {
        final List<List<Role>> ancestorLists = new ArrayList<>();
        final List<Role> linearization = new ArrayList<>();

        linearization.add(roleToLinearize);

        final List<Role> superroles = new ArrayList<>(roleToLinearize.getSuperRoles());
        for (final Role superrole : superroles) { // L[K1],...,L[KN]
            ancestorLists.add(linearizeInternal(superrole));
        }
        if (!superroles.isEmpty()) {
            ancestorLists.add(superroles); // [K1,...,KN]
        }
        merge(ancestorLists, linearization);

        return linearization;
    }

    private static void merge(final List<List<Role>> ancestorLists, final List<Role> linearization) {
        boolean foundGoodHead = false;

        // copy to be able to remove inefficient! Should prefer some final functional style.
        final List<List<Role>> ancestorListsCopy = new ArrayList<>(ancestorLists);
        for (final List<Role> currentAncestorList : ancestorListsCopy) {
            final Role head = headOf(currentAncestorList);
            if (!isTailInOthers(head, currentAncestorList, ancestorListsCopy)) { // good head!
                linearization.add(head);
                removeFromAllAncestorLists(head, ancestorLists);
                foundGoodHead = true;
                break;
            }
        }
        if (ancestorLists.isEmpty()) { // done
            return;
        } else if (foundGoodHead) { // run successful, next one
            merge(ancestorLists, linearization);
        } else { // no good head can be found
            throw new RuntimeException("No consistent linearization.");
        }
    }

    private static Role headOf(final List<Role> ancestors) {
        return ancestors.get(0);
    }

    private static List<Role> tailOf(final List<Role> ancestors) {
        return ancestors.subList(1, ancestors.size());
    }

    private static boolean isTailInOthers(final Role head, final List<Role> currentAncestorList,
            final List<List<Role>> ancestorListsCopy) {
        for (final List<Role> list : ancestorListsCopy) {
            // do not check current list, only others
            if (!list.equals(currentAncestorList)) {
                if (tailOf(list).contains(head)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void removeFromAllAncestorLists(final Role role, final List<List<Role>> ancestorLists) {
        for (final List<Role> list : ancestorLists) {
            list.remove(role);
        }
        removeEmptyAncestorLists(ancestorLists); // clean-up
    }

    private static void removeEmptyAncestorLists(final List<List<Role>> ancestorLists) {
        final Iterator<List<Role>> ancestorListsIterator = ancestorLists.iterator();
        while (ancestorListsIterator.hasNext()) {
            if (ancestorListsIterator.next().isEmpty()) {
                ancestorListsIterator.remove();
            }
        }
    }

}
