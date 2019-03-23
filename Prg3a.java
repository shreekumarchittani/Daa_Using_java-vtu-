import java.util.*;
class Prg3a
{
   public static void main(String []args)
     {
     int a,b,result;
     Scanner inp = new Scanner(System.in);
     System.out.println("Input two Integers");
     a = inp.nextInt();
     b = inp.nextInt();
     try
     {
       result=a/b;//If error is there it wont go to the next printline.
       System.out.println("Result ="+result);
     }//catch block
     catch(ArithmeticException e)
     {
       System.out.println("Exception caught: Division by zero" +e);
     }//end of catch
   }//end of main
}//end of class
