package admission.com;
import java.util.Scanner;
import java.lang.Exception;

public class Admission {
	public int calPercentage(Student st)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Out of marks:");
		  int outof=sc.nextInt();
		  int total=st.getPhy()+st.getChem()+st.getMath();
			int per=(total*100)/(3*outof);
			System.out.println("Percentage="+per+"%");
			sc.close();
	        return per;
	   }

	public void showStudentDetails(Student st)
	{
		System.out.println(st.getRoll());
		System.out.println(st.getPhy());
		System.out.println(st.getChem());
		System.out.println(st.getMath());
		System.out.println(st.getName());	
	}

	public static void main(String[] args) 
	{
		
		Admission a=new Admission();
       Student s=new Student();
       Student s1=new Student(1,"Shubham",75,70,85);
       Student s2=new Student(2,"Pooja");
		a.showStudentDetails(s);
		a.showStudentDetails(s1);
		a.calPercentage(s1);
		a.showStudentDetails(s2); 
		s.setRoll(s1.getRoll());
		s.setPhy(s1.getPhy());
		s.setChem(s1.getChem());
		s.setMath(s1.getMath());
		s.setName(s1.getName());
		a.showStudentDetails(s);
}
}
