package Syncronization;

public class Table {

	synchronized public void printable(int n) {
		// TODO Auto-generated method stub
	for(int i=1;i<=5;i++)
	{
		System.out.println(n*i);
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}

}
