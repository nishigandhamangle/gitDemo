package Q46;

import java.util.Scanner;

public class Xyz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of Employees:");
		int n= s.nextInt();
		Employee e[] = new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].accept();
			for(int j=0;j<i;j++)
			{
				if(e[i].equals(e[j]))
				{
					System.out.println("******** Entered EmpID exists *********");
					System.out.println("Re-Enter the details");
					e[i].accept();
				}
			}
			
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(e[i]);
		}
		
		s.close();

	}
}
