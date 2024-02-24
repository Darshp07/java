//Email Sender Class: Write an Email class with sender and recipient attributes. Implement a method to send the email
package sir;

class Email{
	
	String Sender;
	String Recipient;
	
	public Email() {
		
	}
	Email(String sender, String Recipient){
		this.Recipient= Recipient;
		this.Sender= sender;
	}
	void Send(String sender , String Recipitent) {
		this.Recipient= Recipitent;
		this.Sender= sender;
		
	}
	void display() {
		System.out.println("send by:"+Sender+"\t"+"recive by:"+Recipient);
		
	}
}
public class q15 {

	public static void main(String[] args) {
		
		Email E1=new Email();
		E1.Sender="darshakp81@gmail.com";
		E1.Recipient="topstecho07@gmail.com";
		E1.display();
		Email E2=new Email();
		E2.Send("patelDex007@gmial.com", "drashpatel77@gmail.com");
		E2.display();
		Email E3= new Email("darshup07@gmail.com","pateld0709@gmail.com");
		E3.display();
	}

}
