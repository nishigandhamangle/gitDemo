package HttpDatabaseDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String uname = request.getParameter("txtUsername");
		String password= request.getParameter("txtPassword");
		String email = request.getParameter("txtemail");
		String phone = request.getParameter("txtmobile");
		
		Employee e = new Employee();
		
		e.setEmpEmail(email);
		e.setEmpName(uname);
		e.setEmpPwd(password);
		e.setEmpPhone(phone);
		
		try {
		int status =EmpDao.save(e);
		if(status>0)
		{
			pw.write("Regitration Done!");
			
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else
		{
			pw.write("Registration Fail!");
			request.getRequestDispatcher("register.html").include(request, response);
		}
		} catch(Exception e1)
		{
			e1.printStackTrace();
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
