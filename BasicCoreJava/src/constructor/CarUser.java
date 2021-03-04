package constructor;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(); /// non static will have copies of virtual memory and static will have one memory
	    car1.model = "Maruti";
        car1.speed = 120;
	    car1.type="Petrol";
		car1.Wheels=4; //preffered method to call is car.Wheels /Object is instance of a call
			
			car1.features();
			
			Car car2 = new Car();
			car2.model = "Ford";
			car2.speed = 150;
			car2.type="Diesel";
			car2.Wheels=4;
			
			car2.features();
			
			Car car3 = new Car();
			car3.model = "Kia";
			car3.speed = 180;
			car3.type="Petrol";
			car3.Wheels=4;
			
			car3.features();
					
	}

}
