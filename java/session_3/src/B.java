
public class B extends a {

	public void m1()
	{
		System.out.println("in m1() of child");
		
	}
	public void m2()
	{
		System.out.println("in m1");
	}
	public static void main(String[] args) {
		a a1=new B();
		a1.m1();
		if(a1 instanceof B)
			((B)a1).m2();
	}
}
