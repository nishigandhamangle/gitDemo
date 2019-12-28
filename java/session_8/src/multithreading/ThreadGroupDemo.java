package multithreading;

public class ThreadGroupDemo implements Runnable{
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args) {
	ThreadGroupDemo tg=new ThreadGroupDemo();
	ThreadGroup t=new ThreadGroup("GroupA");
	
	Thread t1=new Thread(t,tg,"one");
	Thread t2=new Thread(t,tg,"two");
	t1.start();
	t2.start();
	System.out.println("List");
	t.list();
}

}

