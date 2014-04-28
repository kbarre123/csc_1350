
public class BankFunctions {
	
	// Initial balance.
	private double balance;
	private String owner;
	
	// Constructor
	public BankFunctions(String name) {
		this.balance = 0;
		this.owner = name;
	}
	
	// Get owner name.
	public String getOwner() {
		return owner;
	}

	// Get balance.
	public double getBalance() {
		return balance;
	}
	
	// Make a deposit.
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	// Make a deposit.
		public void withdrawal(double amount) {
			balance = balance - amount;
		}

}
