package com.abs;

import java.math.BigDecimal;
import java.util.Arrays;

public class Manager {
	 public String toString() {
	        return Arrays.asList(employees).toString();
	    }
	    Employee[] employees = new Employee[] { new SalariedEmployee("joe", BigDecimal.valueOf(4567.89)),
	            new HourlyEmployee("mary", BigDecimal.valueOf(12.34)),
	            new CommissionEmployee("bob", BigDecimal.valueOf(12.34)) };
	}