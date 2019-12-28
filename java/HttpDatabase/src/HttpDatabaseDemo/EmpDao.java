package HttpDatabaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao {
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found!");
			
			con = DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306//group025;",
					"group025","welcome");
			System.out.println("Connection Established");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	public static int save(Employee e) throws SQLException 
	{
		Connection con=EmpDao.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into emp_reg values(?,?,?,?)");
		pstmt.setString(1, e.getEmpName());
		pstmt.setString(2, e.getEmpPwd());
		pstmt.setString(3, e.getEmpEmail());
		pstmt.setString(4,e.getEmpPhone() );
		
		int ans = pstmt.executeUpdate();
		
		return ans;
		
	}
	
	public static boolean  validate(Employee e) throws SQLException
	{
		Connection con = EmpDao.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from emp_reg where uname=? and password=?");
		System.out.println(e.getEmpPwd()+" "+e.getEmpName());
		pstmt.setString(1, e.getEmpName());
		pstmt.setString(2,e.getEmpPwd());
		
		ResultSet rs = pstmt.executeQuery();
		boolean status = rs.next();
		System.out.println(status);
		return status;
		
	}
}
