package eeetest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myXMLservler")
public class myXMLservler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String me = request.getParameter("me");
		String id = request.getParameter("id");
		//response.getWriter().println("hello " + me +" with id " +id);
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("u");
		String fullname = request.getParameter("fullname");
		String prof = request.getParameter("prof");
		//String location = request.getParameter("location");
		//if more than 1 option use request.getParameterValues and array
		String [] location = request.getParameterValues("location");
		out.println ("hello from post " +username +" "+fullname+" " +prof+" "+location.length);
		for (int i=0; i<location.length; i++) {out.println(location[i]);}
		}
		
		
		
		
		
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String username = request.getParameter("u");
	String fullname = request.getParameter("fullname");
	String prof = request.getParameter("prof");
	//String location = request.getParameter("location");
	//if more than 1 option use request.getParameterValues and array
	String [] location = request.getParameterValues("location");
	out.println ("hello from post " +username +" "+fullname+" " +prof+" "+location.length);
	for (int i=0; i<location.length; i++) {out.println(location[i]);}
	}
	
	

}
