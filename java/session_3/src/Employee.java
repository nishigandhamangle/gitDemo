
public class Employee {
private int Empid;
private String name;
private Date d;
public Employee(int empid, String name, Date d) {
	
	Empid = empid;
	this.name = name;
	this.d = d;
}

@Override
public String toString() {
	return "Employee [Empid=" + Empid + ", name=" + name + ", d=" + d + "]";
}

public static void main(String[] args) {
	Employee emp = new Employee(1,"DEEPA",new Date(1,6,1996));
	
	System.out.println(emp);
}

}
