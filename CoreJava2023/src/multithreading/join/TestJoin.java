package multithreading.join;

public class TestJoin extends Thread {
	public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(Thread.currentThread().getName()+ "-" + i );  
		  }  
		 }  
		public static void main(String args[]){  
		 TestJoin t1=new TestJoin();  
		 TestJoin t2=new TestJoin();  
		 TestJoin t3=new TestJoin();  
		 t1.setName("Thread - 1");
		 t2.setName("Thread - 2");
		 t3.setName("Thread - 3");
		 t1.start();  
		 try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();  
		 t3.start();  
		 } 
}
