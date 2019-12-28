package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class bookdao {
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
	public static List<book> getAllUsers()
	{
		
		List<book> list =new ArrayList<book>();
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from group025_bookstore.book");
			ResultSet rs =ps.executeQuery();
			
			while(rs.next())
			{book b=new book();
				b.setBkid(rs.getInt(1));
				b.setBname(rs.getString(2));
				b.setPrice(rs.getInt(3));
				b.setPath(rs.getString(4));
				
				list.add(b);
				
				
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println(list);
		return list;
		
	}
	public static int save(book b,int id) {
		int status=0;
		
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into group025_bookstore.books(bkid,bname,price,id) values(?,?,?,?)");
			ps.setInt(1, b.getBkid());
			ps.setString(2, b.getBname());
			ps.setDouble(3, b.getPrice());
			ps.setInt(4, id);
			
			status=ps.executeUpdate();
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
		
	}
	public static List<book> getAllbook()
	{
		book u = new book();
		List<book> list =new ArrayList<book>();
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("select * from group025_bookstore.bookdetail");
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				u.setBkid(rs.getInt(1));
				u.setBname(rs.getString(2));
				u.setPrice(rs.getInt(3));
				
				
				list.add(u);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
		
	}
	public static int saveBooke(book b) {
		int status=0;
		
		try {
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into group025_bookstore.books(book_id,book_name,author,price,path) values(?,?,?,?,?)");
			//PreparedStatement ps=con.prepareStatement("insert into group025_bookstore.book(bkid,bname,price,path) values(?,?,?,?)");
			ps.setInt(1, b.getBkid());
			ps.setString(2, b.getBname());
			ps.setString(3, b.getAuthor());
			ps.setDouble(4, b.getPrice());
			ps.setString(5, b.getPath());
			
			status=ps.executeUpdate();
			System.out.println(b.getBname());
			System.out.println(b.getAuthor());
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public static int delete(String name)
	{
		 int status=0;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=
	con.prepareStatement("delete from   group025_bookstore.books where book_name=?");  
		        ps.setString(1,name);
		        status=ps.executeUpdate();  
		    }catch(Exception e){System.out.println(e);}  
		    return status;  
		       
	}

}
