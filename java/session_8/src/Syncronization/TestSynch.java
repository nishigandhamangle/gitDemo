package Syncronization;

public class TestSynch {
public static void main(String[] args) {
	Table obj=new Table();
	MyThread1 t1=new MyThread1(obj);
	MyThread1 t2=new MyThread1(obj);
	MyThread1 t3=new MyThread1(obj);
	t1.start();
	t2.start();
	t3.start();
	
}
}
