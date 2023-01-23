package multithreading;


class MultiThreadingRunnable implements Runnable 
{   public void run() 
    { 
        try
        {        // Displaying the thread that is running 
            System.out.println ("Thread " +         Thread.currentThread().getId() +  " is running using runnable interface"); 
  
        } 
        catch (Exception e) 
        {        System.out.println ("Exception is caught");       } 
    } 
} 
  