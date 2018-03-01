package parkingTicketSimulation;

public class ParkingMeter {
	private int minutesPurchased;
	private int minutesParked;

	public ParkingMeter(int minutesPurchased, int minutesParked) {
		super();
		this.minutesPurchased = minutesPurchased;
		this.minutesParked = minutesParked;
	}

	public int getMinutesPurchased() {
		return minutesPurchased;
	}

	public void setMinutesPurchased(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}

	public int getMinutesParked() {
		return minutesParked;
	}

	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}

	public boolean isTicketable() {
		return minutesParked > minutesPurchased;
	}

	@Override
	public String toString() {
		return "ParkingMeter [minutesPurchased=" + minutesPurchased + ", minutesParked=" + minutesParked + "]";
	}
}
