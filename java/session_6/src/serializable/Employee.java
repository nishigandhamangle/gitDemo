package serializable;

import java.io.Serializable;

public class Employee implements Serializable{
transient public int empid;
public String empNm;
public Employee(int empid, String empNm) {
	super();
	this.empid = empid;
	this.empNm = empNm;
}

@Override
public String toString() {
	return "Employee [empNm=" + empNm + "]";
}

}
