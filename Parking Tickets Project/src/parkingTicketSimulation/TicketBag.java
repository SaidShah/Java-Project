package parkingTicketSimulation;

public class TicketBag {
	private ParkingTicket[] tickets;
	private int nElems;

	public TicketBag(int maxSize) {
		super();
		tickets = new ParkingTicket[maxSize];
	}

	public void addTicket(ParkingTicket t) {
		if (nElems == tickets.length) {
			doubleArray();
		} else if (t != null) {
			tickets[nElems] = t;
			nElems++;
		}
	}

	private void doubleArray() {
		ParkingTicket[] temp = tickets;
		tickets = new ParkingTicket[tickets.length * 2];
		for (int i = 0; i < temp.length; i++) {
			 tickets[i]=temp[i];
		}
	}
	
	private void trim() {
		ParkingTicket[] temp = tickets;
		tickets = new ParkingTicket[nElems];
		for(int i = 0; i < nElems;i++) {
			 tickets[i]=temp[i];
		}
	}


	
	public void displayFull() {
		trim();
		for (int i = 0; i < tickets.length; i++) {
			System.out.println(tickets[i]);
		}
	}
	public void displayTickets() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(tickets[i]);
		}
	}

}
