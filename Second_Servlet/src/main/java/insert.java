

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

	int num=Integer.parseInt(request.getParameter("acnum"));
	String name=request.getParameter("name");
	double bal=Double.parseDouble(request.getParameter("bal"));
	
	Account acc=new Account();
	
	acc.setAccountNumber(num);
	acc.setHolderName(name);
	acc.setBalance(bal);
	
	
	DAO obj=new DAO();
	
	int x=obj.insertData(acc);
	
	if(x>0)
	{
		response.sendRedirect("successs.html");
	}
	else
		response.sendRedirect("failed.html");
	
	}

}
