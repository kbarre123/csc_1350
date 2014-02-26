
public class BankAccountTester {

	public static void main(String[] args) {
		// Client tester for the BankFunctions class.
		
		// Create new object.
		BankFunctions bob = new BankFunctions("Bob");
		
		// Get name.
		System.out.println("The owner of this account is named " + bob.getOwner() + ".");

		// Get initial balance.
		System.out.printf(bob.getOwner() + "'s initial account balance is $%.2f.\n", bob.getBalance());
		
		// Make first deposit.
		bob.deposit(1000);
		System.out.printf("After his first deposit of $1,000, %s's balance is now $%.2f.\n", bob.getOwner(), bob.getBalance());
		
		// Make first withdrawal.
		bob.withdrawal(500);
		System.out.printf("After his first withdrawal of $500, %s's balance is now $%.2f.\n", bob.getOwner(), bob.getBalance());
		
		// Make second withdrawal.
		bob.withdrawal(400);
		System.out.printf("After his second withdrawal of $400, %s's balance is now $%.2f.\n", bob.getOwner(), bob.getBalance());
	}

}
