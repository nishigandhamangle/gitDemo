package Q45;
/*a.	Create class Employee(empId,name,salary) and implement Taxable 
 * to calculate
 incomeTax on yearly salary.*/
public class Employee implements Taxable{
int empID;
String name;
double salary;
@Override
public double calcTax() {
	// TODO Auto-generated method stub
	double tax=incomeTax*salary;
	
	return tax;
	
}
public Employee(int empID, String name, double salary) {
	super();
	this.empID = empID;
	this.name = name;
	this.salary = salary;
}

}
