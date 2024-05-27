package car;

public class Circuit {
	public static void main(String[] args) {
		Car jeep = new Car();
		jeep.turnOn();
		jeep.setMotorId("3423890");
		
		Motocycle z400 = new Motocycle() ;
		z400.setMotorId("239498");
		z400.turnOn();
		System.out.println(z400.getMotorId());
				
	}
}
