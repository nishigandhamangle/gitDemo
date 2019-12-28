package session_6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("E:\\java\\session_6\\src\\session_6\\mno.txt");
	
String s="my roll no is 65";
byte[] b=s.getBytes();
fos.write(b);
System.out.println("success");
fos.close();

}
}
