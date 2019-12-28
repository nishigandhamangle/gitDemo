import java.util.Scanner;

public class GEo {
public static void main(String[] args) {
	
	shape s[]=new shape[2];
	Scanner s1=new Scanner(System.in);
	System.out.println("enter radius of circle");
	int r=s1.nextInt();
	s[0]=new circle(r);
	s[0].area();
	System.out.println("enter l and b of rectangle");
	int l=s1.nextInt();
	int b=s1.nextInt();
	s[1]=new Rectangle(l,b);
	s[1].area();
	
}
}
