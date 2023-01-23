package com.ds.structural.proxy;

public class ProxyDesignPatternDemo {

	public static void main(String[] args) {
	      Image image = new ProxyImage("cube.jpeg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      //image will not be loaded from disk
	      image.display(); 

	}

}
