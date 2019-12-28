package dateexpire;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;



public class MedicineDao {
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
	public static int save(medicine u,Date req) {
		int status=0;
		
		try {
		
			//SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
		      //Date dt=(Date) d.parse(req);          

		      //java.sql.Date sqlDate = new java.sql.Date(dt.getTime()); 
		      
			Connection con=getConnection();
			 // here u'll get date 
			PreparedStatement ps=con.prepareStatement("insert into group025.medicine(id,name,expiryDate) values(?,?,?)");
			ps.setInt(1, u.getId());
			ps.setString(2, u.getName());
			ps.setDate(3, req);
			
			status=ps.executeUpdate();
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
		
	}
}
