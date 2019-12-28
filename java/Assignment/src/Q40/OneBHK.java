package Q40;
/*40.	Create class OneBHK with instance variable 
 * roomArea , hallArea and price
a.	Create default and parameterized constructor;
b.	Method show(): to print OneBHK data member 
information;
Create another class TwoBHK which has all 
the properties and behaviour of OneBHK and a new 
instance variable room2Area.
a.	Create default and parameterized constructor;
b.	Method show(): to print all data member 
information;Write main function in another
 class(Say XYZ) and store three TwoBHK flat’s 
 information  and print  information using show 
 method. Also print total amount of all flats.
*/
public class OneBHK {
	double roomArea;
	double hallArea; 
	double price;
	public OneBHK(double roomArea, double hallArea, double price) {
		super();
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	public OneBHK() {
		this.roomArea = 0.0;
		this.hallArea = 0.0;
		this.price = 0.0;
	}
	public void show()
	{
		System.out.println("roomArea="+roomArea+"\nhallArea="+hallArea+"\nprice="+price);
	}
	
}
