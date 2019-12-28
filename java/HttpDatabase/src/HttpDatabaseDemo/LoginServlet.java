package HttpDatabaseDemo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		Employee e = new Employee();
		
		e.setEmpName(uname);
		e.setEmpPwd(password);
	
		boolean ans = false;
		
		try {
		ans = EmpDao.validate(e);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		if(ans==true)
		{
			pw.write("Login Sucessfull!");
			request.getRequestDispatcher("welcome.html").include(request, response);
		}
		else
		{
			pw.write("Please enter correct Username and Password");
			request.getRequestDispatcher("index.html").include(request, response);
		}//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
