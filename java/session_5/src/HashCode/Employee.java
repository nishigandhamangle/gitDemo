package HashCode;

import Interface2.immutable;

public class Employee  extends Object{
int empID;
String EmpNm;
public Employee(int empID, String empNm) {
	super();
	this.empID = empID;
	EmpNm = empNm;
}
@Override
public String toString() {
	return "Employee [empID=" + empID + ", EmpNm=" + EmpNm + "]";
}
public boolean equals(Object o)
{
	Employee e = (Employee)o;
	if((this.empID==e.empID) && ((this.EmpNm).equals(e.EmpNm)))
	{
		return true;
	}
	else
		return false;
	
}

public int hashCode()
{
	return empID+1;
}

public static void main(String[] args) {
	
	Employee i=new Employee(1,"111");
	Employee i1=new Employee(1,"111");
	
	if(i.equals(i1))
	{
		System.out.println("Are equal");
		
	}
	else
		System.out.println("Not Equals");
	System.out.println("e1:"+i.hashCode());
	System.out.println("e1:"+i1.hashCode());
}
}
