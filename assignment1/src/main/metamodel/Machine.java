package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	private List<State> states = new ArrayList<>();
	private State initialState;
	private Map<String, Integer> integers = new HashMap<>();
	
	public Machine(Collection<State> states, State initialState, Map<String, Integer> integers) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		this.integers = integers;
	}

	public List<State> getStates() {
		return this.states;
	}
	
	public void setStates(List<State> states) {
		this.states.addAll(states);
	}

	public State getInitialState() {
		return this.initialState;
	}
	
	public void setInitialState(State initialSate) {
		this.initialState = initialSate;
	}

	public State getState(String state) {
		for (State s : this.states) {
			if (s.getName().equals(state)) {
				return s;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		return this.integers.size();
	}

	public boolean hasInteger(String integer) {
		return this.integers.containsKey(integer);
	}
	
	public Map<String, Integer> getIntegers() {
		return this.integers;
	}
	
	public void setIntegers(String name, Integer i) {
		this.integers.put(name,i);
	}

}
