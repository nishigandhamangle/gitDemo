package Q41;
/*41.	Create three classes 
	Faculty (facultyid, salary)
	FullTimeFaculty (basic, allowance) inherits class
	 Faculty
	PartTimeFaculty (hour, rate) inherits class 
	Faculty
Create a method for accepting input in FullTimeFaculty
 and PartTimeFaculty,  but salary should not be 
 accepted. Salary is calculated on the basis of  
 (basic+allowance) for FullTimeFaculty and (hour*rate)
  for PartTimeFaculty. Also create method in above
   classes to display faculty data.
Create another class(say XYZ) for main method and 
store 2 fulltime and 2 parttime faculty information.
 Also print their details.
*/
public class Faculty {
//int facultyid;
//double salary;
//
//public Faculty()
//{
//	
//}
//public Faculty(int facultyid) {
//	super();
//	this.facultyid = facultyid;
//	//this.salary = salary;
//}
//
//
////public void accept()
////{
////	System.out.println("enter the ");}
////}
	
	int facultyid;
	float salary;
	public Faculty(int facultyid, float salary) {
		
		this.facultyid = facultyid;
		this.salary = salary;
	}
	
	public Faculty() {
		this.facultyid = 0;
		this.salary = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
