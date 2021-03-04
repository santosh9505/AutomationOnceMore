package oops.inheritance;

public class User {

	public static void main(String[] args) {
		
		Telephone telephone = new Telephone();
		telephone.calling();
		
		Mobile mobile = new Mobile();
		mobile.calling();
		mobile.texting();
		
		Smartphone smartphone = new Smartphone();
		
		smartphone.calling();
		smartphone.texting();
		smartphone.videoCalling();

	}

}
