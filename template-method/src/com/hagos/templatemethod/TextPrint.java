package com.hagos.templatemethod;

import java.util.Map;

public class TextPrint extends PrintOrder {

	@Override
	protected String starts() {
		return "Order Details";
	}

	@Override
	protected String formatOrderNumber(Order order) {
		return order.getId();
	}

	@Override
	protected String formatItems(Order order) {
		StringBuilder builder = new StringBuilder("\n -----------------------------------\n");
		for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
			builder.append("Name: "+ entry.getKey() +" Price $" +entry.getValue());
			builder.append("\n");
		}
		builder.append("----------------------------------------------------------\n");
		return builder.toString();
	}

	@Override
	protected Object formatTotal(Order order) {
		return "Total:  $" + order.getTotal();
	}

	@Override
	protected String ends() {
		
		return " ";
	}

}
