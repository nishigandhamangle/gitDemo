package multithreading;

public class MyThread4 extends Thread{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		//System.out.println("@@");
	
		try
		{
			Thread.currentThread().sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	MyThread4 t1=new MyThread4();
	MyThread4 t2=new MyThread4();
	MyThread4 t3=new MyThread4();
	t1.start();
	try {
		//t1.join();
//		 System.out.println(Thread.currentThread().getName() 
//                 + " in control"); 

		t1.yield();
	} catch (Exception e) {
		// TODO: handle exception
	}
	t2.start();
	t3.start();
	//t2.run();

}
}
