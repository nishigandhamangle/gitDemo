package session_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WRite_Close {
public static void main(String[] args) throws IOException {
	FileInputStream fin = null;
	FileOutputStream fos = null;
	
	int x;
	File f1 = new File("E:\\java\\session_6\\src\\session_6\\abc.txt");
	File f2 = new File("E:\\java\\session_6\\src\\session_6\\mno.txt");
	
	fin = new FileInputStream(f1);
	fos = new FileOutputStream(f2);
	do
	{
		x=(byte)fin.read();
		fos.write(x);
		
	}while(x!=-1);
	
	fin.close();
	fos.close();
}
}
