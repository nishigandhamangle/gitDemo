package session_6;

public class UserDefineException extends Exception {

	@Override
	public String toString() {
		return "UserDefineException []";
	}
	public static void main(String[] args) {
		int a=10,b=20;
		UserDefineException obj=new UserDefineException();
		double ans=obj.div(a,b);
		System.out.println("ans="+ans);
		if(ans<1)
		{
			try {
				throw new UserDefineException();
			}
			catch(UserDefineException e)
			{
				System.out.println(e);
			}
		}
	}
	private double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
