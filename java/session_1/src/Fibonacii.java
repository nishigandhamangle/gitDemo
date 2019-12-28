
public class Fibonacii {
	
public static void main(String[] args)
{
	int a=0;
	int b=1,c,i;
	System.out.println("Following is the fibonacii series:");
	System.out.print(a+", "+b+", ");
	for(i=2;i<=10;i++)
	{
		c=a+b;
		System.out.print(c+", ");
		a=b;
		b=c;
	}
	
}

}
