package Eventhandling;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
	 * @see HttpServlet#doGet(HttpServletRequest request,
	 *  HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException,
	IOException {
	PrintWriter pw = response.getWriter();
	
	String uname = request.getParameter("txtUsername");
	String pwd = request.getParameter("txtPassword");
	
	if(uname.equals("admin") && pwd.equals("1234"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("welcomeSet");
		rd.forward(request, response);
	
	}
	else
	{
		pw.write("Sorry for invalid username and password!");
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		rd.include(request, response);
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
