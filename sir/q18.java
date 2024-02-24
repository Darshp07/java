package sir;

class ClassRoom{
	
	int Avelibelnumber = (int)(Math.random()*100);
	int EnrolNumber;
	
	public ClassRoom() {
		
	}
	ClassRoom(int EnrolNumber ){
		this.EnrolNumber=EnrolNumber;
	}
	
	 void reservSeat(int EnrolNumber) {
		 this.EnrolNumber=EnrolNumber;
	 }
	 
	 void display() {
		 if(Avelibelnumber == EnrolNumber) {
				System.out.println("EnrolNumber:"+EnrolNumber+" Avalible speace your enroll");
			}else{
				System.out.println("EnrolNumber:"+EnrolNumber+" not avalible speace your enroll");
			}
	 }
	
	
}
public class q18 {

 public static void main(String[] args) {

	 ClassRoom S1 = new ClassRoom();
		S1.EnrolNumber=34;
		S1.display();
		
		ClassRoom S2 =new ClassRoom();
		S2.reservSeat(66);
		S2.display();
		
		ClassRoom S3 =new ClassRoom(78);
		S3.display();
		S3.display();
}

}
