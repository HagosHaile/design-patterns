package com.hagos.state;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("it is new order and no processing fee is charged");
		return 0;
	}

}
