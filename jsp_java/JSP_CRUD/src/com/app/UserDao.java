package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class UserDao {
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
	
	public static int save(User u) {
		int status=0;
		
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into users(uname,password,email,country) values(?,?,?,?)");
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getCountry());
			status=ps.executeUpdate();
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
		
	}
	
	public static List<User> getAllUsers()
	{
		User u = new User();
		List<User> list =new ArrayList<User>();
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from users");
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				u.setId(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setCountry(rs.getString(5));
				list.add(u);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
		
	}
	public static User getUserById(int id) throws SQLException
	{
		User u = new User();
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users where id="+id);
		ResultSet rs=ps.executeQuery();
		u.setId(rs.getInt(1));
		u.setUname(rs.getString(2));
		u.setPassword(rs.getString(3));
		u.setEmail(rs.getString(4));
		u.setCountry(rs.getString(5));
		
		return u;
	}
	public static int update(User u) throws SQLException
	{
		 int status=0;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=
	con.prepareStatement("update users set uname=?,password=?,"
			+ "email=?,country=? where id=?");  
		        ps.setInt(5,u.getId());
		        ps.setString(1,u.getUname());  
		        ps.setString(2,u.getPassword());  
		        ps.setString(3,u.getEmail());  
		        ps.setString(4,u.getCountry());  
		          
		        status=ps.executeUpdate();  
		    }catch(Exception e){System.out.println(e);}  
		    return status;  
	}
	public static int delete(int id)
	{
		 int status=0;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=
	con.prepareStatement("delete from users where id=?");  
		        ps.setInt(1,id);
		        status=ps.executeUpdate();  
		    }catch(Exception e){System.out.println(e);}  
		    return status;  
		       
	}
}
