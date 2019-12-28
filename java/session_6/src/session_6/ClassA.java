package session_6;

import java.io.FileInputStream;
import java.io.IOException;

public class ClassA {
public static void main(String[] args) throws IOException {
	FileInputStream fis=null;
	try
	{
		fis=new FileInputStream("E:\\java\\session_6\\src\\session_6\\mno.txt");
		
	}
	catch(Exception e)
	{
		System.out.println("exception catch");
	}
	finally
	{
		fis.close();
		System.out.println("file close");
	}
}
}
