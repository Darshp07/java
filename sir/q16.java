package sir;

class Plant {

	String Species;
	String fraquency;

	Plant() {

	}

	Plant(String Species, String fraquency) {
		this.fraquency = fraquency;
		this.Species = Species;

	}

	void Watering(String Species, String fraquency) {
		this.fraquency = fraquency;
		this.Species = Species;

	}

	void display() {
		System.out.println("Plant name:-" + Species + "\twatering:-" + fraquency);
	}
}

public class q16 {

	public static void main(String[] args) {

		Plant P1 = new Plant();
		P1.fraquency = "6.00 A.M to 7.00 A.M";
		P1.Species = "Rose";
		P1.display();

		Plant P2 = new Plant();
		P2.Watering("Lotus", "7.30 A.M to 8.00 A.M");
		P2.display();

		Plant P3 = new Plant("sunflower", "1.00 P.M to 3.00 P.M");
		P3.display();
	}

}
