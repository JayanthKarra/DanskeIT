package com.ds.creation.single;

// Lazy Initialization
public class SingletonClassDemo {

	// Static attribute.
	private static SingletonClassDemo instance = null;

	// Private constructor.
	private SingletonClassDemo() {}
	
	// Static function.
	public static SingletonClassDemo getInstance() {
		// If there is no instance available, create new one (i.e. lazy initialization).
		if (instance == null) {
			instance = new SingletonClassDemo();
		}
		return instance;
	}
	  public void showMessage(){
	      System.out.println("Hello World!");
	   }
}