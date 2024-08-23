package firstPro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First_Servlet")
public class First_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public First_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String mail=request.getParameter("mail");
		String address=request.getParameter("addr");
		long phone=Long.parseLong(request.getParameter("call"));
		
		out.println("<h2>Name: "+name+"</h2>");
		out.println("<h2>Password: "+pwd+"</h2>");
		out.println("<h2>Mail: "+mail+"</h2>");
		out.println("<h2>Address: "+address+"</h2>");
		out.println("<h2>PhoneNumber: "+phone+"</h2>");
		
		
//		if(name.equalsIgnoreCase(name))
//			response.sendRedirect("success.html");
//		else
//			response.sendRedirect("failed,html");
//		
		
	}
}
