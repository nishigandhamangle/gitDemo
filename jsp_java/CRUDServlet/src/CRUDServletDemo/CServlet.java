package CRUDServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CServlet
 */
public class CServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	String name= request.getParameter("ename");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	String country = request.getParameter("country");
	
	Employee e = new Employee();
	e.setEname(name);
	e.setPassword(password);
	e.setEmail(email);
	e.setCountry(country);
	
	int status=0;
		try {
			 status = EmployeeDao.save(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(status>0)
		{
			pw.print("<p>REcord is saved successfully!!");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else
		{
			pw.print("Sorry!Could not add employee");
		}
	pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
