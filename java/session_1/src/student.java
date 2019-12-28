
public class student {
	int rol;
	String name;
	float marks;
	public student()
	{
		System.out.println("default constructor");
		rol=1;
		name="xyz";
		marks=98;
	}
	public student(int r,String n,float m)
	{this();
		rol=r;
		name=n;
		marks=m;
		
	}

	@Override
	public String toString() {
		return "student [rol=" + rol + ", name=" + name + ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s=new student();
student s1=new student(11,"nishi",90);
System.out.println(s);
System.out.println(s1);
	}

}
