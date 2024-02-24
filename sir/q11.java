package sir;

class MovieTherter{
	
	int seat = (int)(Math.random()*100);
	int AvaliberSeat;
	
	public MovieTherter() {
		
	}
	MovieTherter(int AvaliberSeat ){
		this.AvaliberSeat=AvaliberSeat;
	}
	
	 void reservSeat(int AvaliberSeat) {
		 this.AvaliberSeat=AvaliberSeat;
	 }
	 
	 void display() {
		 if(seat == AvaliberSeat) {
				System.out.println("Avaliber your seat:");
			}else{
				System.out.println("not avaliber this seat:");
			}
	 }
	
	
}
public class q11 {

	public static void main(String[] args) {
		
		MovieTherter S1 = new MovieTherter();
		S1.AvaliberSeat=34;
		S1.display();
		
		MovieTherter S2 =new MovieTherter();
		S2.reservSeat(66);
		S2.display();
		
		MovieTherter S3 =new MovieTherter(78);
		S3.display();
		
	}

}
