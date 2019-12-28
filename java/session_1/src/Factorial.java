
public class Factorial {
	
public void  fact(int n)
{
	if(n==1)
		System.out.println("the factorial is 0");
	else
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial is "+fact);
	}
	
}

public static void main(String args[])
{
	Factorial f = new Factorial();
	f.fact(1);
}

}

