package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");      
	       PrintWriter pwriter = response.getWriter();                
	       String name=request.getParameter("uname");      
	       String pass=request.getParameter("upass");                
	       if(name.equals("Deepa") && 
	          pass.equals("1234"))
	       {          
	          RequestDispatcher dis=request.getRequestDispatcher("welcome");          
	          dis.forward(request, response);      
	       }     
	       else
	       {      
	          pwriter.print("User name or password is incorrect!");          
	          RequestDispatcher dis=request.getRequestDispatcher("index.html");          
	          dis.include(request, response);                                
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
