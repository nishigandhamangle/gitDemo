
public class Date {
int d,m,y;

public Date(int d, int m, int y) {
	
	this.d = d;
	this.m = m;
	this.y = y;
}

public static void swap(Date[] d)
{
	Date t1;
	t1=d[0];
	d[0]=d[1];
	d[1]=t1;
	
}

@Override
public String toString() {
	return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
}
public static void main(String[] args) {
	Date[] d= new Date[2];
	Date d1= new Date(5,11,1996);
	Date d2= new Date(6,11,1996);
	d[0]=d1;
	d[1]=d2;
	System.out.println("Before swap");
	System.out.println(d[0]);
	System.out.println(d[1]);
	Date.swap(d);
	System.out.println("After swap");
	System.out.println(d[0]);
	System.out.println(d[1]);
}  
}
