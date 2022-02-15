package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;
import utils.Conditional;

public class MachineInterpreter {
	private Machine machine; // metamodel
	private State currentState; // runtime state
	
	public void run(Machine machine) {
		this.machine = machine;
		this.currentState = machine.getInitialState();
	}

	public State getCurrentState() {
		return this.currentState;
	}

	public void processEvent(String event) {
		for (Transition transition : currentState.getTransitions()) {
			if (transition.getEvent().equals(event)) {
				var isCondition = true;
				if (transition.isConditional()) {
					var value = transition.getConditionComparedValue();
					var machineValue = this.machine.getIntegers().get(transition.getConditionVariableName());
					switch (transition.getCondition()) {
						case EQUAL:
							isCondition = value == machineValue;
							break;
						case GREATER_THAN:
							isCondition = value < machineValue;
							break;
						case LESS_THAN:
							isCondition = value > machineValue;
							break;
						default:
							break;
					}
				}
				var operandName = transition.getOperationVariableName();
				var operandValue = transition.getOperationValue();
				var machineIntegers = this.machine.getIntegers();
				
				if (transition.hasSetOperation() && isCondition) {
					this.machine.setIntegers(operandName, operandValue);
				} else if (transition.hasIncrementOperation()) {
					this.machine.setIntegers(operandName, machineIntegers.get(operandName) + 1);
				} else if (transition.hasDecrementOperation()) {
					this.machine.setIntegers(operandName, machineIntegers.get(operandName) - 1);
				}
				if (isCondition) {
					this.currentState = transition.getTarget();
					break;
				}
			}
		}
		System.err.println("Unhandled event "+event);
		
	}

	public int getInteger(String integer) {
		return this.machine.getIntegers().get(integer);
	}

}
