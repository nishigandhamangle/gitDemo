/*Create a class Voter(voterId, name, age) with parameterized constructor. 
 *  The parameterized constructor should throw a checked exception if age is less than 18.
 *  The message of exception is “invalid age for voter ”*/
public class Voter extends Exception{
int vid;
String name;
int age;
public Voter(int vid, String name, int age) {
	super();
	this.vid = vid;
	this.name = name;
	this.age = age;
}

public Voter() {
	// TODO Auto-generated constructor stub
}

public void isValid(Voter a) 
{
	if(a.age<18)
	{
		try {
			throw new Voter();
		} catch (Voter e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) throws Voter {
	Voter v=new Voter(1,"nishi",16);
	Voter v1=new Voter();
	v1.isValid(v);
	
}
}
