package coreJava8.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda_01 {
	public static void main(String[] args)
	{
// Case 1: 
	List<String> al = new ArrayList<String>();
	 al.add("Java");
	 al.add("Mysql");
	 
	 al.forEach(x ->  { System.out.println(x); } );
 
	 
// Case 2: // Lambda expression without return keyword.  
     Addable ad1=(a,b)->(a+b);  
     System.out.println(ad1.add(10,20));
     
 
     
 //Case 3: // Lambda expression with return keyword.    
     Addable ad2=( int a, int  b)->{ return (a+b);  };
              System.out.println(ad2.add(100,200));  
}
}
