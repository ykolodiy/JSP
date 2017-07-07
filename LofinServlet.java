package amazon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import amazon.dto.User;
import amazon.service.LoginService;


@WebServlet("/login")
public class LofinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login, password;
		
		login = request.getParameter("userId");
		password =  request.getParameter("userPass");
		
		//pass login and pass to business service class
		LoginService loginService = new LoginService ();
		
		boolean result = loginService.authenticate(login, password);
		
		if (result) {
			User user = loginService.getuserdetails(login);
			
			//lets save user object in this session
			request.setAttribute("user", user);
			/*redirect second request
			response.sendRedirect("success.jsp");
			*/
			//or server can do hidden redirect using req dispatcher
			
			RequestDispatcher  dispatch = request.getRequestDispatcher("success.jsp");
			dispatch.forward(request, response);
			
			return;
		}
		
		else {response.sendRedirect("login.jsp");return;}
		
		
	}

}
