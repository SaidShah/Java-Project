package parkingTicketSimulation;

public class Vehicle {
	private String make;
	private String liscensePlate;
	public Vehicle(String make, String liscensePlate) {
		super();
		this.make = make;
		this.liscensePlate = liscensePlate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getLiscensePlate() {
		return liscensePlate;
	}
	public void setLiscensePlate(String liscensePlate) {
		this.liscensePlate = liscensePlate;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", liscensePlate=" + liscensePlate + "]";
	}

}
