package com.ds.structural.decorator;

public class SportsCar implements Car{
	 
	@Override
	public String getDetails() {
		return "A sports car";
	}
 
	@Override
	public double calculateCost() {
		return 100000;
	}
 
}