package AfterClassReview;

interface account {
	void deposit();

	void withdraw();

}

class bankAccount implements account {

	public void deposit() {
		System.out.println(" $ 500 debosited to your account \n");

	}

	public void withdraw() {
		System.out.println("$ 20 has been withdraw from your accoun \n");

	}
}

class savingAccount implements account {

	public void deposit() {
		System.out.println(" YOU HAVE $0 IN YOU SAVING ACCOUNT");

	}

	public void withdraw() {
		System.out.println(" YOU TRANSACTION IS DECLINE YOU ARE BROKE ");

	}
}

class CurrentAccount implements account {
	public void deposit() {
		System.out.println("300$ was deposited to your CurrentAccount.");
	}

	public void withdraw() {
		System.out.println("70$ has been withdrawed from your CurrentAccount.");
	}
}
	
