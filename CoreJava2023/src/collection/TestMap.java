package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String args[])
	  {
	    HashMap< String,Integer> hm = new HashMap< String,Integer>();
	    hm.put("a",100);
	    hm.put("b",600);
	    hm.put("c",300);
	    hm.put("d",400);

	    Set<Map.Entry<String,Integer>> st = hm.entrySet();  //returns Set view
	    for(Map.Entry<String,Integer> me:st)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }
	    
	    System.out.println(" Display Data using treemap");
	    //TreeSet - Sort s the elements
	    TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
	    tm.put("a",100);
	    tm.put("c",200);
	    tm.put("b",300);
	    tm.put("d",400);

	    Set<Map.Entry<String,Integer>> st1 = tm.entrySet();
	    for(Map.Entry<String,Integer> me:st1)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }
	    
	    //LinkedHaspMap
	    
	    System.out.println(" Display Data using LinkedHashMap - Maintains insertion order with Linked list");
	    LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
	    lm.put("a",100);
	    lm.put("b",200);
	    lm.put("c",300);
	    lm.put("d",400);

	    Set<Map.Entry<String,Integer>> s = tm.entrySet();
	    for(Map.Entry<String,Integer> me:s)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }
	  }
}
