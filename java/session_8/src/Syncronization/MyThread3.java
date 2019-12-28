package Syncronization;

public class MyThread3 extends Thread{
	Table t1;
	void MyThread1(Table t)
	{
		this.t1=t;
	}
	public void run()
	{
		t1.printable(7);
	}
}
