package admission.com;


public class Student
{
   
  private int roll,phy,chem,math;
  private String name;
  Student()
  {
	   
  }
  Student(int nroll,String nname,int nphy,int nchem,int nmath)
  {
   roll=nroll;
   name=nname;
   phy=nphy;
   chem=nchem;
   math=nmath;
	   
  }
  Student(int nroll,String nname)
  {
	  roll=nroll;
	  name=nname;
  }
  public void setRoll(int a)
  {
	  roll=a;
  }
  public int getRoll()
  {
	 
	  return roll;
  }
  public void setPhy(int a)
  {
	  phy=a;
  }
  public int getPhy()
  {
	 
	  return phy;
  }
  public void setChem(int a)
  {
	  chem=a;
  }
  public int getChem()
  {
	 
	  return chem;
  }
  public void setMath(int a)
  {
	  math=a;
  }
  public int getMath()
  {
	 
	  return math;
  }
  public void setName(String a)
  {
	  name=a;
  }
  public String getName()
  {
	 
	  return name;
  }
  
}
