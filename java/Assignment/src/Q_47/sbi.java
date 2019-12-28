package Q_47;

import java.util.Scanner;

/*Anybody can create current or saving account with following initial information:
 account number, name, balance, and branch.*/
abstract public class sbi {
	int accno;
	String name;
	float balance;
	String Branch;
	
	 public void accept()
	 {
		 float amt;
		 System.out.println("Enter the details:");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the accno:");
		 accno = sc.nextInt();
		 System.out.println("Enter the name:");
		 name = sc.next();
		 System.out.println("Enter the balance:"); 
		 amt = sc.nextFloat();
		 if(amt<5000)
			{
				System.out.println("Kindly, deposit 5000 rupees");
			}
			else
			{
				balance =amt;
				
			}
		 System.out.println("Enter the Branch:");
		 Branch = sc.next();
	 }
	
	 public void display()
	 {
		 System.out.println("Following are the details:");
		 System.out.println("Account No:"+accno);
		 System.out.println("Name:"+name);
		 System.out.println("Balance:"+balance);
		 System.out.println("Branch"+Branch);
	 }
	abstract public void withdraw();
	abstract public void deposit();
	
	
	
}
