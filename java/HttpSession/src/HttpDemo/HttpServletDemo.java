package HttpDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpServletDemo
 */
public class HttpServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HttpServletDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw  = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String name = request.getParameter("txtUsername");
		String password = request.getParameter("txtPassword");
		if(name.equals("admin")&& password.equals("1234"))
		{
			pw.print("welcome.html");
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
		}
		else
		{
			pw.print("Sorry!!!! Username is wrong");
			request.getRequestDispatcher("login.html").include(request, response);
		pw.close();
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
