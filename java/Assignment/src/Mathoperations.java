/*32.	Create a class MathOperation containing method �multiply� to calculate multiplication of following arguments.
a.	two integers
b.	three float
c.	all elements of array
d.	one double and one integer
*/
public class Mathoperations {
public void multiply(int x,int y)
{
	int r=x*y;
	System.out.println("multiplication="+r);
}
public void multiply(float x,float y,float z)
{
	float r=x*y*z;
	System.out.println("multiplication="+r);
}
public void multiply(int arr[])
{int mul=1;

for(int i:arr)
{
	mul=mul*i;
	
}
	System.out.println("multiplication="+mul);
}
public void multiply(double x,int y)
{
	double r=x*y;
	System.out.println("multiplication="+r);
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Mathoperations m=new Mathoperations();
		int a[]= {1,2,3,4,5};
		m.multiply(11, 12);
		m.multiply(12.343, 10);
		m.multiply(10, 20, 30);
		m.multiply(a);
		
		
	}

}
