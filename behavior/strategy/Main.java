package com.ds.behavior.strategy;

public class Main {
	public static void main(String[] args) {
		 
	    // Creating social Media Connect Object for connecting with friend by
	    // any social media strategy.
	    SocialMediaContext context = new SocialMediaContext();
	 
	    // Setting Facebook strategy.
	    context.setSocialmediaStrategy(new FacebookStrategy());
	    context.connect("Alex");
	 
	    System.out.println("====================");
	 
	    // Setting Twitter strategy.
	    context.setSocialmediaStrategy(new TwitterStrategy());
	    context.connect("Alex");
	 
	    System.out.println("====================");
	 
	    // Setting GooglePlus strategy.
	    context.setSocialmediaStrategy(new GooglePlusStrategy());
	    context.connect("Lokesh");
	 
	    System.out.println("====================");
	
	  }
}
