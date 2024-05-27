package car;

public abstract class Vehicle {
	private String motorId;
	
	public String getMotorId() {
		return motorId;
	}
	public void setMotorId(String motorId) {
		this.motorId = motorId;
	}
	
	public abstract void turnOn();

}
