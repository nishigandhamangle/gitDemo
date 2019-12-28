package Q41;
import java.util.Scanner;

public class PartTimeFaculty extends Faculty{

//double hour, rate;
//
//public PartTimeFaculty(int facultyid,double hour, double rate) {
//	super(facultyid);
//	this.hour = hour;
//	this.rate = rate;
//}
//public PartTimeFaculty() {
//	
//}
//public void accept()
//{
//	double salary;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter faculty id");
//	int facultyid=sc.nextInt();
//	System.out.println("enter hour");
//	double hour=sc.nextDouble();
//	System.out.println("enetr rate");
//	double rate=sc.nextDouble();
//	salary=hour*rate;
//	PartTimeFaculty p=new PartTimeFaculty(facultyid,hour,rate);
////	return p;
//}
//public void display()
//{
//	System.out.println("facultyid="+facultyid+"\nhour="+hour+"\nrate="+rate+"\nsalary="+salary);
//	
//}
	float hour, rate;
	Scanner s=new Scanner(System.in);

	
	public PartTimeFaculty(int facultyid, float salary, float hour, float rate) {
		super(facultyid,salary);
		this.hour = hour;
		this.rate = rate;
	}
	public PartTimeFaculty() {
		salary=hour*rate;
		this.hour = 0;
		this.rate = 0;
	}
	public void accept()
	{
		System.out.println("Enter the details of FullTimeFaculty \n Facuty ID \n Basic \n Allowance");
		facultyid=s.nextInt();
		hour=s.nextFloat();
		rate=s.nextFloat();
		salary=hour*rate;
	}

	@Override
	public String toString() {
		return "PartTimeFaculty [hour=" + hour + ", rate=" + rate + ", facultyid=" + facultyid + ", salary=" + salary
				+ "]";
	}


	public static void main(String[] args) {
		

	}
}
