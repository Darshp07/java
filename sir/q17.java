package sir;

class Playlist {

	String title;

	public Playlist() {

	}

	Playlist(String title) {
		this.title = title;

	}

	void music(String title) {
		this.title = title;
	}

	void display() {
		System.out.println("playing the song of: " + title);
	}
}

public class q17 {
	public static void main(String[] args) {
		Playlist P1 = new Playlist();
		P1.title = "Ram ayege";
		P1.display();
		Playlist P2 = new Playlist();
		P2.music("bharat ma jove have bhagwo laheray");
		P2.display();
		Playlist P3 = new Playlist("are oo dhwarpalo");
		P3.display();

	}

}
