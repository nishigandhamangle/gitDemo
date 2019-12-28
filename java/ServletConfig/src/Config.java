

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Context
 */
@WebServlet(
		urlPatterns = { "/Context" }, 
		initParams = { 
				@WebInitParam(name = "uname", value = "admin"), 
				@WebInitParam(name = "password", value = "1234")
		})
public class Config extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		///response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter pw=response.getWriter();
	ServletConfig config = getServletConfig();
	
	Enumeration<String> e = config.getInitParameterNames();
	while(e.hasMoreElements())
	{
		String str = e.nextElement();
		pw.print("name:"+str);
		pw.print("value:"+config.getInitParameter(str));
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
