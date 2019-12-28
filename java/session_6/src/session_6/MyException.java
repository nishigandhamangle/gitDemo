package session_6;

public class MyException {
public static void main(String[] args) {
	
	try {
	//int a=10/0;
	//
	//int arr[]= new int[5];
	//arr[6]=1;
	
	//String s="a";
	//int i=Integer.parseInt(s);
	
	//String d = null;
	//int l=d.length();
	Object o = new Object();
	String g= (String)o;
	}
//	catch(ArithmeticException e)
//	{
//		System.out.println(e);
//		System.err.println("Denominator should not be zero");
//	}
//	catch(NumberFormatException e)
//	{
//		System.out.println(e);
//		System.err.println("Enter integer value");
//	}
//	catch(ArrayIndexOutOfBoundsException e)
//	{
//		System.out.println(e);
//		System.err.println("Enter atleast 5 index");
//	}
	catch(Exception e)
	{
	if(e instanceof ArithmeticException)
	{
		System.out.println(e);
	}
	else if(e instanceof ArrayIndexOutOfBoundsException)
	{
		String s= e.getMessage();
		System.out.println(e);
	}
	else if(e instanceof NumberFormatException)
	{
		e.printStackTrace();
	}
	else if(e instanceof ClassCastException)
	{
		e.printStackTrace();
	}
	else
	{
		System.err.println("Some Error");
	}
	}
	
}
}
