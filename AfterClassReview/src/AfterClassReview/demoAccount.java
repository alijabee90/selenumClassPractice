package AfterClassReview;

public class demoAccount {

	public static void main(String[] args) {
		
		account account1 = new bankAccount();
		account account2 = new savingAccount();
		account account3 = new CurrentAccount();
		
		account1.deposit();
		account1.withdraw();
		
		account2.deposit();
		account2.withdraw(); 
		
		 
		account3.deposit();
		account3.withdraw();

	}

}
