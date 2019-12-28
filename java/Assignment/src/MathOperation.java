import java.util.Scanner;

/*31.	Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.
Create method members
●	init - to input X and Y from user
●	add - to add X and Y and store in R
●	multiply - to multiply X and Y and store in R
●	power - to calculate X Y and store in R
●	display- to display Result R
*/
public class MathOperation {
	public double add(double a,double b)
	{
		return (a+b);
	}
	public double multiply(double a,double b)
	{
		return a*b;
	}
	public double power(double a,double b)
	{
		return Math.pow(a,b);
	}
	public void display(double r)
	{
		System.out.println(r);
	}
	
	
	public static void main(String[] args) {
		double x,y,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		x=sc.nextDouble();
		y=sc.nextDouble();
		MathOperation m=new MathOperation();
		r=m.add(x, y);
		m.display(r);
		r=m.multiply(x,y);
		m.display(r);
		r=m.power(x, y);
		m.display(r);
		
		
	}

}
