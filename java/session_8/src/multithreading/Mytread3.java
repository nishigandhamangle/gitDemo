package multithreading;

import java.io.InterruptedIOException;

public class Mytread3 extends Thread{
public void run()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("thread name"+Thread.currentThread().getPriority());
		try
		{
			Thread.currentThread().sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
public static void main(String[] args) {
	
	Mytread3 t1=new Mytread3();
	Mytread3 t2=new Mytread3();
	Mytread3 t3=new Mytread3();
	t1.setPriority(MAX_PRIORITY);
	t2.setPriority(MIN_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
}
}
