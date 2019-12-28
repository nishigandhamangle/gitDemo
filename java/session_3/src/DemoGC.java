
public class DemoGC {

	protected void finalize() throws Throwable{
		System.out.println("object garbage collector");
		
	}
	public static void main(String args[])
	{
		DemoGC g1=new DemoGC();
		DemoGC g2=new DemoGC();
		DemoGC g3=new DemoGC();
		g1=null;
		g2=null;
		g3=null;
	System.gc();
		
	}
}
