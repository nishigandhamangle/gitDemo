

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendRedirect
 */
@WebServlet("/SendRedirect")
public class SendRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SendRedirect() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		String str=request.getParameter("str");
		String engine=request.getParameter("engine");
		try
		{
			if(str.trim().length()==0)
			{
				throw new Exception();
			}
			else if(engine==null)
			{
				throw new Exception();
			}
			String url="";
			if(engine.equals("google"))
			{
				url="https://www.google.com/search?safe="+str;
			}
			if(engine.equals("yahoo"))
			{
				url="https://in.search.yahoo.com/search?p="+str;
			}
			if(engine.equals("bing"))
			{
				url="https://www.bing.com/search?q="+str;
			}
			response.sendRedirect(url);
		}
		catch(Exception e)
		{
			response.sendRedirect("error.html");
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
