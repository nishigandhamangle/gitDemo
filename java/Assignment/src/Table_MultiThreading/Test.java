package Table_MultiThreading;

public class Test {
	public static void main(String[] args) {
		
	
	String str = "1,2,3,4,5,6"; 
	str = str.substring(0, 1) + "{" + str.substring(1, str.length()) + "}";
	System.out.println(str);
	}
}
