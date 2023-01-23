package com.employee.customexception;
import static java.lang.Math.*;
public class Employee {
	static String company = "TCS";
	static void display() 
	{ 
		System.out.println("Company: "+ Employee.company);
	} 
	
	
	private int empNo;
		private String Name; 
		private float Salary;
		
		public Employee(){};
	
		public Employee(int empNo, String name, float salary) {
			super();
			this.empNo = empNo;
			Name = name;
			Salary = salary;
		}
		
		public void showData(){
			System.out.println(empNo + " : "+Name +" : "+ Salary);
			System.out.println("Average Salary"+ Math.sqrt(22d)); //without static import
			System.out.println("Average Salary"+ sqrt(22d));//Static import
		}
		






		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public float getSalary() {
			return Salary;
		}
		public void setSalary(float salary) {
			Salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empNo=" + empNo + ", Name=" + Name + ", Salary=" + Salary + "]";
		}
		
		

}
