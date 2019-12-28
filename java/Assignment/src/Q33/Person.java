package Q33;
/*33.	Create a class Person with properties (name and age) with following features.
a.	Default  age of person should be 18;
b.	A person object can be initialized with name and age;
c.	Method to display name and age of person 
*/
public class Person {

	String name;
	int age;
	public Person(String n) {
	    name=n;
		age=18;
		
	}
	public void display()
	{
		System.out.println("person name is "+name+" and age is "+age);
	}
	public static void main(String[] args) {
		Person p=new Person("nishi");
		p.display();
	}
}
