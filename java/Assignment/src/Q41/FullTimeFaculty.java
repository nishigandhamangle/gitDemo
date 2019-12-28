package Q41;
import java.util.Scanner;

public class FullTimeFaculty extends Faculty{

//double basic, allowance;
//
//public FullTimeFaculty(int facultyid,double basic,double allowance) {
//	super(facultyid);
//	this.basic = basic;
//	this.allowance = allowance;
//}
//public FullTimeFaculty() {
//	super();
//}
//public void accept()
//{
//	double salary;
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter faculty id");
//	int facultyid=sc.nextInt();
//	System.out.println("enter basic");
//	double basic=sc.nextDouble();
//	System.out.println("enter allowance");
//	double allowance=sc.nextDouble();
//	salary=basic*allowance;
//	FullTimeFaculty p=new FullTimeFaculty(facultyid,basic,allowance);
////	return p;
//}
//public void display()
//{
//	System.out.println("facultyid="+facultyid+"\nbasic="+basic+"\nallowance="+allowance+"\nsalary="+salary);
//	
//}

	
	float basic, allowance;
	Scanner s=new Scanner(System.in);
	
	public FullTimeFaculty(int facultyid, float salary, float basic, float allowance) {
		super(facultyid,salary);
		this.basic = basic;
		this.allowance = allowance;
	}
	public FullTimeFaculty() {
		// TODO Auto-generated constructor stub
	}
	public void accept()
	{
		System.out.println("Enter the details of FullTimeFaculty \n Facuty ID \n Basic \n Allowance");
		facultyid=s.nextInt();
		
		basic=s.nextFloat();
		allowance=s.nextFloat();
		salary=basic+allowance;
	}
	@Override
	public String toString() {
		return "FullTimeFaculty [basic=" + basic + ", allowance=" + allowance + ", facultyid=" + facultyid + ", salary="
				+ salary + "]";
	}

	public static void main(String[] args) {
		

	}

}
