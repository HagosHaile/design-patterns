package com.hagos.state;

//context class
//state change logic is done in the context class
//new objects for each state are created in each of the order class
//methods(dispatch,paymentSucessful, delivered )
public class Order {

	private OrderState currentState;
	public double cancel() {
		
		double charges = currentState.handleCancellation();
		return charges;
	}
	
	public void dispatch() {
		currentState = new InTransit();
	}
	
	public void paymentSucessful() {
		currentState = new Paid();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
	
}
