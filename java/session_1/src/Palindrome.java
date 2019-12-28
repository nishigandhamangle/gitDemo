import java.util.Scanner;

public class Palindrome {
 public static void main(String[] args)
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int a = s.nextInt();
	 int l= String.valueOf(a).length()-1;
	 System.out.println("length"+l);
	 String m = Integer.toString(a);
	 int k=0;
	 while(k<l)
	 {
		 if(m.charAt(k)!=m.charAt(l))
		 {
			 System.out.println("Not a palindrome");
			 return;
		 }
		 k++;
		 l--;
		 
	 }
	 
	 System.out.println("a palindrome");

 }
}
