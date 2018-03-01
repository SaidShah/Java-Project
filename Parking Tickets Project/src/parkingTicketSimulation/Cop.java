package parkingTicketSimulation;

import java.util.Date;

public class Cop {
	private String badgeNumber;
	private String name;
	private ParkingMeter parkingMeter;

	public Cop(String badgeNumber, String name, ParkingMeter parkingMeter) {
		super();
		this.badgeNumber = badgeNumber;
		this.name = name;
		this.parkingMeter = parkingMeter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ParkingMeter getParkingMeter() {
		return parkingMeter;
	}

	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = parkingMeter;
	}

	public String getBadgeNumber() {
		return badgeNumber;
	}
	
	public boolean shouldTicket() {
		return parkingMeter.getMinutesParked() > parkingMeter.getMinutesPurchased(); 
		
	}
	
	public ParkingTicket issueTicket(Vehicle v) {
		return parkingMeter.isTicketable() ? new ParkingTicket(v, this, new Date()) : null;
	}

	@Override
	public String toString() {
		return "Cop [badgeNumber=" + badgeNumber + ", name=" + name + ", parkingMeter=" + parkingMeter + "]";
	}

}
