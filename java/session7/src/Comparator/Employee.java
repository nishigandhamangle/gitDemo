package Comparator;

import java.util.TreeSet;



public class Employee implements Comparable{
	int empID;
	String empNM;
	
	

	
	public Employee( String empNM,int empID) {
		super();
		this.empID = empID;
		this.empNM = empNM;
	}

	public static void main(String[] args) {
		Employee e1=new Employee("nilesh",100);
		Employee e2=new Employee("nishi",200);
		Employee e3=new Employee("deepa",300);
		Employee e4=new Employee("akshya",600);
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		System.out.println(t1);
		TreeSet t2=new TreeSet(new MyComparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		System.out.println(t2);
		
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empNM=" + empNM + "]";
	}

	@Override
	public int compareTo(Object o) 
	{
		int eid1=this.empID;
		int eid2=((Employee)o).empID;
		if(eid1>eid2)
		{
			return -1;
		}
		else if(eid1<eid2)
		{
			return 1;
		}
		return 0;
	}

}
