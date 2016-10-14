package org.palladiosimulator.architecturaltemplates.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.Catalog;
import org.palladiosimulator.architecturaltemplates.Constraint;
import org.palladiosimulator.architecturaltemplates.Role;
import org.palladiosimulator.architecturaltemplates.tests.util.EMFModelLoad;

import junit.framework.TestCase;

public class RoleInheritanceTest extends TestCase {

	private final Catalog catalog = new EMFModelLoad().load();
	private final Map<String, Map<String, List<String>>> atRoleConstraintNames = new HashMap<>();

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		final Map<String, List<String>> threeLayerThreeTierRoleConstraintNames = new HashMap<>();
		atRoleConstraintNames.put("Three Layer Three Tier", threeLayerThreeTierRoleConstraintNames);

		threeLayerThreeTierRoleConstraintNames.put("Three Layer Three Tier System",
				Arrays.asList("System is Three Layer Three Tier System", 
						"Three Layer Three Tier System has at least 3 Assemblies",
						"All Assemblies are stereotyped as Presentation Layer Assembly, Middle Layer Assembly, or Data Layer Assembly",
						"Three Layer Three Tier System has at least one Presentation Layer Assembly",
						"Three Layer Three Tier System has at least one Middle Layer Assembly",
						"Three Layer Three Tier System has at least one Data Layer Assembly",
						"Middle Layer Assemblies do not require functionality from Presentation Layer Assemblies",
						"Data Layer Assemblies do not require functionality from Presentation Layer Assemblies",
						"Presentation Layer Assemblies do not require functionality from Data Layer Assemblies",
						"Data Layer Assemblies do not require functionality from Middle Layer Assemblies",
						"No Provided Delegation Connectors to Middle Layer Assemblies",
						"No Provided Delegation Connectors to Data Layer Assemblies",
						"No Provided Infrastructure Delegation Connectors to Middle Layer Assemblies",
						"No Provided Infrastructure Delegation Connectors to Data Layer Assemblies",
						"Resource Environment has exactly three Resource Container",
						"All Resource Container are stereotyped as Presentation Tier, Middle Tier or Data Tier",
						"Three Layer Three Tier System has exactly one Presentation Tier",
						"Three Layer Three Tier System has exactly one Middle Tier",
						"Three Layer Three Tier System has exactly one Data Tier"));

		threeLayerThreeTierRoleConstraintNames.put("Presentation Layer Assembly",
				Arrays.asList("Presentation Layer Assembly is not another Layer Assembly",
						"Presentation Layer Assembly is deployed on Presentation Tier"));

		threeLayerThreeTierRoleConstraintNames.put("Middle Layer Assembly",
				Arrays.asList("Middle Layer Assembly is not another Layer Assembly",
						"Middle Layer Assembly is deployed on Middle Tier"));

		threeLayerThreeTierRoleConstraintNames.put("Data Layer Assembly",
				Arrays.asList("Data Layer Assembly is not another Layer Assembly",
						"Data Layer Assembly is deployed on Data Tier"));

		threeLayerThreeTierRoleConstraintNames.put("Presentation Tier", 
				Arrays.asList());

		threeLayerThreeTierRoleConstraintNames.put("Middle Tier", 
				Arrays.asList());

		threeLayerThreeTierRoleConstraintNames.put("Data Tier", 
				Arrays.asList());

//		final Map<String, List<String>> dynamicLoadbalancingCachingAssemblyContextRoleConstraintNames = new HashMap<>();
//		atRoleConstraintNames.put("Dynamic Loadbalancing Caching AssemblyContext", dynamicLoadbalancingCachingAssemblyContextRoleConstraintNames);
//
//		dynamicLoadbalancingCachingAssemblyContextRoleConstraintNames.put("Dynamic Loadbalancing Caching AssemblyContext System",
//				Arrays.asList("System is Dynamic Horizontal Scaling System",
//						"System has exactly one Replicable Assembly Context"));
//
//		dynamicLoadbalancingCachingAssemblyContextRoleConstraintNames.put("Dynamically Loadbalanced Cached AssemblyContext",
//				Arrays.asList("Scale Out Threshold greater than Scale In Threshold",
//						"Assembly Context is Replicable Assembly Context", "Number of Replicas greater 0",
//						"Scale In Threshold greater 0", "Scale Out Threshold greater 0"));
//
//		final Map<String, List<String>> threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames = new HashMap<>();
//		atRoleConstraintNames.put("Three Layer Three Tier Dynamic Loadbalancing Caching Middle Layer AssemblyContext",
//				threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames);
//		
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Three Layer Three Tier Dynamic Loadbalancing Caching Middle Layer AssemblyContext System",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Three Layer Three Tier System"),
//						dynamicLoadbalancingCachingAssemblyContextRoleConstraintNames.get("Dynamic Loadbalancing Caching AssemblyContext System")));
//		
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Presentation Layer Assembly",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Presentation Layer Assembly")));
//				
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Dynamically Loadbalanced Cached Middle Layer Assembly",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Middle Layer Assembly"),
//						dynamicLoadbalancingCachingAssemblyContextRoleConstraintNames.get("Dynamically Loadbalanced Cached AssemblyContext")));
//		
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Data Layer Assembly",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Data Layer Assembly")));
//		
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Presentation Tier",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Presentation Tier")));
//		
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Middle Tier",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Middle Tier")));
//			
//		threeLayerThreeTierDynamicLoadbalancingCachingMiddleLayerAssemblyContextRoleConstraintNames.put("Data Tier",
//				addAll(new ArrayList<>(),
//						threeLayerThreeTierRoleConstraintNames.get("Data Tier")));
	}

	@Test
	public void testATsHaveAllConstraints() {
		for (String atName : atRoleConstraintNames.keySet()) {
			AT at = getATByName(atName);
			Map<String, List<String>> roleConstraintNames = atRoleConstraintNames.get(atName);
			for (final String roleName : roleConstraintNames.keySet()) {
				final Role role = getRoleByName(at, roleName);
				for (final String constraintName : roleConstraintNames.get(roleName)) {
					boolean hasConstraintWithName = hasConstraintWithName(role, constraintName);
					assertTrue(atName + " AT: role '" + roleName + "' misses constraint with name '" + constraintName
							+ "'", hasConstraintWithName);
				}
			}
		}
	}

	@Test
	public void testATsHaveNoOtherConstraints() {
		for (AT at : catalog.getATs()) {
			final String atName = at.getEntityName();
			Map<String, List<String>> roleConstraintNames = atRoleConstraintNames.get(atName);
			if (roleConstraintNames == null) {
				continue; // skip to next AT
			}
			for (Role role : at.getRoles()) {
				final String roleName = role.getEntityName();
				List<String> constraintNames = roleConstraintNames.get(roleName);
				for (Constraint constraint : role.getConstraintsIncludingInherited()) {
					final String constraintName = constraint.getEntityName();
					assertTrue(atName + " AT: role '" + roleName + "' has additional constraint with name '"
							+ constraintName + "'", constraintNames.contains(constraintName));
				}
			}
		}
	}

	private AT getATByName(final String name) {
		for (AT at : catalog.getATs()) {
			if (at.getEntityName().equals(name)) {
				return at;
			}
		}
		return null;
	}

	private Role getRoleByName(final AT at, String name) {
		for (Role role : at.getRoles()) {
			if (role.getEntityName().equals(name)) {
				return role;
			}
		}
		return null;
	}

	private boolean hasConstraintWithName(final Role role, final String name) {
		boolean hasConstraintWithName = false;
		for (Constraint constraint : role.getConstraintsIncludingInherited()) {
			if (constraint.getEntityName().equals(name)) {
				hasConstraintWithName = true;
				break;
			}
		}
		return hasConstraintWithName;
	}
	
	@SafeVarargs
	private final <E> List<E> addAll(final List<E> dest, final List<? extends E>... src) {
	    for(List<? extends E> c : src) {
	        dest.addAll(c);
	    }

	    return dest;
	}
}
