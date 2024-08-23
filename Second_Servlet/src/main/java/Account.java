
public class Account {

	private int AccountNumber;
	private String HolderName;
	private double Balance;
	
	//PSM+PGM+PPC+toString()
	public Account() {
		super();
		
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getHolderName() {
		return HolderName;
	}

	public void setHolderName(String holderName) {
		HolderName = holderName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public Account(int accountNumber, String holderName, double balance) {
		super();
		AccountNumber = accountNumber;
		HolderName = holderName;
		Balance = balance;
	}

	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", HolderName=" + HolderName + ", Balance=" + Balance + "]";
	}

}
