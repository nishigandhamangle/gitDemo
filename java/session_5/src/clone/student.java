package clone;

public class student implements Cloneable{

	int rn;
	String nm;
	public student(int rn, String nm) {
		super();
		this.rn = rn;
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "student [rn=" + rn + ", nm=" + nm + "]";
	}
protected Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
public static void main(String[] args) throws CloneNotSupportedException{
	
	student s=new student(1,"rahul");
	System.out.println(s);
	student s1=(student)s.clone();
	System.out.println(s1);
	
}
}
