//Flight Booking System: Create a Flight class with attributes for flight number and destination. Add a method to display flight information.
package sir;

class flight {
	String flight_num;
	String destination;

	void flightInfom(String flight_num, String destination) {

		this.destination = destination;
		this.flight_num = flight_num;

	}

	void display() {
		System.out.println("your flight num is :- " + flight_num + "\t" + "your destination is :- " + destination);

	}

	public flight(String flight_num, String destination) {
		this.destination = destination;
		this.flight_num = flight_num;
	}

	flight() {

	}
}

public class q10 {

	public static void main(String[] args) {

		flight F1 = new flight();
		F1.destination = "U.S.A";
		F1.flight_num = "A007";
		F1.display();
		flight F2 = new flight();
		F2.flightInfom("B121", "U.K");
		F2.display();
		flight F3 = new flight("DT012", "canada");
		F3.display();

	}
}
