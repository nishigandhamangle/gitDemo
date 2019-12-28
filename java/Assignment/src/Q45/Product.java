package Q45;
/*b.	Create class Product(pid,price,quantity) and implement Taxable to calculate
 salesTax on unit price of product.*/
public class Product implements Taxable{
int pid;
double price;
double quantity;
@Override
public double calcTax(){
	
	double tax=salesTax*quantity*price;

	return tax;
}
public Product(int pid, double price, double quantity) {
	super();
	this.pid = pid;
	this.price = price;
	this.quantity = quantity;
}

}
