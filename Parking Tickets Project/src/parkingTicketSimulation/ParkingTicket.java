package parkingTicketSimulation;

import java.util.Date;

public class ParkingTicket {
	private Vehicle vehicle;
	private Cop cop;
	private Date date;

	public ParkingTicket(Vehicle vehicle, Cop cop, Date date) {
		super();
		this.vehicle = vehicle;
		this.cop = cop;
		this.date = date;
	}

	@Override
	public String toString() {
		return "ParkingTicket [vehicle=" + vehicle + ", cop=" + cop + ", date=" + date + "]";
	}

	/*
	 * public ParkingTicket issueTicket() {
	 * 
	 * }
	 */

}
