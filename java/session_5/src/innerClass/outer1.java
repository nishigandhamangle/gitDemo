package innerClass;

public class outer1 {

	private int no=11;
	public void get()//localk inner class
	{
		class Inner
		{
			private int n=0;
			public void get()
			{
				System.out.println("n="+n);
				System.out.println("n="+no);
			}
		}
		Inner i=new Inner();
		i.get();
		
	}
	public static void main(String[] args) {
		outer1 o=new outer1();
		o.get();
	}
}
