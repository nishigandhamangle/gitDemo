package Syncronization;

public class MyThread2 extends Thread{
	Table t1;
	MyThread2(Table t)
	{
		this.t1=t;
	}
	public void run()
	{
		t1.printable(100);
	}
}
