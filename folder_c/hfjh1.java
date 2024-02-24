package folder_c;

import java.io.File;

public class hfjh1 {
    public static void main(String[] args) {
        
        String folderPath = "E:\\darsh";

       
        File folder = new File(folderPath);

        
        if (!folder.exists()) {
          
            boolean success = folder.mkdir();

            if (success) {
                System.out.println("Folder created successfully");
            } else {
                System.out.println("Failed to create the folder");
            }
        } else {
            System.out.println("The folder already exists");
        }
    }
}
