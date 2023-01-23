package com.polymorphism.inheritance.abstracts;

public class TestInheritancePolymorphism {
	public static void main(String args[]){  
	//Bank bank = new Bank();// Cannot be Instantiated

	Bank bank=new SBI();  // Derived class can refer subclass Object 
	bank=new ICICIBank();  
	System.out.println("SBI Rate of Interest: "+bank.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+bank.getRateOfInterest());  
	System.out.println(" Country is "+bank.country);
	}  
}
/*
 * 1. How to create Class?
 * 2. Concept of Inheritance 
 * 3. 
 * 
 * */
 