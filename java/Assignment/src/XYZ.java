import java.util.Scanner;

public class XYZ extends TwoBHK{
	public double amt(TwoBHK[] t)
	{ double sum=0;
	for(int i=0;i<3;i++)
	{
		sum= sum+t[i].price;
		
	}
	return sum;
	}
public static void main(String[] args) {
	//TwoBHK t=new TwoBHK(12,2345,23000,4678);
	XYZ x = new XYZ();
	TwoBHK t[]=new TwoBHK[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		System.out.println("enter hallArea");
		double hallArea1=sc.nextDouble();
		System.out.println("enter price");
		double price1=sc.nextDouble();
		System.out.println("enter rootArea");
		double roomArea1=sc.nextDouble();
		System.out.println("enter room2Area");
		double room2Area1=sc.nextDouble();
		t[i]=new TwoBHK(roomArea1,hallArea1,price1,room2Area1);
	}
	for(int i=0;i<3;i++)
	{
	t[i].show();
	}
	
	System.out.println("amount:"+x.amt(t));
	
}
}
