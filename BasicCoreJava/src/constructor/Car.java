package constructor;

public class Car {
	//instance 
	String model;
	String type;
	static int Wheels = 4;  // Class 
	int speed;
	
	
	// Constructor overloading 
	
	// Default Constructor : IF we do not parameterized constructor or 
	//user defined constructor then class object will always refer to default constructor, 
	//whenever we create class, default constructor is created
	
	public Car() // constructor should always have the name of class
	{
	
	}
	
	public Car(String model1, String type1, int speed1)
	{
		model = model1;
		type = type1;
		speed = speed1;
	}
	
	public void features()
	{
		System.out.println("Model="+model+", Type = "+type+", Wheels = "+Wheels+", speed ="+speed);
	}

}

// we use constructor to call the object 