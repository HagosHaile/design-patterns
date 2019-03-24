package com.hagos.observer;

import java.util.ArrayList;
import java.util.List;

//concrete observable 
public class Order {
	
	private String id;
	
	private double itemCost;
	
	private int count;

	public Order(String id) {
		this.id = id;
	}
	
	private List<OrderObserver> observers = new ArrayList<>();
	
	private double discount; 
	private double shippingCost;

	public void attach(OrderObserver order) {
		observers.add(order);
	}
	
	public void detach(OrderObserver order) {
		observers.remove(order);
	}
	
	public double getTotal() {
		
		return itemCost - discount + shippingCost;
	}
	
	public void addItem(double price) {
		itemCost +=price;
		count++;
		observers.forEach(o->o.update(this)); //sends notification to all observers.
	}
	
	public int getCount() {
		return count;
	}
	
	public String getId() {
		return id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", itemCost=" + itemCost + ", count=" + count 
				+ ", discount=" + discount + ", shippingCost=" + shippingCost + "]";
	}
	
	

}
