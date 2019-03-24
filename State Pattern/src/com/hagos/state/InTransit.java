package com.hagos.state;

public class InTransit implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("cancellation process going on");
		System.out.println("contacting payment for transaction rollback.");
		return 20;
	}

}
