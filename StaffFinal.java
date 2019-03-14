import java.util.*;//util.*means import all util classes
 class Staff
{
  int staffid;
  String Name,Phone;
  double salary;
    Staff(int id,String n,String p,double sa)//constructor
   {
    staffid = id;
    Name = n;
    Phone = p;
    salary = sa;
   }
   public void display()
   {
     System.out.print(staffid+"\t"+Name+"\t"+Phone+"\t"+salary);
   }
}//end of class Staff
class Teaching extends Staff
{
  String Domain,publication;
   Teaching(int id,String n,String p,double sa,String doa,String pu)
   {
    super(id,n,p,sa);//constructor of Staff is called
    Domain = doa;
    publication = pu;
   }
  public void display()
  {
    super.display();//Staff's method is called
    System.out.println("\t"+Domain+"\t"+publication);
  }
}//end of class teaching
class Technical extends Staff
{
  String Skills;
   Technical(int id,String n,String p,double sa,String sk)
  {
    super(id,n,p,sa);//constructor of Staff called
    Skills = sk;
  }
  public void display()
  {
    super.display();
    System.out.println("\t"+Skills);
  }
}//end of class technical
class Contract extends Staff
{
  int period;
   Contract(int id,String n,String p,double sa,int pe)
  {
    super(id,n,p,sa);
    period = pe;
  }
  public void display()
  {
    super.display();
    System.out.println("\t"+period);
  }
}//end of class Contract
public class StaffFinal//main function is in this class.So do this as filename
{
    public static void main(String []args)
   {
      Teaching t1=new Teaching(111,"Suresh","1234567891",50000.00,"cse","IEEE ");
      Teaching t2=new Teaching(112,"Harish","2356347185",50000.00,"Ise","IEEE ");
      Teaching t3=new Teaching(113,"Roy","9824531672",50000.00,"cse","IEEE ");
      System.out.println("_________________________________________________________");
      System.out.println("Details of Teaching staff:=>");
      System.out.println("StaffId\tName\tPhone\t\tSalary\tDommain\tPublication");
      t1.display();
      t2.display();
      t3.display();
      Technical te1=new Technical(222,"Manoj","231345278",30000.00,"java");
      Technical te2=new Technical(223,"Priya","9825637123",30000.00,"Dotnet");
      Technical te3=new Technical(224,"Ria","7812231450",30000.00,"C++");
      System.out.println("********************************************************");
      System.out.println("Details of Techinical staff:=>");
      System.out.println("StaffId\tName\tPhone\t\tSalary\tSkill");
      te1.display();
      te2.display();
      te3.display();
      Contract ct1=new Contract(333,"sujay","1234446548",20000.00,30);
      Contract ct2=new Contract(334,"Ravi","9871234441",20000.00,36);
      Contract ct3=new Contract(335,"Reshma","9876543298",20000.00,40);
      System.out.println("#########################################################");
      System.out.println("Details of Contract staff:=>");
      System.out.println("StaffId\tName\tPhone\t\tSalary\tperiod");
      ct1.display();
      ct2.display();
      ct3.display();
      System.out.println("_________________________________________________________");
  }
}
