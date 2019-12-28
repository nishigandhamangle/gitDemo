import java.util.Scanner;

public class Mutator {

	int r;
	private double a,c;
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		r=sc.nextInt();
	}
	public void area()
	{
		a=3.14*r*r;
		System.out.println("area="+a);
	}
	public void circumference()
	{
		c=2*3.14*r*r;
		System.out.println("cercumference="+c);
		
	}

	
}
