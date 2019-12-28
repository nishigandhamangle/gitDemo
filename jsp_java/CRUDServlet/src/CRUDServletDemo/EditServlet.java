package CRUDServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Integer id=Integer.parseInt(request.getParameter("id"));
		String ename=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		Employee e=new Employee();
		e.setId(id);
		e.setEname(ename);
		e.setPassword(password);
		e.setCountry(country);
		e.setEmail(email);
int status=0;
try {
	status = EmployeeDao.Update(e);
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
if(status>0)
{
	   response.sendRedirect("ViewServlet");  
}else{  
    pw.println("Sorry! unable to update record");  
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
