package multithreading;
//using runnable
import java.nio.charset.MalformedInputException;

public class Mythread1 implements Runnable{
public void run()
{
	System.out.println("name="+Thread.currentThread().getName());

}
public static void main(String[] args) {
	
	Mythread1 m1=new Mythread1();
	Thread t1=new Thread(m1);
	
	t1.start();
}
}
