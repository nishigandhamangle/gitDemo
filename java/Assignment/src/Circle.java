import java.util.Scanner;

/*30.	Create a class to calculate Area of circle with one data member to store the radius and another to store area value.
Create method members
  1. init - to input radius from user
  2. calc - to calculate area
  3. display- to display area 
*/
public class Circle {
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
