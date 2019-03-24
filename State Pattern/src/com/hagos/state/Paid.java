package com.hagos.state;

public class Paid implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("contacting payment gateway to rollback");
		return 10;
	}

}
