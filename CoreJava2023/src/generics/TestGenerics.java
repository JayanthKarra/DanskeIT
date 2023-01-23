package generics;

import java.util.ArrayList;

public class TestGenerics {
	 public static void main(String[] args) {
		 //Java5 Features
		 
		 //Without Generics	
		 ArrayList list = new ArrayList();
	 
   list.add("JAVA"); //string
    list.add(123); //Integer

    /* for (Object object : list)
    {      //Below statement throws ClassCastException at run time
       String str = (String) object;       //Type casting
       System.out.println(str);
    }*/
    
    //With Generics-----------------------------------------------------
    ArrayList<String> list2 = new ArrayList <String>();
    
    list2.add("JAVA");

    list2.add(123);       //Compile time error

    for (String str : list2)
    {
        //No type casting needed. ClasscastException Never occurs

        System.out.println(str);
    }
}
}
