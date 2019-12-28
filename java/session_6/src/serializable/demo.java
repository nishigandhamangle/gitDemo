package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class demo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee e=new Employee(111,"rahul");
	FileOutputStream fos=new FileOutputStream("E:\\java\\session_6\\src\\session_6\\abc.txt");
	
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("success");

	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\java\\session_6\\src\\session_6\\mno.txt"));
	Employee e1=(Employee)ois.readObject();
	System.out.println(e1);
}
}
