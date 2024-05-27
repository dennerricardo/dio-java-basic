package car;

public class Car extends Vehicle {
	
	public void turnOn() {
		verifyOil();
		verifyTruck();
		System.out.println("Turn On");
	}
	public void verifyOil() {
		System.out.println("Oil Checked");
	}
	public void verifyTruck() {
		System.out.println("Truck Checked");
	}
}
