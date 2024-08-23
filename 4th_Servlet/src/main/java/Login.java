

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("uname");
		String paswd=request.getParameter("upwd");
		
		
		LoginBean login=new LoginBean();
		
		
		login.setUsername(user);
		login.setPassword(paswd);
		
		
		LoginDAO logindao=new LoginDAO();
		
		logindao.Login(login);
		
		if(logindao.Login(login)) {
			response.sendRedirect("LoginSuccess.html");
		}
		else {
			response.sendRedirect("failed.html");
		}
		
		
		
		
	}

}
