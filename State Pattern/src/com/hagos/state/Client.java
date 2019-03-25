package com.hagos.state;

public class Client {

	public static void main(String[] args) {
		System.out.println("=====================================");
		Order order = new Order();
		order.cancel();
		
		System.out.println("=====================================");
		order.paymentSucessful();
		order.cancel();

		System.out.println("=====================================");
		order.delivered();
		order.cancel();
		
		System.out.println("=====================================");
		order.dispatch();
		order.cancel();
		

	}

}
