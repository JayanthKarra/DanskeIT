package FileIO;

import java.io.Serializable;

public class Employee  implements Serializable{
	
	private int empNo;
		private String Name; 
		private float Salary;
		
	
		public Employee(int empNo, String name, float salary) {
			super();
			this.empNo = empNo;
			Name = name;
			Salary = salary;
		}
		
		public void showData(){
			System.out.println(empNo + " : "+Name +" : "+ Salary);
			System.out.println("Average Salary"+ Math.sqrt(22d)); //without static import
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
