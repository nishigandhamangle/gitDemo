
public class teacher extends Employee1 {
	String branch;
	int no_of_exp;
	
	public teacher(int empID, String empNm, String branch, int no_of_exp) {
		super(empID, empNm);
		this.branch = branch;
		this.no_of_exp = no_of_exp;
	}
	public void display()
	{
		super.display();
		System.out.println(branch+""+no_of_exp);
		
	}
	public static void main(String[] args) {
		
		teacher t=new teacher(2,"abc","IT",5);
		t.display();
	}
	}
