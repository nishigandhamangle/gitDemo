package Q36;
import java.util.Scanner;

/*36.	Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
a.	Accept five product information from user and store in an array
b.	 Find Pid of product with highest price.
c.	Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products.  (amount spent on single product=price of product * quantity of product)
*/
public class Product {
int pid;
double price;
int quantity;
public Product(int pid, double price, int quantity) {
	this.pid = pid;
	this.price = price;
	this.quantity = quantity;
}
public Product() {
	// TODO Auto-generated constructor stub
}
public void display(Product p[])
{
	for(Product i:p)
	{
		System.out.println(i);
	}
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", price=" + price + ", quantity=" + quantity + "]";
}
public void highestSal(Product p[])
{int pi = 0;
double max=0;

	for(int i=0;i<3;i++)
	{
		
		if(max<p[i].price)
		{
			
			max=p[i].price;
			pi=p[i].pid;
			
		}
	}
	System.out.println("pid of heightest price product is"+pi);
}
public void spendAmount(Product p[])
{
	double sum;
	for(int i=0;i<3;i++)
	{sum=p[i].quantity*p[i].price;
	System.out.println("total amount spend by pid "+p[i].pid+" is "+sum);
		
	}
}
public static void main(String[] args) {
	Product p[]=new Product[3];
	Product a=new Product();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 5 products information");
	for(int i=0;i<3;i++)
	{
		System.out.println("enter product id");
		int pid=sc.nextInt();
		System.out.println("enter product price");
		double price=sc.nextDouble();
		System.out.println("enter product quantity");
		int qua=sc.nextInt();
		p[i]=new Product(pid,price,qua); 
		
	}
	//System.out.println(p[0].price);
	a.display(p);
	a.highestSal(p);
	a.spendAmount(p);
}

}
