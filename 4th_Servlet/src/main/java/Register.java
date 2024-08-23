

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("uname");
		String mail=request.getParameter("mail");
		String paswd=request.getParameter("upwd");
		String role=request.getParameter("role");
		long phone=Long.parseLong(request.getParameter("num"));
		
		LoginBean register=new LoginBean();
		
		register.setUsername(user);
		register.setEmail(mail);
		register.setPassword(paswd);
		register.setJobrole(role);
		register.setContact(phone);
		
		
		LoginDAO registerdao=new LoginDAO();
		
		int n=registerdao.Register(register);
		
		if(n>0)
			response.sendRedirect("SRegister.html");
		else
			response.sendRedirect("FRegister.html");
		
	}

}
