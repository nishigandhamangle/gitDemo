package com.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class UserDao {

		public static Connection getConnection()
		{
			Connection con=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group025","group025","welcome");
			}catch(Exception e1)
			{
				System.out.println(e1);
			}
			return con;
		}
		
//		public static int save(User u) {
//			int status=0;
//			
//			try {
//				Connection con=getConnection();
//				PreparedStatement ps=con.prepareStatement("insert into users(uname,password,email,country) values(?,?,?,?)");
//				ps.setString(1, u.getUsername());
//				ps.setString(2, u.getPassword());
//				ps.setString(3, u.getEmail());
//				ps.setString(4, u.getCountry());
//				status=ps.executeUpdate();
//			} catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			return status;
//			
//		}
		
		
		public static int Validate(String email,String password) throws SQLException
		{
			 int status=0;  
				User u = new User();
			    try{  
			        Connection con=getConnection();  
			        PreparedStatement ps=
		con.prepareStatement("select id from group025_campus.book_user where email=? and password=?");  
			       
			        ps.setString(1,email);  
			        ps.setString(2,password);  
			      
			        ResultSet rs=ps.executeQuery(); 
			       
			     if(rs.next())
			     {
			      status=rs.getInt("id");
			     }
			      
			      return status;  
			    }catch(Exception e){System.out.println(e);}  
			    return status;  
		}
		public static int save(User u) {
			int status=0;
			
			try {
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("insert into book_user(first_name,last_name,password,email,mobileNo) values(?,?,?,?,?)");
				ps.setString(1, u.getFirst_name());
				ps.setString(2, u.getLast_name());
				ps.setString(3, u.getPassword());
				ps.setString(4, u.getEmail());
				ps.setInt(5, u.getMobileNo());
				status=ps.executeUpdate();
			} catch(Exception e)
			{
				System.out.println(e);
			}
			return status;
			
		}
		public static List<User> getAllUsers()
		{
			
			List<User> list =new ArrayList<User>();
			try {
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("select * from  group025_campus.book_user");
				ResultSet rs =ps.executeQuery();
				while(rs.next())
				{User u = new User();
				System.out.println(rs.getInt(1));
					u.setId(rs.getInt(1));
					u.setFirst_name(rs.getString(2));
					u.setLast_name(rs.getString(3));
					u.setPassword(rs.getString(4));
					u.setEmail(rs.getString(5));
					u.setMobileNo(rs.getInt(6));
					list.add(u);
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}System.out.println(list);
			return list;
			
			
		}
//		public static int delete(int id)
//		{
//			 int status=0;  
//			    try{  
//			        Connection con=getConnection();  
//			        PreparedStatement ps=
//		con.prepareStatement("delete from users where id=?");  
//			        ps.setInt(1,id);
//			        status=ps.executeUpdate();  
//			    }catch(Exception e){System.out.println(e);}  
//			    return status;  
//			       
//		}
	}


