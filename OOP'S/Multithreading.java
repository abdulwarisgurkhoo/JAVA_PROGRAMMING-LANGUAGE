//********************************Multi-threading.java************************************//
import java.util.*;
import java.lang.*;

//new thread using class
class pencil extends Thread
{
    @Override
    public void run()
    {
    for(int i=0;i<=1000;i++)
    {
        System.out.println(Thread.currentThread().getName());
    }
}
}
class pen extends Thread
{
   
    @Override
    public void run()
    {
        for(int i=0;i<=1000;i++)
    {
        System.out.println(Thread.currentThread().getName());
    }
   
    }
}
//main class
public class Multithreading {
    public static void main(String[] args)
     {

        pencil p1=new pencil();
        pen pen2=new pen ();
        p1.start();
        pen2.start();
        
      
          
    }
}
