package multithreading;

public class DaemonThread extends Thread{
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("DEamon Thread running");
	}
}
public static void main(String[] args) {
	DaemonThread t1=new DaemonThread();
	DaemonThread t2=new DaemonThread();
	t1.setDaemon(true);
	t1.start();
}
}
