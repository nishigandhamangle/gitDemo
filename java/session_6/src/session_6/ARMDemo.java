package session_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ARMDemo {
	public static void main(String[] args) throws IOException{
		try(FileInputStream fis = new FileInputStream("E:\\java\\session_6\\src\\session_6\\abc.txt");
				FileOutputStream fos=new FileOutputStream("E:\\java\\session_6\\src\\session_6\\mno.txt"))
		{
			System.out.println("hi");
		}
	}

}
