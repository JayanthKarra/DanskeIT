package multithreading;



//Main Class 
class TestMultithreadRunnable
{ 
 public static void main(String[] args) 
 { 
     int n = 8; // Number of threads 
     for (int i=0; i<n; i++) 
     {   Thread object = new Thread(new MultiThreadingRunnable()); //When you create thread by implementing Runnable interface
     // MultithreadingDemoThread object = new MultithreadingDemoThread();  //Using Thread extends
         object.start();  //1. To start a newly created thread.
         				  // 2. The thread moves from New state to the Runnable state.
         				  // 3. When the thread gets a chance to execute, its target run() method will run.


     } 
     
 
     
 } 
} 