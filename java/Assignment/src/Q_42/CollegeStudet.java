package Q_42;
/*Create another class CollegeStudent inherits  Student class. Add a new member semester to it. 
Create default and parameterized constructors. Also override show() method.*/
public class CollegeStudet extends Student{

	int semester;
	
	CollegeStudet()
	{
		super();
		semester=0;
	}
	
	CollegeStudet(int r, double p,int sem) {
		super(r, p);
		semester=sem;

	}
	public void show()
	{
		System.out.println("rollNo:"+rollno+"\n percentage:"+percentage+"\nsemester:"+semester);
	}
	public void check()
	{
		System.out.println("Student from College Student");
	}



}
