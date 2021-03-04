package oops.abstraction;

public abstract class MsWord {

	public abstract void save();
	public abstract void edit();
	public abstract void paste();
	public abstract void print();
	public abstract void copy();
	public abstract void cut();
	
	// can't create a object for abstract class
	// this helps to hide the implementation from the user buy using abstraction class and interfaces
}
