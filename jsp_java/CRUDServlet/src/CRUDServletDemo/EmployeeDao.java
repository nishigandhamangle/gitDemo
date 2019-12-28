package CRUDServletDemo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDao {
	public static Connection getConnection() {
		Connection con= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
			con=DriverManager.getConnection("jdbc:mysql://192.168.100.26:3306/group025","group025","welcome");  
			System.out.println("Connection Established!!");
		} catch(Exception e1)
		{
			System.out.println(e1);
		}
		return con;
	}
	
	public static int save(Employee e) throws SQLException
	{
		int status =0;
		try {
		Connection con = EmployeeDao.getConnection();
			
		PreparedStatement ps = con.prepareStatement("insert into emp_crud (ename,password,email,country) values(?,?,?,?)");
		ps.setString(1,e.getEname());
		ps.setString(2,e.getPassword());
		ps.setString(3,e.getEmail());
		ps.setString(4,e.getCountry());
		 status = ps.executeUpdate();
		} catch(Exception e1)
		{
			System.out.println(e1);
		}
		return status;
	}
	
	public static List<Employee> getAllEmployee()
	{
		List <Employee> elist=new ArrayList<Employee>();
	
		try {
			Connection con = EmployeeDao.getConnection();	
			PreparedStatement ps = con.prepareStatement("select * from emp_crud");
			ResultSet rs= ps.executeQuery();
			
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setPassword(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				elist.add(e);
			}con.close();
		}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		return elist;
			
	}
	
	public static Employee getEmployeeById(int id) throws SQLException
	{Employee emp = new Employee();
		try {
		Connection con = EmployeeDao.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from emp_crud where id="+id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			
			emp.setId(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setPassword(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setCountry(rs.getString(5));
		}
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		return emp;
		
	}
	public static int Update(Employee e) throws SQLException {
		int status =0;
		System.out.println(e.getEname()+" "+e.getEmail());
		Connection con = EmployeeDao.getConnection();
		PreparedStatement ps = con.prepareStatement("update emp_crud set ename=?,password=?,email=?,country=? where id=?");
		ps.setString(1, e.getEname());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getCountry());
		ps.setInt(5, e.getId());
		return status = ps.executeUpdate();
		
	}
	
	public static int delete(int id)
	{
		int status=0;
		try {
			Connection con = EmployeeDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from emp_crud where id="+id);
			 status= ps.executeUpdate();
	}catch(Exception e1)
		{
		System.out.println(e1);
		}
		return status;

	
}
}
