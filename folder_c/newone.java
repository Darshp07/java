package folder_c;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class newone {
public static void main(String[] args) throws IOException {
	 File myfile = new File("C:\\Users\\Keyur\\eclipse-workspace\\firstjava1\\src\\module\\q35.java");
	 try {
		 if(myfile.createNewFile()) {
			 System.out.println("creaded your file");
		 }else {
			 System.out.println("this file is not crated becase this file is already crated ");
		 }
	 }catch (Exception e) {
	 System.out.println("error in your code "+e);
	}
	 
	
}
}