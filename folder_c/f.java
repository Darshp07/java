package folder_c;

import java.io.File;
import java.io.IOException;

public class f {
	public static void main(String[] args) {
  
	File myfile = new File("E:\\vyani\\vyani2.pdf");
	try {
		System.out.println("your file is created:-"+myfile.createNewFile());
	} catch (IOException e) {
		System.out.println("this file is already created :_-");
		
		
	}
	
	}
}
