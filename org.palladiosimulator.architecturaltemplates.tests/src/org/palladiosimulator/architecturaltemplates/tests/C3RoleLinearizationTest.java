package org.palladiosimulator.architecturaltemplates.tests;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesFactory;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.architecturaltemplates.util.C3RoleLinearization;

import junit.framework.TestCase;

/**
 * Example taken from: https://en.wikipedia.org/wiki/C3_linearization Origin of the Wikipedia
 * example is: https://www.python.org/download/releases/2.3/mro/
 *
 * @author Alexander Openkowski
 */
public class C3RoleLinearizationTest extends TestCase {

    private final static ArchitecturaltemplatesFactory AT_FACTORY = ArchitecturaltemplatesFactory.eINSTANCE;

    private final Role z = AT_FACTORY.createRole();

    private final Role k1 = AT_FACTORY.createRole();
    private final Role k2 = AT_FACTORY.createRole();
    private final Role k3 = AT_FACTORY.createRole();

    private final Role a = AT_FACTORY.createRole();
    private final Role b = AT_FACTORY.createRole();
    private final Role c = AT_FACTORY.createRole();
    private final Role d = AT_FACTORY.createRole();
    private final Role e = AT_FACTORY.createRole();

    private final Role o = AT_FACTORY.createRole();

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        this.z.getSuperRoles().add(this.k1);
        this.z.getSuperRoles().add(this.k2);
        this.z.getSuperRoles().add(this.k3);

        this.k1.getSuperRoles().add(this.a);
        this.k1.getSuperRoles().add(this.b);
        this.k1.getSuperRoles().add(this.c);

        this.k2.getSuperRoles().add(this.d);
        this.k2.getSuperRoles().add(this.b);
        this.k2.getSuperRoles().add(this.e);

        this.k3.getSuperRoles().add(this.d);
        this.k3.getSuperRoles().add(this.a);

        this.a.getSuperRoles().add(this.o);
        this.b.getSuperRoles().add(this.o);
        this.c.getSuperRoles().add(this.o);
        this.d.getSuperRoles().add(this.o);
        this.e.getSuperRoles().add(this.o);
    }

    @Test
    public void testWikipediaRoleSerialization() {
        final List<Role> linearization = C3RoleLinearization.linearize(this.z);

        final StringBuilder sb = new StringBuilder("[");
        for (final Iterator<Role> iterator = linearization.iterator(); iterator.hasNext();) {
            final Role role = iterator.next();
            sb.append(getName(role));
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");

        assertEquals("[Z, K1, K2, K3, D, A, B, C, E, O]", sb.toString());
    }

    private String getName(final Role role) {
        if (this.z.equals(role)) {
            return "Z";
        } else if (this.k1.equals(role)) {
            return "K1";
        } else if (this.k2.equals(role)) {
            return "K2";
        } else if (this.k3.equals(role)) {
            return "K3";
        } else if (this.a.equals(role)) {
            return "A";
        } else if (this.b.equals(role)) {
            return "B";
        } else if (this.c.equals(role)) {
            return "C";
        } else if (this.d.equals(role)) {
            return "D";
        } else if (this.e.equals(role)) {
            return "E";
        } else if (this.o.equals(role)) {
            return "O";
        }
        throw new IllegalArgumentException("Supplied role unknown.");
    }
}
