package Q_42;
/*Create another class SchoolStudent inherits  Student class. Add a new member classname
(eg 12th ,10th  etc.)  to it. Create default and parameterized constructors. Also override show() method.
*/
public class SchoolStudent extends Student {
	
String classname;

public SchoolStudent(int r, double p, String classname) {
	super(r, p);
	this.classname = classname;
}
public SchoolStudent() {
}
public void check()
{
	System.out.println("Student from School Student");
}
public void show()
{
	System.out.println("\nrollNo:"+rollno+"\n percentage:"+percentage+"\nclassname:"+classname);
}
}
