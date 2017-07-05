package eeetest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 7 here we creating session object to remember user https://www.youtube.com/watch?v=GbvuAIhLUZU&index=7&list=PLE0F6C1917A427E96#t=883.241428

@WebServlet("/myXMLservler7")
public class myXMLservler7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String me = request.getParameter("me");
		
		
		
		
		
// this how create session		
HttpSession session = request.getSession();

//lets do null check
if(me !="" && me!=null) {
//me saved in session
   session.setAttribute("savedme", me);
}
   
		response.getWriter().println("hello " + me);
		response.getWriter().println("hello from session me " + (String) session.getAttribute("savedme"));
		
		}
		
		

	
	

}
