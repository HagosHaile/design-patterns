package com.hagos.templatemethod;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("546");
		order.addItem("Soda", 2.00);
		order.addItem("closth", 23.00);
		
		PrintOrder print = new TextPrint();
		print.print(order, "txt");

	}

}
