package assignment51;
import java.util.ArrayList;
import java.util.Scanner;
public class StrCount {
public static void main(String[] args) {
	

String str="";
System.out.println("enter the string of no");
Scanner s=new Scanner(System.in);
str=s.next();
String[] ch;
int total = 0;
int size=str.length();
int [] arr = new int [size];
for(int i=0;i<size;i++)
{
	ch=str.split(",");
	
	 
	 total=Integer.parseInt(ch[i])+total;
}
	
System.out.println("total="+total);
}

}
