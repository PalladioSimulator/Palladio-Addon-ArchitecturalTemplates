package org.palladiosimulator.architecturaltemplates.jobs.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;
import org.palladiosimulator.architecturaltemplates.AT;
import org.palladiosimulator.architecturaltemplates.api.ArchitecturalTemplateAPI;
import org.palladiosimulator.architecturaltemplates.jobs.constants.ATPartitionConstants;
import org.palladiosimulator.pcm.repository.Repository;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class ATJobUtil {
	
	private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
	
    public static Collection<AT> getAllATs(final MDSDBlackboard blackboard) {
        final PCMResourceSetPartition pcmRepositoryPartition = (PCMResourceSetPartition) blackboard
                .getPartition(ATPartitionConstants.Partition.PCM.getPartitionId());

        final Collection<Resource> resources = new ArrayList<Resource>();
        try {
        	resources.add(pcmRepositoryPartition.getSystem().eResource());
        	resources.add(pcmRepositoryPartition.getAllocation().eResource());
        	resources.add(pcmRepositoryPartition.getResourceEnvironment().eResource());
        	for(final Repository repository : pcmRepositoryPartition.getRepositories()) {
        		resources.add(repository.eResource());
        	}
        } catch (final IndexOutOfBoundsException e) {
        }

        ArchitecturalTemplateAPI.getATsFromSystem(pcmRepositoryPartition.getSystem());
        final Collection<AT> allATs = new LinkedList<AT>();
        for(Resource resource : resources) {
        	allATs.addAll(ArchitecturalTemplateAPI.getAppliedArchitecturalTemplates(resource));
        }
        
        return removeDuplicates(allATs);
    }
    
    private static Collection<AT> removeDuplicates(Collection<AT> allATs) {
    	return allATs.stream().filter(distinctByKey(at -> at.getId())).collect(Collectors.toList());
	}

}
