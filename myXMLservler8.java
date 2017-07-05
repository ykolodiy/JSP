package eeetest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 8 using context object by tomcat  across all browsers

@WebServlet("/myXMLservler8")
public class myXMLservler8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String me = request.getParameter("me");
		
		
		
		
		
// this how create session		
HttpSession session = request.getSession();
// here we creating servlet context object

// this create comtext
ServletContext context = request.getServletContext();
//lets do null check
if(me !="" && me!=null) {
//me saved in session
   session.setAttribute("savedme", me);
   context.setAttribute("savedme", me);
}
   
		response.getWriter().println("hello " + me);
		response.getWriter().println("hello from session me " + (String) session.getAttribute("savedme"));
		// 8 print me across all browsers
		response.getWriter().println("hello from Context me " + (String) context.getAttribute("savedme"));
		
		}
		
		

	
	

}
