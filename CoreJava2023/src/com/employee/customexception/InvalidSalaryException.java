package com.employee.customexception;

public class InvalidSalaryException extends Exception   {

	public InvalidSalaryException(String message) {
		super(message);
	}
}
