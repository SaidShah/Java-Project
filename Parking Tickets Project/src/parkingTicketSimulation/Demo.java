package parkingTicketSimulation;

public class Demo {

	public static void main(String[] args) {
		Cop c1 = new Cop("8745H", "john smith", new ParkingMeter(25, 45));
		Cop c2 = new Cop("5798H", "john smith", new ParkingMeter(45, 36));
		Cop c3 = new Cop("9658H", "john smith", new ParkingMeter(35, 36));

		Vehicle v1 = new Vehicle("Ford", "HGT7635");
		Vehicle v2 = new Vehicle("Chevy", "ADE5635");


		TicketBag tbag = new TicketBag(3);
		ParkingTicket t = c1.issueTicket(v1);

		//if (t != null) {
		if(true) {
			tbag.addTicket(t);
		}
		t = c2.issueTicket(v2);

		//if (t != null) {
			if(true) {
			tbag.addTicket(t);
		}

		t = c3.issueTicket(v2);

		if (t != null) {
			tbag.addTicket(t);
			tbag.addTicket(t);
			tbag.addTicket(t);
			tbag.addTicket(t);
			tbag.addTicket(t);
			tbag.addTicket(t);
		}

		tbag.displayFull();
	}

}
