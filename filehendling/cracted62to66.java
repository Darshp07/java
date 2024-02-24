
package filehendling;

import java.io.File;

import java.io.IOException;

public class cracted62to66 {

	public static void main(String[] args) throws IOException {

		for (int i = 62; i <= 66; i++) {
			File myfile = new File("C:\\Users\\Keyur\\eclipse-workspace\\firstjava1\\src\\q" + i + ".java");

			myfile.createNewFile();
			try {

				System.out.println("file created");
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
