package com.ds.structural.decorator;

public class BumperSticker extends AccessoriesDecorator {
	 
	private String color;
 
	public BumperSticker(Car car, String color) {
		this.car = car;
		this.color = color;
	}
 
	public String getColor() {
		return color;
	}
 
	@Override
	public String getDetails() {
		return car.getDetails() + ", bumper stickers with color = " + color;
	}
 
	@Override
	public double calculateCost() {
		return car.calculateCost() + 250;
	}
 
}