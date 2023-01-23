package com.employee;

public class UseEmployee {
	
	public static void main(String ... args ) //Varargs
	{
		
		final double AverageSalary=98779d;  
		//Employee employee = new Employee(); 
		Employee employee = new Employee(101,"Alisa", 345435.5f); 
		employee.setEmpNo(100);
		employee.setName("Alex");
		employee.setSalary(45654.67f);
		System.out.println(employee);
		Employee.display();
		// AverageSalary=AverageSalary+100; //Error
		System.out.println(AverageSalary+10);
		
		
		//Array
		Employee[] empObjects = new Employee[2];
		 //create & initialize actual employee objects using constructor
	     empObjects[0] = new Employee(100,"ABC",3455f);
	     empObjects[1] = new Employee(200,"XYZ",6447f);
	 
	     //display the employee object data
	     System.out.println("Employee Object 1:");
	     empObjects[0].showData();
	     System.out.println("Employee Object 2:");
	     empObjects[1].showData();
	     
	     
	     //Wrapping of Data 
		
		
	}

}
