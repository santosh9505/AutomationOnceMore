package oops.abstraction;

public class RBL implements RBI {

	public void savingAccount() {
		System.out.println("RBL Saving Account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("RBL Saving Account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("RBL debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("RBL credit card");
		
	}

}
