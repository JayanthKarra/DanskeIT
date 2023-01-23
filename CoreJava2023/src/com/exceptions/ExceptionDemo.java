package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 0;
		 // b = 7/a;     // Divide by zero, will lead to exception
		try {
			int a = 0;
			int b = 7/a;    
			}catch (ArithmeticException e){
			  System.out.println("Cannot divide by Zero"+e.getMessage());
			  }
			catch (Exception e){ //Multiple catch
			  System.out.println(e.getMessage());
			  }
			finally {
				 System.out.println("I am finally block");
			}
				/*catch (ArithmeticException e){ //UNREACHABLE
			  System.out.println("Cannot divide by Zero"+e.getMessage());
			  }*/
			

}
}