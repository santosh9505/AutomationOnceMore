package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		
		Mobile phone = new Smartphone(); 
		//  whenever we have parent class reference for the child class object, 
	    //  we can only see those functions which are present in parent class
		//  but overridden will get call from child class
		
		phone.calling();
		phone.texting();
	}

}
