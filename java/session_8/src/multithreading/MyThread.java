package multithreading;
//using thread class
public class MyThread extends Thread{
public void run()
{
	System.out.println("thread name="+Thread.currentThread().getName());
	
}
public static void main(String[] args) {
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	MyThread t3=new MyThread();
	t1.start();
	t2.start();
	t3.start();
	
}
}
