import java.util.*;
import java.lang.*;
class Square implements Runnable
{
  public int x;
  Square(int x)
  {
   this.x=x;
  }
  public void run()
  {
   System.out.println("Second Thread ie., Square of"+x+"is="+x*x);
  }//end of run
}//end of Square
class Cube implements Runnable
{
  public int x;
  Cube(int x)
  {
   this.x=x;
  }
  public void run()
  {
   System.out.println("Third Thread ie., Cube of"+x+"is="+x*x*x);
  }//end of run
}//end of cube
class First extends Thread
{
  public void run()
  {
    int num=0;
    Random ra=new Random();
    try
    {
      for(int i=0;i<5;i++)
      {
        num=ra.nextInt(100);// Generate random integers in range 0 to 99
        System.out.println("Main Thread starts and Generated Number is"+num);
        Thread t2=new Thread(new Square(num));
        t2.start();
        Thread t3=new Thread(new Cube(num));
        t3.start();
        Thread.sleep(1000);
        System.out.println("_______________________________________");
      }//1
    }
    catch(Exception e)//2 end of try
    {
    System.out.println(e.getMessage());
    }//end of catch
  }//end of run
}//end of First
public class MultiThread
{
  public static void main(String args[])
  {
    First f1=new First(); 
    Thread t1=new Thread(f1);
    t1.start();
  }
}
