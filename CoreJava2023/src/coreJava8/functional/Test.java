package coreJava8.functional;



public class Test implements MyFirstFunctionalInterface {

	@Override
	public void firstWork() {
	System.out.println(" First Interface");		
	}
	public static void main(String[] args) {  
	        Test t1= new Test();
	        t1.firstWork();
	    }  
}
