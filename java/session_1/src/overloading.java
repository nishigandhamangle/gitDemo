
public class overloading {
int a,b;
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
//	public int add(int ...x)
//	{
//		int sum=0;
//		System.out.println("length="+x);
//		for(int i=0;i<x.length;i++)
//		{
//			sum+=x[i];
//		}
//		return sum;
//	}
	public int add(int a,int...x)
	{int sum=0;
	System.out.println("length="+x);
	for(int i=0;i<x.length;i++)
	{
		sum+=x[i];
	}
		return a+sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overloading o=new overloading();
int sum=o.add(10,20);
System.out.println("sum="+sum);
System.out.println("addition="+o.add(1,2,3));
System.out.println("addition of vararg="+o.add(1,1,2,3,4,5,6,7,8,9));
}

}
