package com.hagos.strategy;

public class Client {

	public static void main(String[] args) {
		Context context = new Context(new AddOperation());
		context.setStrategy(5, 6);
		

	}

}
