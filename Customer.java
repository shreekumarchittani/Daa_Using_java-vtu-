/*StringTokenizer is a utility class which is used in parsing a string.
If we want to divide the string we use this class. It has 3 constructores.
-StringTokenizer(String str)
Typical type of string divider.
-StringTokenizer(String str,String delimiters)
In this a string and a delimiter is passed. The string will divided at the
delimiter. ex: if string is my name is abc and delimiter is " ", then o/p is
my
Name
is
abc
-StringTokenizer(String str,String delimiter,boolean delimAsToken)
in this version if the delimAsToken is true then it will return delimiter also
a token.
ex: String : my : name is : abc
    delimiter: ":"
    delimAsToken: true
o/p: my

    Name
    is

    abc
    After name there is no newline because in the main string after name there
    is no ":"*/
import java.util.*;
class Customer
{
   String Name,Dob;

  void getdata()
  {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the customer Name:");
    Name = ob.next();
    System.out.println("Enter Date of Birth in dd/mm/yyyyformat");
    Dob = ob.next();
  }//end of getdata

   void display()
   {
     //Constructor for StrinTokenizer class with string & delimeter
     StringTokenizer st = new StringTokenizer(Dob,"/");
     System.out.println("###################################");
     System.out.println("The details of the Customer in Prescribed format:");

     System.out.print("<Name,DD,MM,YYYY>"+Name);
     while(st.hasMoreTokens())//checks if there is more tokens available
     { //returns the next token from the StringTokenizer object
     System.out.print(","+st.nextToken());}//end of while
     System.out.println("\n################################");
   }//end of display

   public static void main(String args[])
   {
     Customer cm=new Customer();//constructor for SCustomer
     cm.getdata();
     cm.display();
  }//end of main
}//end of class
