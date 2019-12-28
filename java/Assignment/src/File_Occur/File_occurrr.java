package File_Occur;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File_occurrr {
	public static void main(String[] args) throws IOException {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		FileOutputStream out = new FileOutputStream("E:\\java\\Assignment\\src\\File_Occur\\a.txt");
		out.write(str.getBytes());
		System.out.println("occurence character");
		char c = s.next().charAt(0);
		int count =0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}
		System.out.println("count is:"+count);
		out.close();
	}
    
    
}
