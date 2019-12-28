package Q_47;
/*
 * 47. Create a program that helps banks to maintain records. It should have  
following facilities.
Anybody can create current or saving account with following initial information:
 account number, name, balance, and branch.
display account detail for a particular accounts.
display total money deposited in bank.
allow deposit and  withdrawal in an account  .
for saving account opening balance and minimum balance must be 5000.
for current account opening balance and minimum balance must be 1000.
can not withdraw the amount from the account that makes balance less than
the minimum balance.
 */
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		sbi sb[]=new sbi[3];
		for(int i=0;i<2;i++) {
//		System.out.println("account type\n");
//		System.out.println("1.saving account\n 2.current account");
//		int choice;
//		System.out.println("enter choice");
//		Scanner sc=new Scanner(System.in);
//		choice=sc.nextInt();
//		int i =0;
//		switch(choice)
//		{
//		case 1:
			
			sb[i]=new Savings();
			sb[i].accept();
			sb[i].display();
			sb[i].deposit();
			sb[i].withdraw();
			sb[i].display();
		}
		
		sbi cb[]=new sbi[3];
		
		for(int i=0;i<2;i++)
		{
			sb[i]=new Current();
			sb[i].accept();
			sb[i].display();
			sb[i].deposit();
			sb[i].withdraw();
			sb[i].display();
		}

	}

	}

