package Syncronization;

public class MyThread1 extends Thread{
Table t1;
MyThread1(Table t)
{
	this.t1=t;
}
public void run()
{
	t1.printable(5);
}
}
