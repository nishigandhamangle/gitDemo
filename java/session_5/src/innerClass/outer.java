package innerClass;

public class outer {
private int n=10;

private class Inner
{
	public void get()
	{
		System.out.println("no "+n);
	
	}
}
public void get()
{
	Inner i=new Inner();
	i.get();
}
public static void main(String[] args) {
	outer o=new outer();
	o.get();
	//Inner i=o.new Inner();
	//i.get();
	
}
}
