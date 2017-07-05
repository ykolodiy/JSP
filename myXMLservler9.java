package eeetest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// making variable by default using init parameters

@WebServlet(urlPatterns = {"/myXMLservler9"}, initParams= {@WebInitParam(name="default", value="Suka")})
public class myXMLservler9 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String me = request.getParameter("me");
		
		
		
		
		
// this how create session		
HttpSession session = request.getSession();
// here we creating servlet context object

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
		//9
		response.getWriter().println("hello from init Default= " + this.getServletConfig().getInitParameter("default") );
		
		
		
		}
		
		

	/* 
	 *  u can use xml instead of annotation to make default param
	 * 
	 * <?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">
  <display-name>JSPprokject</display-name>

<servlet>
<servlet-name>XMLServlet</servlet-name>
<servlet-class>nf.co.eeetest.XMLServlet</servlet-class>
<init-param>
<param-name>  default   </param-name>
<param-name>  suka   </param-name>
</init-param>



</servlet>

<servlet-mapping>
<servlet-name>XMLServlet</servlet-name>
<url-pattern>/m</url-pattern>
</servlet-mapping>



</web-app>
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	

}
