import java.util.Scanner;

public class PartTimeFaculty extends Faculty{

double hour, rate;

//public PartTimeFaculty(int facultyid,double hour, double rate) {
//	super(facultyid);
//	this.hour = hour;
//	this.rate = rate;
//}
public void accept()
{
	double salary;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter faculty id");
	int facultyid=sc.nextInt();
	System.out.println("enter hour");
	double hour=sc.nextDouble();
	System.out.println("enetr rate");
	double rate=sc.nextDouble();
	salary=hour*rate;
//	PartTimeFaculty p=new PartTimeFaculty(facultyid,hour,rate);
//	return p;
}
public void display()
{
	System.out.println("facultyid="+facultyid+"\nhour="+hour+"\nrate="+rate+"\nsalary="+salary);
	
}

}
