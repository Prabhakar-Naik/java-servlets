import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CompanyDAO {

	private String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
	private String dbUser="Prabhakar";
	private String dbPwd="prabha225";
	private String dbDriver="oracle.jdbc.driver.OracleDriver";
 
	
	
		
			public int insertData(Company cmp) {
				
			int count=0;	
			
				try {
				Class.forName(dbDriver);
				
				Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
				
				String cmpID = cmp.getCompanyId();
				String cmpName = cmp.getComanyName();
				String cmpAddress=cmp.getCompanyAddress();
				String cmpTech=cmp.getComapnyTechnology();
				String cmpFounder=cmp.getCompanyFounder();
				double cmpRevenue = cmp.getComanyRevenue();
				
				
				PreparedStatement st=con.prepareStatement("insert into Companies values(?,?,?,?,?,?)");
				st.setString(1, cmpID);
				st.setString(2, cmpName);
				st.setString(3, cmpAddress);
				st.setString(4, cmpTech);
				st.setDouble(5, cmpRevenue);
				st.setString(6, cmpFounder);
				
				count=st.executeUpdate();
				
				con.close();
				}
				catch(Exception e) {
					System.out.println("Excception :"+e);
				}
				
				return count;
			}
			
			public int updateData(Company cmp) {
				int count=0;
				
				try {
					Class.forName(dbDriver);
					
					Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
					
					while(true) {
					
					//Statement st=con.createStatement();
					//String UPDATE="UPDATE companies SET CompanyID=?, CompanyName=?, CompanyAddress=?, CompanyTechnology=?, CompanyRevenue=?, CompanyFounder=? WHERE CompanyID=?";
					PreparedStatement ps = con.prepareStatement("UPDATE companies SET(?,?,?,?,?,?) where CompanyId=?");
					 
		            ps.setString(1, cmp.getCompanyId());
		            ps.setString(2, cmp.getComanyName());
		            ps.setString(3, cmp.getCompanyAddress());
		            ps.setString(4, cmp.getComapnyTechnology());
		            ps.setDouble(5, cmp.getComanyRevenue());
		            ps.setString(6, cmp.getCompanyFounder());
		            
		           count= ps.executeUpdate();
		            ps.close();
		 
		            
		           // System.out.println("User with id " + cmp.getCompanyId() + " was updated in DB with following details: " + cmp.toString());
					con.close();
					}
					
					}
					catch(Exception e) {
						System.out.println("Excception :"+e);
					}
				
				return count;
			}
			
}
