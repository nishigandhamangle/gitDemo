package innerClass;

public class outer4 {
	public static int n=1;
	int no=12;
	public static class inner{
		public void get()
		{
		
			System.out.println("n"+n);
		}
	}
	public static void main(String[] args) {
		outer4.inner i = new outer4.inner();
		i.get();
	}

}
