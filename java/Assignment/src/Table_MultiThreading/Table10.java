package Table_MultiThreading;

public class Table10 extends Thread{
public void run()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println("10 X "+i+"="+(10*i));
		
	}
	System.out.println("Exit from Thread A : Execution over");
}
}
