package session_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\java\\session_6\\src\\session_6\\abc.txt");
		File f2 = new File("E:\\java\\session_6\\src\\session_6\\mno.txt");
		RandomAccessFile raf1 = new RandomAccessFile(f1,"r");
		RandomAccessFile raf2 = new RandomAccessFile(f2,"rw");
		int x= 0;
		System.out.println("Before Setting Poitner"+" "+raf1.getFilePointer());
		raf1.seek(3);
		System.out.println("After seting pointer"+" "+raf1.getFilePointer());
		
		do
		{
			x= raf1.read();
			raf2.write((char)x);
		}while(x!=-1);
	}

}
