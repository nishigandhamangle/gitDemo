package Q52;
/*52.	Store name of weekdays in an array (starting from “Sunday” at 0 index). 
 * Ask day position from user and print day name. Handle array index out of bound exception 
 * and give proper 
 * message if user enter day index outside range (0-6).*/
import java.util.Scanner;
public class Weekdays extends Exception{

		public Weekdays(String s)
		{
			super(s);
		}
	public static void main(String[] args) {
		String day[]= {"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
		System.out.println("enter day index");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		try
		{
		for(int i=0;i<day.length;i++)
		{
		if(ch==i)
		{
			System.out.println(day[i]);
			break;
		}
		else
		{
			throw new Weekdays("invalid index");
		}
		}
		}
		catch(Weekdays e)
		{
			 System.out.println("Caught");
			   System.out.println(e.getMessage());
		}
			
		}
		
		
	}
		



