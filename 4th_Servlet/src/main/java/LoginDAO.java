import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	
	private String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
	private String dbUser="Prabhakar";
	private String dbPwd="prabha225";
	private String dbDriver="oracle.jdbc.driver.OracleDriver";
	
	
	
	public boolean Login(LoginBean login)
	{
		
		Connection con=null;
		boolean status=false;
		
		String sql="select * from loginemp where username=? and password=?";
		
		PreparedStatement ps;
		try {
			
			Class.forName(dbDriver);
			con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		ps=con.prepareStatement(sql);
		ps.setString(1, login.getUsername());
		ps.setString(2, login.getPassword());
		
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public int Register(LoginBean r) {
		
		Connection con=null;
		int status=0;
		
		String sql="insert into loginemp values(?,?,?,?,?)";
		PreparedStatement ps;
		try {
			
			Class.forName(dbDriver);
			con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			ps=con.prepareStatement(sql);
			ps.setString(1, r.getUsername());
			ps.setString(2, r.getEmail());
			ps.setString(3, r.getPassword());
			ps.setString(4, r.getJobrole());
			ps.setLong(5, r.getContact());
			
			status=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
		return status;
	}

}
