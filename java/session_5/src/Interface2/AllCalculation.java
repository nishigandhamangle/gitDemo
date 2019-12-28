package Interface2;

public class AllCalculation extends CAlNumber implements CompareCal,StackCal{

	@Override
	public void avg(int a, int b) {
		// TODO Auto-generated method stub
		float c =(a+b)/2;
		System.out.println("c:"+c);		
	}

	@Override
	public void min(int a, int b) {
		// TODO Auto-generated method stub
	int c= (a<b)?a:b;
	System.out.println("c:"+c);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c= a+b;
		System.out.println("C:"+c);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println("c:"+c);
	}
	
	public static void main(String[] args) {
		AllCalculation n =new AllCalculation();
		n.avg(3,5);
		n.min(1, 2);
		n.fact(5);
		n.add(1, 2);
		n.sub(2, 1);
		
	}
	

}
