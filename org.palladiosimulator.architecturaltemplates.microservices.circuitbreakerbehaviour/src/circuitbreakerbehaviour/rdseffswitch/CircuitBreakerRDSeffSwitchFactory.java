package circuitbreakerbehaviour.rdseffswitch;

import org.eclipse.emf.ecore.util.ComposedSwitch;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.simulizar.interpreter.AbstractRDSeffSwitchFactory;
import org.palladiosimulator.simulizar.interpreter.InterpreterDefaultContext;
import org.palladiosimulator.simulizar.runtimestate.SimulatedBasicComponentInstance;

/**
 * 
 * @author mrombach
 *
 */
public class CircuitBreakerRDSeffSwitchFactory extends AbstractRDSeffSwitchFactory {

	@Override
	protected Switch<Object> createRDSeffSwitch(InterpreterDefaultContext context,
			SimulatedBasicComponentInstance basicComponentInstance, ComposedSwitch<Object> parentSwitch) {
		return new CircuitBreakerRDSeffSwitch(context, basicComponentInstance, parentSwitch);
	}

}
