package folder_c;

import java.io.FileWriter;
import java.io.IOException;

public class extra {
	public static void main(String[] args) throws IOException {

		try {
			FileWriter F = new FileWriter("G:\\new\\dars.text");
			F.write("this is public class");
			System.out.println("written succesfully");

		} catch (Exception e) {
			System.out.println("some error " + e);
		}
	}
}
