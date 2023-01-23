package com.polymorphism.inheritance;

public class TestInheritancePolymorphism {
	public static void main(String args[]){  
	Bank bank;

	bank=new SBI();  // Derived class can refer subclass Object 
	bank=new ICICIBank();  
	System.out.println("SBI Rate of Interest: "+bank.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+bank.getRateOfInterest());  
	
	}  
}
/*
 * 1. How to create Class?
 * 2. Concept of Inheritance 
 * 3. 
 * 
 * */
 