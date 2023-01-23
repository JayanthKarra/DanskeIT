package multithreading.sleep;

public class TestSleep extends Thread{
	 public void run(){  //Thread moves to running from runnable state
		  for(int i=1;i<5;i++){  
		    try{
		    	Thread.sleep(500); //Moves from running to Waiting
		    	}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i+ " from  "+ Thread.currentThread().getName());  
		  }  
		 }  
		 public static void main(String args[]){  
		  TestSleep t1=new TestSleep();   //State New 
		  TestSleep t2=new TestSleep();  //State new
		   t1.setName("one thread");
		   t2.setName("Second Thread");
		  t1.start();  //Runnable state
		  t2.start();  //Runnable state
		 }  
}
