package session_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo1 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("E:\\java\\session_6\\src\\session_6\\abc.txt");
	//int i=fis.read();
	//System.out.println((char)1);
	int i=0;
	while((i=fis.read())!=-1)
	{
		System.out.println((char)i);
	}
}
	
}

