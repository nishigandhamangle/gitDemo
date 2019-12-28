package PRNServletDemo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class PRNDao {
	
	public static  Connection getTheConnection(){
	Connection con = null;
	PreparedStatement ps;
	ResultSet rs;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Found...");
		
		con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group025","group025","welcome");
		System.out.println("Connection Established!");
		
	} catch(Exception e1)
	{
		System.out.println(e1);
	} 
	return con;
	}
	
	public static Student validate(int prn) throws SQLException
	{
		Connection con = PRNDao.getTheConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from student_prn where prn=?");
		pstmt.setInt(1,prn);
		ResultSet rs=pstmt.executeQuery();
		Student s= new Student();
		while(rs.next())
		{
			s.setPrn(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setS1(rs.getInt(3));
			s.setS2(rs.getInt(4));
			s.setS3(rs.getInt(5));
		}
		return s;
		
	}
}

