
public class Item {

	private String name;
	private double price;
	private int stock;
	private double amount;
	private static double totalAmt;
	public Item(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.amount = amount;
	}
	
	public void calAmount()
	{
		amount=price*stock;
		totalAmt+=amount;
		System.out.println("amount of stock is"+amount);
	}
	public static void billAmount() {
		System.out.println("total amount is"+totalAmt)
		;
	}
	
}
