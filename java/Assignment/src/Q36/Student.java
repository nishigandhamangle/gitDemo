package Q36;
import java.util.Scanner;

/*37.	 Make list of Students having name, 
 * roll no., age, score. Write a program to
 *  accept 10 students record and arrange the 
 *  Students based on the score group [0-50],[50-65],
 * [65-80],[80-100]. */
public class Student {
int rollNo;
int age;
int score;

public Student(int rollNo, int age, int score) {
	super();
	this.rollNo = rollNo;
	this.age = age;
	this.score = score;
}
public Student() {
	// TODO Auto-generated constructor stub
}
/*public Student() {
	rollNo=0;
	age=0;
	score=0;
}*/
public void accept(Student sa[])
{Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		System.out.println("enter roll no");
		sa[i].rollNo= sc.nextInt();
		System.out.println("enter age");
		sa[i].age=sc.nextInt();
		System.out.println("enter score");
		sa[i].score=sc.nextInt();
		sa[i]=new Student(rollNo,age,score);
		
		
	}
}
public void group(Student s[])
{
	for(int i=0;i<10;i++)
	{
	
		if(s[i].score>0 && s[i].score<50)
		{
			System.out.println("group a"+s[i]);
		}
		else if(s[i].score>50 && s[i].score<65)
		{
	System.out.println("group b"+s[i]);
		}
		else if(s[i].score>65 && s[i].score<80)
		{
			System.out.println("group c"+s[i]);
		}
		else if(s[i].score>80 && s[i].score<100)
		{
			System.out.println("group d"+s[i]);
		}
	}
}
public static void main(String[] args) {
//	int roll;
//	int ag,sc;
	Student s[]=new Student[10];
	Scanner sc=new Scanner(System.in);
	Student a=new Student();
	for(int i=0;i<10;i++)
	{
		System.out.println("enter roll no");
		int rollNo= sc.nextInt();
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter score");
		int score=sc.nextInt();
		s[i]=new Student(rollNo,age,score);
		

	}
	
//	Student.accept(s);

	s[0].group(s);
	//a.accept(s);
	
	
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", age=" + age + ", score=" + score + "]";
}
}
