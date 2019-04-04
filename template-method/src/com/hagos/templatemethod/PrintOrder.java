package com.hagos.templatemethod;

import java.io.IOException;
import java.io.PrintWriter;

public abstract class PrintOrder {
	
	public final void print(Order order, String fileName) throws IOException{
		try(PrintWriter writer = new PrintWriter(fileName)){
			
			writer.println(starts());
			writer.println(formatOrderNumber(order));
			writer.println(formatItems(order));
			writer.println(formatTotal(order));
			
			writer.println(ends());
			
		}
	}
	
	protected abstract String starts();
	
	protected abstract String formatOrderNumber(Order order);

	protected abstract String formatItems(Order order);

	protected abstract Object formatTotal(Order order);
	
	protected abstract String ends();

}
