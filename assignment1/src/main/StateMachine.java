package main;

import java.util.HashMap;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;
import utils.Conditional;
import utils.Operation;

public class StateMachine {
	private Map<String, State> states = new HashMap<>();
	private Map<String, Integer> integers = new HashMap<>();
	private State currentState;
	private State initial;
	private Transition currentTransition;
	private Machine machine;

	private State getState(String name) {
		if (!states.containsKey(name))
			states.put(name, new State(name));
		return states.get(name);
	}

	public Map<String, State> getStates() {
		return this.states;
	}

	public Machine build() {
		this.machine = new Machine(this.states.values(), this.initial, this.integers);
		return this.machine;
	}

	public StateMachine state(String name) {
		this.currentState = this.getState(name);
		return this;
	}

	public StateMachine initial() {
		this.initial = this.currentState;
		return this;
	}

	public StateMachine when(String name) {
		this.currentTransition = new Transition(name);
		this.currentState.addTransition(currentTransition);
		return this;
	}

	public StateMachine to(String name) {
		this.currentTransition.setTargetState(getState(name));
		return this;
	}

	public StateMachine integer(String name) {
		this.integers.put(name, 0);
		return this;
	}

	public StateMachine set(String event, int i) {
		this.currentTransition.setOperation(Operation.SET);
		this.currentTransition.setOperationVariableName(event);
		this.currentTransition.setOperationValue(i);
		return this;
	}

	public StateMachine increment(String event) {
		this.currentTransition.setIncrementOperation();
		this.currentTransition.setOperationVariableName(event);
		return this;
	}

	public StateMachine decrement(String event) {
		this.currentTransition.setDecrementOperation();
		this.currentTransition.setOperationVariableName(event);
		return this;
	}

	public StateMachine ifEquals(String event, int i) {
		this.currentTransition.setCondition(Conditional.EQUAL);
		this.currentTransition.setConditionVariableName(event);
		this.currentTransition.setConditionComparedValue(i);
		return this;
	}

	public StateMachine ifGreaterThan(String event, int i) {
		this.currentTransition.setCondition(Conditional.GREATER_THAN);
		this.currentTransition.setConditionVariableName(event);
		this.currentTransition.setConditionComparedValue(i);
		return this;
	}

	public StateMachine ifLessThan(String event, int i) {
		this.currentTransition.setCondition(Conditional.LESS_THAN);
		this.currentTransition.setConditionVariableName(event);
		this.currentTransition.setConditionComparedValue(i);
		return this;
	}

}
