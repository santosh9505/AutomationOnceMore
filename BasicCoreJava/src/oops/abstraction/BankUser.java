package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		// BankUser b = new BankUser();
	    
	bankFeatures(new HDFC());
	bankFeatures(new ICICI());
	bankFeatures(new RBL());
		
	
		
	}

	
	public static void bankFeatures(RBI ref)
	{
		ref.savingAccount();
		ref.creditCard();
		ref.currentAccount();
		ref.debitCard();
	}
}
