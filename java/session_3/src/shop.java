import java.util.Scanner;

public class shop {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter no. of items");
	int no=s.nextInt();
	Item item[]=new Item[no];
	String iname;
	double p;
	int st;
	for(int i=0;i<item.length;i++)
	{
		System.out.println("Enter item name");
		iname=s.next();
		System.out.println("enter price");
		p=s.nextDouble();
		System.out.println("enter stock");
		st=s.nextInt();
		item[i]=new Item(iname,p,st);
		System.out.println(item[i]);
		item[i].calAmount();
	}
	Item.billAmount();
}
}
