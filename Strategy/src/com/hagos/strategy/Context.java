package com.hagos.strategy;

public class Context {
	
	private Operation operation;

	public Context(Operation operation) {
		this.operation = operation;
	}
	
	public void setStrategy(int x, int y) {
		operation.doOperation(x, y);
	}
	

}
