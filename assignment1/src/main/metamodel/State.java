package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private List<Transition> transitions = new ArrayList<>();

	public State(String name) {
		super();
		this.name = name;
	}

	public Object getName() {
		return this.name;
	}

	public List<Transition> getTransitions() {
		return this.transitions;
	}

	public Transition getTransitionByEvent(String eventName) {
		return this.transitions.stream().filter(transition -> transition.getEvent().equals(eventName))
				.findAny()
				.orElse(null);
	}
	
	public void addTransition(Transition transition) {
		this.transitions.add(transition);
	}
}
