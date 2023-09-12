package Abstract;

public interface ATM {
	
		void withdraw(double amount);
		void deposit(double amount);
		void checkBalance();
	}

	class ChaseBankATM implements ATM{
		private double balance = 0;
		
		public void withdraw(double amount) {
			//this.balance = this.balance - amount;
			this.balance -= amount;
		}
		
		public void deposit(double amount) {
			//this.balance = this.balance + amount;
			this.balance += amount;
		}
		
		public void checkBalance() {
			System.out.println("Your balance is: " + this.balance);
		}
	}

	class BankOfAmericaATM implements ATM{
		private double balance = 0;
		
		public void withdraw(double amount) {
			this.balance = this.balance - amount;
		}
		
		public void deposit(double amount) {
			this.balance = this.balance + amount;
		}
		
		public void checkBalance() {
			System.out.println("The balance is: " + this.balance);
		}
		
	}