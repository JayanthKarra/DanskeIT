package com.ds.behavior.observer;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order("101");
    	PriceObserver priceObject = new PriceObserver();
    	order.attach(priceObject);
    	
    	QuantityObserver quantObject = new QuantityObserver();
    	order.attach(quantObject);
    	
    	order.addItem(50); //Change in State
    	order.addItem(179);
    	
    	System.out.println(order);
    }
}

//https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/
