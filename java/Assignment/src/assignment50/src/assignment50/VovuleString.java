package assignment50;

import java.util.Scanner;

public class VovuleString {
public static void main(String[] args) {
	String str="";
	int vowele=0;
	System.out.println("enter string");
	Scanner s=new Scanner(System.in);
	str=s.next();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E'|| ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
			vowele++;
		}
	}
	System.out.println("no of vowel="+vowele);
}
}
