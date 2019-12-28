package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ClassDemo {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt;
		ResultSet rs;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found..");
			con = DriverManager.getConnection("jdbc:mysql:"
					+ "//192.168.100.26:3306/group025","group025", "welcome");
			System.out.println("Connection established");
			
			pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter Employee ID=");
			int i=s.nextInt();
			
			System.out.println("Enter Employee Name=");
			String n = s.next();
			
			System.out.println("Enter Employee Salary=");
			float sal=s.nextFloat();
			
			pstmt.setInt(1, i);
			pstmt.setString(2, n);
			pstmt.setFloat(3, sal);
			
			int status = pstmt.executeUpdate();
			
			if(status > 0)
			{
				System.out.println("Sucessfully inserted");
			}
			else
			{
				System.out.println("FAiled to insert");
			}
			rs = pstmt.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
			
			pstmt = con.prepareStatement("update employee set name=? where id=?");
			System.out.println("Update Employee Name=");
			String k = s.next();
			System.out.println("Update Employee ID=");
			int o=s.nextInt();
			
			pstmt.setInt(2, o);
			pstmt.setString(1, k);
			int status1 = pstmt.executeUpdate();
			
			if(status1 > 0)
			{
				System.out.println("Sucessfully inserted");
			}
			else
			{
				System.out.println("FAiled to insert");
			}
			rs = pstmt.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
			
			pstmt = con.prepareStatement("Delete from employee where name=?");
			System.out.println("Delete Employee Name=");
			String d = s.next();
			
			pstmt.setString(1, d);
			int status2 = pstmt.executeUpdate();
			
			if(status2 > 0)
			{
				System.out.println("Sucessfully inserted");
			}
			else
			{
				System.out.println("FAiled to insert");
			}
			rs = pstmt.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			con.close();
		}
		
	}

}
