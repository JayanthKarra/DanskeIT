package coreJava8.functional;
@FunctionalInterface
public interface MyFirstFunctionalInterface 
{
    public void firstWork();
   // public void firstWork1();
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}