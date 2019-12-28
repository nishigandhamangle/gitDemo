import java.util.Scanner;

public class DemoArray {
public static void main(String[] args) {
	int arr[] = {1,2,3,4};
	int[] arr1 = new int[] {1,2,3,4};
	int[] arr2 = new int[5];
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no. of elements");
	int n = s.nextInt();
	int[] a = new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}

	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+"\t");
	}
	System.out.print("\n");
	for(int i:a)
	{
		System.out.println(i);
	}
	
	//2D array
	int a1[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9,9}};
	//int [][]arr={{1,2,3},{4,5,6},{6,7,8}};
	//int [][] arr=new int[3][];
	//arr[0][0]=10;
	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a1[i].length;j++)
		{
			System.out.print(a1[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.print("----------------------------------------\n");
	for(int i[]:a1)
	{
		for(int j:i)
		{
			System.out.print(j+"\t");
		}
		System.out.println("\n");
	}
	
	//JAgged array
	System.out.print("----------------------------------------\n");
	System.out.println("JAgged Array");
	int a3[][] = new int [3][];
	a3[0] = new int[3];
	a3[1] = new int[4];
	a3[2] = new int[2];
	int count=0;
	for(int i=0;i<a3.length;i++)
	{
		for(int j=0;j<a3[i].length;j++)
		{
			a3[i][j]=count++;
		}
	}
	
	for(int i=0;i<a3.length;i++)
	{
		for(int j=0;j<a3[i].length;j++)
		{
			System.out.print(a3[i][j]+" ");
		}
		System.out.println();
	}
}	
}
