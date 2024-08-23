import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DAO {

	private String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
	private String dbUser="Prabhakar";
	private String dbPwd="prabha225";
	private String dbDriver="oracle.jdbc.driver.OracleDriver";
 
	
	
		
			public int insertData(Account acc) {
				
			int count=0;	
			
				try {
				Class.forName(dbDriver);
				
				Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
				
				int n = acc.getAccountNumber();
				String nm = acc.getHolderName();
				double ba = acc.getBalance();
				
				PreparedStatement st=con.prepareStatement("insert into Account values(?,?,?)");
				st.setInt(1, n);
				st.setString(2, nm);
				st.setDouble(3, ba);
					
				count=st.executeUpdate();
				
				con.close();
				}
				catch(Exception e) {
					System.out.println("Excception :"+e);
				}
				
				return count;
			}
			
			public int updateData(Account acc) {
				
				int count=0;
				try {
					Class.forName(dbDriver);
					
					Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
					
					int n = acc.getAccountNumber();
					String nm = acc.getHolderName();
					double ba = acc.getBalance();
					
					
					Statement st=con.createStatement();
					
					count=st.executeUpdate("update Account set  HOLDERNAME= ' "+nm+" ' set BALANCE = "+ba+" where ACCOUNTNUMBER="+n);
					
					if(count>0)
						System.out.println(count+" record updated....");
					else
						System.out.println("no record updated...");
				
					st.close();
					con.close();
					
					
				}
				catch(Exception e) {
					System.out.println("Exception: "+e);
				}
				
				
				return count;
			}
			
	public int DeleteRecord(Account acc) {
		
		try {
			Class.forName(dbDriver);
			
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			
			
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		return 0;
	}
			

}
