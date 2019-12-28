/*34.	Create and use copy constructor for above problem.*/
public class PersoneCopy {
	String name;
	int age;
	public PersoneCopy(String n) {
	    name=n;
		age=18;
		
	}
	public PersoneCopy(PersoneCopy p)
	{
		name=p.name;
		age=p.age;
	}
	public void display()
	{
		System.out.println("person name is "+name+" and age is "+age);
	}
	public static void main(String[] args) {
		PersoneCopy p=new PersoneCopy("nishi");
		p.display();
		PersoneCopy p1=new PersoneCopy(p);
		p1.display();
	}
}
