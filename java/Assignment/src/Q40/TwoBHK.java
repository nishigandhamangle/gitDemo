package Q40;

public class TwoBHK extends OneBHK{

double room2Area;

public TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
	super(roomArea, hallArea, price);
	this.room2Area = room2Area;
}
public TwoBHK() {
	super();
	room2Area=0.0;
	
}
public void show()
{super.show();
	System.out.println("room2Area="+room2Area);
}
}
