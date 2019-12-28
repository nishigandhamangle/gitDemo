package Q_64;

import java.util.Scanner;

/*64.	Create a Thread class to print following star(*)
 *  pattern on screen with delay of 1 second between each * print.
 *   Number of lines in the pattern should be passed to the constructor of Thread class. 
* 
*  * * * *
 * * * *
* * *
* *
*
Use this class in main method and ask user to enter number of lines to print. 
*/
public class Thread1 implements Runnable{

	
	public int n;

	public Thread1(int n) {
		
		this.n = n;
	}
	
	public void run()
	{
		  for(int i=1; i<=n; i++)
		    {
		        /* Iterate through columns */
		        for(int j=i; j<=n; j++)
		        {
		            System.out.print("*");
		            try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		       
		        /* Move to the next line */
		        System.out.println();
		    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int k = sc.nextInt();
		Thread1 t=new Thread1(k);
		Thread t1 = new Thread(t);
		t1.start();
	}
	
	
}
