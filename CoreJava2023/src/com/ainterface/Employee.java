package com.ainterface;

public class Employee implements IPerson {

	@Override
	public String sayHi() {
		return " Hello "+firstName+" "+lastName;
	}
}
