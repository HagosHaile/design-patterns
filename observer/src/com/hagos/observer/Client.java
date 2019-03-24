package com.hagos.observer;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("100");
		PriceObserver price = new PriceObserver();
		
		order.attach(price);
		
		//QuantityObserver quantity = new QuantityObserver();
		//order.attach(quantity);
		
		order.addItem(200);
		
		System.out.println(order);

	}

}
