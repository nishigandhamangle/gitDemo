package CRUDServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		List <Employee> list = EmployeeDao.getAllEmployee();
		pw.print("<html><body><h1>List of Employees</h1><table border='1'>");
		pw.print("<tr><td>Name</td><td>Email</td><td>Country</td></tr>");
		for( Employee e:list)
		{
		pw.print("<tr><td>"+e.getEname()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td><td><a href='UServlet?id="+e.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td></tr>");
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
