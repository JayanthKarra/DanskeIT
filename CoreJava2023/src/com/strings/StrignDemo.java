package com.strings;

public class StrignDemo {
	public static void main(String...args)
	{
		String s="Alex";  
		   s.concat(" Martin");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		   
		   
		   //---------String Comparision----equals---
		   //compares this string to the specified object.
		   String s1="Alex";  
		   String s2="Alex";  
		   String s3=new String("Alex");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		   
		   
		   //------------2) By Using == operator--
		   //The == operator compares references not values.
		   
		  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		   
		   //------compareTo-----\
		   

		   String s10="Max"; 
		   String s20="Max";  
		   String s30=new String("Alex");  
		   System.out.println(s10.compareTo(s20));//0  
		   System.out.println(s10.compareTo(s30));//12(because s1>s3)  
		   System.out.println(s30.compareTo(s10));//-12(because s3 < s1 )  
		   
		   //---_String builder and buffer---------
		   StringBuilder builder=new StringBuilder("hello");  
	        builder.append("java wit string builder");  
	        System.out.println(builder);  
	        
	        
	        StringBuffer buffer=new StringBuffer("hello");  
	        buffer.append("java with String buffer");  
	        System.out.println(buffer);  

		 }  
	}


