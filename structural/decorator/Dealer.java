package com.ds.structural.decorator;

public class Dealer {
	 
	public static void main(String[] args) {
 
		Car ferrari = new SportsCar();
		Car musicSystem = new MusicSystem(ferrari);
		Car bumperSticker = new BumperSticker(musicSystem, "RED");
 
		System.out.println("Car information = " + bumperSticker.getDetails() + ", cost " + bumperSticker.calculateCost());
	}
}