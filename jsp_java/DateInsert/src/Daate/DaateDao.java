package Daate;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DaateDao {
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group025","group025","welcome");
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		return con;
	}
	
	public static int save(daate1 u) throws SQLException {
		int status=0;
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into date1(number,date) values(?,?)");
		ps.setInt(1, u.getNumber());
		ps.setDate(2, (Date) u.getDate());
		status=ps.executeUpdate();
		return status;
	}
}

