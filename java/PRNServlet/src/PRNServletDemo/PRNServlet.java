package PRNServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PRNServlet
 */
public class PRNServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PRNServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		Integer prn = Integer.parseInt(request.getParameter("prn"));
		
		Student s1 = new Student();
		
		try
		{
			s1=PRNDao.validate(prn);
		} catch(Exception e1)
		{
			System.out.println(e1);
		}
		if(s1!=null)
		{
			int t=s1.getS1()+s1.getS2()+s1.getS3();
			pw.print("<h3>PRN Found!!</h3>");
			pw.print("<table border='1' width='100%'");
			pw.print("<tr><td>PRN</td><td>Name</td><td>subject1</td><td>subject2</td><td>subject3</td><td>Total</td></tr>");
			pw.print("<tr><td>"+s1.getPrn()+"</td><td>"+s1.getName()+"</td><td>"+s1.getS1()+"</td><td>"+s1.getS2()+"</td><td>"+s1.getS3()+"</td>"+t+"</tr>");
		}
		else
		{
			pw.print("Sorry No Record found!!");
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
