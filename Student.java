import java.util.Scanner;
class Student
{
  long Pno;//declaration of longint
  String USN, Name,Branch;
  Scanner ob=new Scanner(System.in);//object of Scanner.Scanner is for read purpose
  void read()
  {
    System.out.println("Enter the student details");
    System.out.println("Enter USN");
    USN = ob.next();
    System.out.println("Enter Name");
    Name = ob.next();
    System.out.println("Enter Branch");
    Branch = ob.next();
    System.out.println("Enter Phone number");
    Pno = ob.nextLong();//since pno is of type long
  }
  void display()
  {
    System.out.println(USN+"\t"+Name+"\t\t"+Branch+"\t\t"+Pno);
  }
  public static void main(String args[])
  {
    int size,i;
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the no of student information\n");
    size=ob.nextInt();
    Student s[]=new Student[size];//Array of objects.
    for(i=0;i<size;i++)
    {
      s[i]=new Student();
      s[i].read();
    }
    System.out.println("************************************************************");
    System.out.println("USN\t\t Name\t\t Branch\t\t Phoneno");
    System.out.println("************************************************************");
    for(i=0;i<size;i++)
    {
      s[i].display();
    }
    System.out.println("************************************************************");
  }
}
