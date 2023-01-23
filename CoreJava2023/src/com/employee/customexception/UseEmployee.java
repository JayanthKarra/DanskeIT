package com.employee.customexception;

public class UseEmployee {
	
	public static void main(String ... args ) //Varargs
	{
		//final double AverageSalary=98779d;  
		Employee employee = new Employee(); 
	/*	Employee employee = new Employee(101,"Alisa", 345435.5f); 
		employee.setEmpNo(100);
		employee.setName("Alex");
		employee.setSalary(45654.67f);*/
		//System.out.println(employee);
		//Employee.display();
		// AverageSalary=AverageSalary+100; //Error
		//System.out.println(AverageSalary+10);

	     try {
	     
	    	 if(employee.getSalary() < 10000){  
			    	 // throw an object of user defined exception  
			         throw new InvalidSalaryException("salary is not valid ");    
	     	}  
	        else {   
	         System.out.println("welcome to vote");   
	         }  
	     }
	     catch(InvalidSalaryException e)
	     {
	    	 System.out.println("Salary Cannot be Considered");
	     }
		
	}

}
