package com.hagos.observer;

public class PriceObserver implements OrderObserver {

	@Override
	public void update(Order order) {
		double total = order.getTotal();
		
		if(total>=200) {
			order.setDiscount(10);
		}else if(total >= 500) {
			order.setDiscount(20);
		}

	}

}
