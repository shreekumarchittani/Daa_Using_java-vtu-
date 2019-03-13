import java.util.Scanner;
public class Stack
{
  int max=20;
  int s[]=new int[max];//array of objects
  int top=-1;
  void push(int ele)
  {
    if(top>=max-1)
     System.out.println("stack overflow");
    else
     s[++top]=ele;
  }
  int pop()
  {
    int z=0;
    if(top==-1)
     System.out.println("stack underflow");
    else
      z=s[top--];
    return z;//you can also write return(s[top--])
  }
  void display()
  {
    if(top==-1)
     System.out.println("stack empty");

    else
    {
      for(int i=top;i>-1;i--)//printing from top to 0
        System.out.println(s[i]+" ");
    }
  }
  public static void main(String args[])
  {
    int q=1;
    Stack m = new Stack();//m is objct of class stack
    System.out.println("program to perform stack operations");
    Scanner sc=new Scanner(System.in);
    while(q!=0)//to get infinite loop
    {
      System.out.println("enter 1. push 2.pop 3. display 4. Exit ");
      System.out.println("enter your choice");
      int ch=sc.nextInt();
      switch(ch)
      {
      case 1:
        System.out.println("enter the element to be pushed");
        int ele=sc.nextInt();
        m.push(ele);
        break;
      case 2:
        int p;
        p=m.pop();
        if(p!=0)//p is 0 means pop function returned zero.if zis 0 then stack empty
        {
          System.out.println("the popped element is " +p);
          m.display();
        }
        break;
      case 3:
        System.out.println("elements in the stack are");
        m.display();
        break;
      case 4:	q=0;//Terminating the while loop
      }
    }
  }
}
