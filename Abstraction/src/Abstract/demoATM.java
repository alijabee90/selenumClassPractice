package Abstract;

public class demoATM {

	public static void main(String[] args) {
		ChaseBankATM chase = new ChaseBankATM();
		chase.deposit(10000);
		chase.withdraw(2000);
		chase.checkBalance();
		
		BankOfAmericaATM boa = new BankOfAmericaATM();
		boa.deposit(300);
		boa.withdraw(50);
		boa.checkBalance();
	}

}
