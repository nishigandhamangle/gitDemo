import java.util.Scanner;

public class Pre_post {

	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two no.");
		a = s.nextInt();
		b = s.nextInt();
		c= a++;
		System.out.println(c+" and "+a);
		c=++b;
		System.out.println(c+" and "+b);
	}
}
