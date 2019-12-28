
public class Rectangle extends shape {
int l,b;

public Rectangle(int l, int b) {
	super(l,b);
	//this.l = l;
	//this.b = b;
}

public void area()
{
	int a=l*b;
	System.out.println("area of rectangle"+a);
}
}
