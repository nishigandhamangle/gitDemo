package Q_54;

import java.util.Scanner;

/*54.	Create Interface StudentFee and declare following method.  
getFee() throws InvalidFeeException. This method ask fees from user 
and throws exception if user enters invalid or negative fees
Create class Student with members (name, fees) and implement the StudentFee Interface.
*/
public class Student implements StudentFee{
String name;
double fees;



public void getFee() {
	
		if(fees<0)
		{
			try {
				throw new InvalidFeeException("Invalid data");
			} catch (InvalidFeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
}
public void accept()
{
	System.out.println("enter name and fee of student");

Scanner s=new Scanner(System.in);
name=s.next();

fees=s.nextDouble();

}

public void display()
{
	System.out.println("name:"+name+" "+"fees:"+fees);
}
public static void main(String[] args) {
	
	Student s=new Student();
	try {
	s.accept();
	s.getFee();
	}catch (Exception e) {
		System.out.println("exception occure");
	}
	
	
}


}
