package innerClass;
//using this operator
public class outer3 {

	int x=0;
	class Inner
	{
		int x=10;
		public void methodOne()
		{
			int x=100;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(outer3.this.x);
		}
	}
	public static void main(String[] args) {
		new outer3().new Inner().methodOne();
	}
}
