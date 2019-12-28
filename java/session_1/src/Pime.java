import java.util.Scanner;

public class Pime {
	public static void main(String[] args)
	{
		int j,i,c=0;
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		for(j=1;j<=100;j++)
		{
			if(j==1 || j==0)
				continue;
			c=0;
		for(i=2;i<=j/2;i++)
		{
			
			if(j%i==0)
			{
				c++;
				break;
			}
			
		}
		if(c==0)
			System.out.print(j+" ");
		}
	}

}
