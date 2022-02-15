package main.metamodel;

import utils.Conditional;
import utils.Operation;

public class Transition {
	
	private String transitionEvent;
	private State targetState;
	
	private boolean hasIncrementOption;
	private boolean hasDecrementOption;
	
	private Conditional conditional;
	private String conditionalVariableName;
	private boolean hasSetOperation;
	private int operationValue;
	
	private Operation operation;
	private String operationVariableName;
	private int conditionalComparedValue;

	public Transition() {
	}

	public Transition(String transitionEvent) {
		this.transitionEvent = transitionEvent;
	}

	public String getEvent() {
		return this.transitionEvent;
	}

	public State getTarget() {
		return this.targetState;
	}
	
	public void setTargetState(State state) {
		this.targetState = state;
	}

	public boolean hasSetOperation() {
		return this.hasSetOperation;
	}
	
	public void setOperation(Operation operational) {
		this.hasSetOperation = true;
		this.operation = operational;
	}
	
	public void setOperationVariableName(String name) {
		this.operationVariableName = name;
	}
	
	public void setCondition(Conditional condition) {
		this.conditional = condition;
	}
	
	public Conditional getCondition() {
		return this.conditional;
	}
	
	public void setOperationValue(int value) {
		this.operationValue = value;
	}
	
	public void setConditionComparedValue(int value) {
		this.conditionalComparedValue = value;
	}
	
	public void setConditionVariableName(String name) {
		this.conditionalVariableName = name;
	}
	
	public int getOperationValue() {
		return this.operationValue;
	}
	
	public boolean hasIncrementOperation() {
		return this.hasIncrementOption;
	}
	
	public void setIncrementOperation() {
		this.hasIncrementOption = true;
		this.operation = Operation.INCREMENT;
	}

	public boolean hasDecrementOperation() {
		return this.hasDecrementOption;
	}
	
	public void setDecrementOperation() {
		this.hasDecrementOption = true;
		this.operation = Operation.DECREMENT;
	}

	public String getOperationVariableName() {
		return this.operationVariableName;
	}

	public boolean isConditional() {
		return this.conditional != null;
	}

	public String getConditionVariableName() {
		return this.conditionalVariableName;
	}

	public Integer getConditionComparedValue() {
		return this.conditionalComparedValue;
	}

	public boolean isConditionEqual() {
		return this.conditional.equals(Conditional.EQUAL);
	}

	public boolean isConditionGreaterThan() {
		return this.conditional.equals(Conditional.GREATER_THAN);
	}

	public boolean isConditionLessThan() {
		return this.conditional.equals(Conditional.LESS_THAN);
	}

	public boolean hasOperation() {
		return this.hasDecrementOption || this.hasIncrementOption;
	}

}
