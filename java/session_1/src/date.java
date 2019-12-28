import java.util.Scanner;

public class date {
	private int dd,mm,yy;
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public void setDd(int d)
	{if(d<31)
	{
		dd=d;
	}
	else
	{
		System.out.println("invalid date");
	}
	
	}
	public void setMm(int m)
	{if(m<12)
	{
		mm=m;
	}
	else
	{
		System.out.println("invalid month");
	}
	}
	public void setYy(int y)
	{
		yy=y;
	}
public static void main(String args[])
{
	date d=new date();
	Scanner sc=new Scanner(System.in);
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	
	d.setDd(dd);
	d.setMm(mm);
	d.setYy(yy);
	System.out.println("date is "+d.getDd()+"/"+d.getMm()+"/"+d.getYy());
	
	
}
}
