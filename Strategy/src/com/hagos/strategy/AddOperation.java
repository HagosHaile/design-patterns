package com.hagos.strategy;

public class AddOperation implements Operation {

	@Override
	public void doOperation(int x, int y) {
		int z = x+y;
		System.out.println("the sum is: " +  z);

	}

}
