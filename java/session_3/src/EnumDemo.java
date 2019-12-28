
public class EnumDemo {

	public enum season{WINTER,SUMMER,AUTUMN};
	public static void main(String []args)
	{
		season s=season.WINTER;
		System.out.println(s);
		for(season s1:season.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}
	}
}
