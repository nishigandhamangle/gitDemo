/*35.	Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
a.	Only parameterized constructor;
b.	totalSalary always represent total of all the salaries of all employees created.
c.	empNo should be auto incremented. 
d.	display total employees and totalSalary using class method.
*/
public class Employee {
static int empNo=0;
double salary;
static double totalSalary=0;
public Employee(double sa)
{
	empNo++;
	salary=sa;
	totalSalary+=sa;
}

@Override
public String toString() {
	return "Employee [salary=" + salary + "EmployeeID " +empNo+"]";
}

public static void all()
{
	System.out.println("Total Employees:"+empNo+"\nTotal Salary"+totalSalary);
}
public static void main(String[] args) {
	Employee e = new Employee(10000);
	Employee e1 = new Employee(10000);
	Employee e2 = new Employee(10000);
	Employee e3 = new Employee(10000);
	Employee e4= new Employee(10000);
	//System.out.println(e);
	//System.out.println(e1);
	Employee.all();
}


}
