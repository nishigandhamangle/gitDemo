package Q_42;

import java.util.Scanner;

/*Create a class(say XYZ) with main method that carries out the operation of the project :
-- has array to store objects of any class(Student or CollegeStudent, SchoolStudent)
--create two CollegeStudent  and three SchoolStudent record objects and store them inside the
 array
-- display all record from the array
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of
 CollegeStudent.
--count how many students are having A grade,  if for A grade percentage >75*/
public class Xyz {
	Scanner s= new Scanner(System.in);
	public void grade(Student st[])
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(st[i].percentage>=75)
			{
				st[i].show();
				count++;
			}
			
		}
		System.out.println("Student above 75% are: "+count);
	}
	public void search(Student st[])
	{
		CollegeStudet cc=new CollegeStudet();
		SchoolStudent ss=new SchoolStudent();
		System.out.println("Enter the Rollno.");
		int r=s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(r==st[i].rollno)
			{
				
				if(st[i] instanceof CollegeStudet)
				{
					cc=(CollegeStudet) st[i];
					cc.check();
				}
				else if(st[i] instanceof SchoolStudent)
				{
					ss=(SchoolStudent) st[i];
					ss.check();
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		Student st[] = new Student[5];
		//Student ss=new Student();
		Xyz x=new Xyz();
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			if(i<2)
		
			{ System.out.println("++++++++Enter The Collage Student+++++++++ ");
				System.out.println("Enter \n Roll_No\n Percetage\n Semister");
				int r =s.nextInt();
				float p=s.nextFloat();
				int sm=s.nextInt();
				st[i]=new CollegeStudet(r, p, sm);
				
			}
				
			else if(i>1)
			{
				System.out.println("*********Enter The School Student********** ");
				System.out.println("Enter \n Roll_No\n Percetage\n Classname");
				int r =s.nextInt();
				float p=s.nextFloat();
				String sm=s.next();
				st[i]=new SchoolStudent(r, p, sm);
				
			}
		}
		
		for(int i=0;i<5;i++)
		{
			if(i<2)
			{
				System.out.println("++++++++ The Collage Student +++++++++ ");
				st[i].show();
			}
			else if(i>1)
			{
				System.out.println("********* The School Student ********** ");
				st[i].show();
			}
		}
		System.out.println("Student having A grade (more then 75%)");
		x.grade(st);
		x.search(st);
	
		s.close();
		
	}
}
