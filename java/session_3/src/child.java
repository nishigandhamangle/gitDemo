
public class child extends parent {

	public child()
	{
		//super(10);
		super();
		System.out.println("child default");
	}
	public child(int i)
	{
		super();
		System.out.println("child class parameterise");
	}
	public static void main(String[] args) {
		
		//child c=new child();//parent class defaul child default

		//child c=new child(10); //parent class default child class parameterise
		parent p=new child();   //parent class default  child default
		//parent p1=new child(10);  //parent class default  child class parameterise
		//child c1=new parent();  //error not allowed
	}
}
