

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateCompany")
public class updateCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public updateCompany() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String cmpid=request.getParameter("cid");
		String cmpname=request.getParameter("cname");
		String cmpaddr=request.getParameter("caddr");
		String cmptech=request.getParameter("ctech");
		double cmprevenue=Double.parseDouble(request.getParameter("crev"));
		String cmpfounder=request.getParameter("cfound");
		
		Company cmp=new Company();
		
		cmp.setCompanyId(cmpid);
		cmp.setComanyName(cmpname);
		cmp.setCompanyAddress(cmpaddr);
		cmp.setComapnyTechnology(cmptech);
		cmp.setComanyRevenue(cmprevenue);
		cmp.setCompanyFounder(cmpfounder);
		
		CompanyDAO dao=new CompanyDAO();
		int x=dao.updateData(cmp);
		
		if(x>0)
			response.sendRedirect("success.html");
		else
			response.sendRedirect("failed.html");
		
		
		
	}

}
