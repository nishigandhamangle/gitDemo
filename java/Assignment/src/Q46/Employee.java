package Q46;
/*46.	Explain the importance of toString() and equals() 
 * method of the Object class and override them on class Employee(empId,name,salary). 
a.	Create class for main method(say XYZ),and accept five employees information and store in an array.
Also ensure if entered empId already exist or not (use equals method). 
b.	Display all employee info using toString method;
*/
import java.util.Scanner;

public class Employee {
	int empId;
	String name;
	float salary;
	Scanner s=new Scanner(System.in);
	
	public Employee() {
	
	}
	public void accept()
	{
		System.out.println("Enter the Employee details:\n EmpNo \n Name \n Salary");
		empId= s.nextInt();
		name=s.next();
		salary=s.nextFloat();
	}

	@Override
	public boolean equals(Object obj) {
		
		Employee ee = (Employee) obj;
		if (empId != ee.empId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	public void display()
	{
		System.out.println("Employee details are:");
		System.out.println("EmpNo     : "+empId);
		System.out.println("Name      : "+name);
		System.out.println("Salary    : "+salary);
		
	}
	


}
