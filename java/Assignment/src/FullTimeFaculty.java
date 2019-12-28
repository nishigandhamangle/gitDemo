import java.util.Scanner;

public class FullTimeFaculty extends Faculty{

double basic, allowance;

//public FullTimeFaculty(int facultyid,double basic,double allowance) {
//	super(facultyid);
//	this.basic = basic;
//	this.allowance = allowance;
//}
public void accept()
{
	double salary;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter faculty id");
	int facultyid=sc.nextInt();
	System.out.println("enter basic");
	double basic=sc.nextDouble();
	System.out.println("enter allowance");
	double allowance=sc.nextDouble();
	salary=basic*allowance;
//	FullTimeFaculty p=new FullTimeFaculty(facultyid,basic,allowance);
//	return p;
}
public void display()
{
	System.out.println("facultyid="+facultyid+"\nbasic="+basic+"\nallowance="+allowance+"\nsalary="+salary);
	
}


}
