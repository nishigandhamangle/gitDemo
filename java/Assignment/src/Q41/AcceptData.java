package Q41;

import java.util.Scanner;

public class AcceptData {
public static void main(String args[]) {
	// TODO Auto-generated method stub

//	FullTimeFaculty ft=new FullTimeFaculty();
//	PartTimeFaculty pt=new PartTimeFaculty();
////	for(int i = 0;i<2;i++)
////	{
////		//ft[i]= new 	FullTimeFaculty();
////		
////		//System.out.println("enter 2 FullTime faculty data
////	ft[i]=ft[0].accept();
////	pt[i]=pt[0].accept();
////	}
//	ft.accept();
//	pt.accept();
//	ft.display();
//	pt.display();
////	for(int i = 0;i<2;i++)
////	{
////		System.out.println("information of all faculty");
////	System.out.println("full time faculty");
////		ft[i].display();
////		System.out.println("part time faculty");
////	pt[i].display();
////	}
//}
	

	
		 FullTimeFaculty ff[]=new FullTimeFaculty[2];
		 
		 PartTimeFaculty pp[]=new PartTimeFaculty[2];
		 Scanner s=new Scanner(System.in);
		 for(int i=0;i<2;i++)
		 {
			 ff[i]=new FullTimeFaculty();
			 ff[i].accept();
		 }
		 for(int i=0;i<2;i++)
		 {
			 pp[i]=new PartTimeFaculty();
			 pp[i].accept();
		 }
		 for(int i=0;i<2;i++)
		 {
			 System.out.println(ff[i]);
		 }
		 for(int i=0;i<2;i++)
		 {
			 System.out.println(pp[i]);
		 }
		
		 s.close();
	}
}
