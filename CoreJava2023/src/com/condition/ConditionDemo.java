package com.condition;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
System.out.println("Enter the ages of John, Smith, and Federer: ");
        
        // Taking input from the console
         
        int John, Smith, Federer;
        Scanner in = new Scanner(System.in);
        John = in.nextInt();
        Smith = in.nextInt();
        Federer = in.nextInt();
         
        // conditional check for age criteria
         
        if((John > Smith)&& (John> Federer)){
            System.out.println("John is oldest");
        }
         
        else if((Smith > John)&& (Smith> Federer)){
            System.out.println("Smith is oldest");
        }
         
        else if((Federer > John)&& (Federer> Smith)){
            System.out.println("Federer is oldest");
        }
        else{
            System.out.println("They are of same age");
        }

	}

}
