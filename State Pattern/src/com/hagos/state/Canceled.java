package com.hagos.state;

public class Canceled implements OrderState {

	@Override
	public double handleCancellation() {
		throw new IllegalArgumentException("canceled order can not be canceled anymore.");
	}

}
