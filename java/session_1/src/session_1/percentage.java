package session_1;

import java.util.Scanner;

public class percentage {
	
	public static void main(String[] args) {
		
		float percentage;
		int s1,s2,s3;
		float total;
		
		Scanner s = new Scanner(System.in);
				
		
		System.out.println("Enter the marks of s1");
		s1=s.nextInt();
		
		System.out.println("Enter the marks of s2");
		s2 = s.nextInt();
		
		System.out.println("Enter the marks of s3");
		s3 = s.nextInt();
		
		 percentage = (float)(((s1+s2+s3)/300)*100);
		 System.out.println("percentage is : "+percentage);
		
		
		
		
	}
	

}
