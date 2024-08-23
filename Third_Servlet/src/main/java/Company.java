
public class Company {

	private String CompanyId;
	private String ComanyName;
	private String CompanyAddress;
	private String ComapnyTechnology;
	private double ComanyRevenue;
	private String CompanyFounder;
	
	
	//PSM+PGM+PDC+toString
	
	public Company() {
		super();
	}


	public String getCompanyId() {
		return CompanyId;
	}


	public void setCompanyId(String companyId) {
		CompanyId = companyId;
	}


	public String getComanyName() {
		return ComanyName;
	}


	public void setComanyName(String comanyName) {
		ComanyName = comanyName;
	}


	public String getCompanyAddress() {
		return CompanyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}


	public String getComapnyTechnology() {
		return ComapnyTechnology;
	}


	public void setComapnyTechnology(String comapnyTechnology) {
		ComapnyTechnology = comapnyTechnology;
	}


	public double getComanyRevenue() {
		return ComanyRevenue;
	}


	public void setComanyRevenue(double comanyRevenue) {
		ComanyRevenue = comanyRevenue;
	}


	public String getCompanyFounder() {
		return CompanyFounder;
	}


	public void setCompanyFounder(String companyFounder) {
		CompanyFounder = companyFounder;
	}


	public Company(String companyId, String comanyName, String companyAddress, String comapnyTechnology,
			double comanyRevenue, String companyFounder) {
		super();
		CompanyId = companyId;
		ComanyName = comanyName;
		CompanyAddress = companyAddress;
		ComapnyTechnology = comapnyTechnology;
		ComanyRevenue = comanyRevenue;
		CompanyFounder = companyFounder;
	}
	
}
