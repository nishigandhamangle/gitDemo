package Q_44;
/*Create a class  Factorial using abstract class Processor  to calculate and 
print factorial of a number by overriding the process method.*/
public class Factorial extends Processor{

	public Factorial(int i) {
		// TODO Auto-generated constructor stub
		data=i;
	}

	@Override
	int process() {
		
		int n=data;
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

	

}
