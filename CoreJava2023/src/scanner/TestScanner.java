package scanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String args[]){  
		
		     Scanner sc=new Scanner(System.in);
		 
		     // Fill the code here
		     String[][] s= new String[3][3];
		     int min=-1;
		     for(int i=0;i<3;i++)
		     {	    	 s[i]=  sc.nextLine().split(",");
		    	 s[i][1]=String.valueOf(Integer.parseInt(s[i][1])*Integer.parseInt(s[i][2])/100);
		    	/* if(i==0)
		    		 min=Integer.parseInt(s[1][1]);
		    	 else if(Integer.parseInt(s[i][1]) < min)
		    		 min=Integer.parseInt(s[i][1]); */		    		
		    	 System.out.println("Discount on "+s[i][0]+" is"+ s[i][1] ); 		    				 
		     }
			   /*  System.out.println(s[i][0]);
			     System.out.println(s[i][1]);
			     System.out.println(s[i][2]);*/
		     }
		     //int n = sc.nextInt();
		     //String[] str = new String[n];
		 
		    // String[] name = new String[n];
		     //int[] price = new int[n];
		     //int[] disc = new int[n];
		     //int[] cost = new int[n];
		     //for(int i=0;i<n;i++){
		         ///str=sc.next().split(",");
		       //  name[i] = str[0];/*
		       //  price[i] = Integer.parseInt(str[1]);
		         //disc[i] = Integer.parseInt(str[2]); */
		         //cost[i] =  (Integer.parseInt(str[1]) * Integer.parseInt(str[2])) / 100;
		     //}
		     
		     
		     
		     /*for(int i=0;i<n;i++){
		         cost[i] = (disc[i]*price[i])/100;
		     }
		     //int min = cost[0];
		     
		     for(int i=1;i<n;i++){
		         if(cost[i]<min)
		         {
		       //      min = cost[i];
		         }
		     }
		     for(int i=0;i<n;i++) {
		         if(cost[i] == min){
		         //    System.out.println(name[i]);
		         }
		     }
		 
		/* Scanner sc = new Scanner(System.in);
		 int a[] =new int [5];
		 String s[]= sc.nextLine().split(",");
		 for(int i =0 ;i < s.length;i++)
		 {    a[i]= Integer.parseInt(s[i]);
		 System.out.println(a[i]);}*/
		 
		   /* String employeeID = "";
		    double hrsWorked;
		    double wageRate;
		    int deductions;

		    System.out.println("Hello Employee! Please input your employee ID, hours worked per week, hourly rate, and deductions: ");
		    employeeID = keyboard.nextLine();
		    hrsWorked = keyboard.nextFloat();
		    wageRate = keyboard.nextFloat();
		    deductions = keyboard.nextInt();
		    
		    System.out.println(  employeeID +"   "+   hrsWorked+"  "+ wageRate+  "    "+     deductions );
		    }*/
		     
		     /*
		      * Scanner sc=new Scanner(System.in);
		 
		     // Fill the code here
		     
		     int n = sc.nextInt();
		     String[] str = new String[n];;
		 
		     String[] name = new String[n];
		     int[] price = new int[n];
		     int[] disc = new int[n];
		     int[] cost = new int[n];
		     for(int i=0;i<n;i++){
		         str=sc.next().split(",");
		         name[i] = str[0];/*
		         price[i] = Integer.parseInt(str[1]);
		         disc[i] = Integer.parseInt(str[2]); 
		         cost[i] =  (Integer.parseInt(str[1]) * Integer.parseInt(str[2])) / 100;
		     }
		      */

}



