package wrapper;

public class wrapper {
public static void main(String[] args) {
	
	int x=30;//primitive to wrapper
	Integer i=new Integer(x);
	int y=i.intValue();
	
	String s="30";
	int a=Integer.parseInt(s);
	//string to primitive
	String s1="30";
	Integer b=Integer.valueOf(s1);
	System.out.println(b);
	//autoboxing and unboxing
	int no=10;
	Integer q=no;
	no=q;
	
	
	
}
}
