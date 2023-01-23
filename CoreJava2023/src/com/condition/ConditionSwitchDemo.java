package com.condition;

public class ConditionSwitchDemo {
	public static void main(String [] args)
	{
		int expression = 3;
	    
	    switch(expression) {
	        
	      case 2:
	        System.out.println("Small Size");
	        break;

	      case 3:
	        System.out.println("Large Size");
	        break;
	            
	      // default case
	      default:
	        System.out.println("Unknown Size");
	    }
	}

}
