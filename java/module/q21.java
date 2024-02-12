//Create a class to print an integer and a character with two methods having the same 
//name but different sequence of the integer and the character parameters. 
package module;

class intandchar {

	int n;
	char ch;

	void display(int n, char ch) {
		this.ch = ch;
		this.n = n;
		System.out.println("your num is:" + n + "\t" + "your char is:" + ch);
	}

	void display(char ch, int n) {
		this.ch = ch;
		this.n = n;
		System.out.println("your char is:" + ch + "\t" + "your num is:" + n);
	}

}

public class q21 {
	public static void main(String[] args) {
		intandchar i = new intandchar();
		i.display(77, 'T');

		i.display('D', 007);
		;

	}

}
