package Q_47;
/*can not withdraw the amount from the account that makes balance less than
the minimum balance.*/
import java.util.Scanner;

public class Savings extends sbi{
	 Scanner sc = new Scanner(System.in);
	@Override
	public void withdraw() {
		System.out.println("Enter Amout you want to withdraw:");
		float amt =  sc.nextFloat();
		if((balance-amt)<5000)
		{
			System.out.println("Sorry!Cant't withdarw");
			amt =  sc.nextFloat();
		}
		else
		{
			balance = balance-amt;
		}
		
	}

	@Override
	public void deposit() {		
		float amt = sc.nextFloat();
		balance = balance +amt;
	
	}

}
