package folder_c;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class miliintodate {

	public static void main(String[] args) {
		String fpath = "D:\\sample";
		File folder = new File(fpath);
		if (!folder.exists()) {
			if (folder.mkdir()) {
				System.out.println("created your folder");
			} else {
				System.out.println("this folder is not created");
			}
		} else {
			System.out.println("your folder is already exist !!");
		}

		long miloisecond = folder.lastModified();
		System.out.println(miloisecond);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:MM");
		String date = sdf.format(new Date(miloisecond));

		System.out.println("last modification file date and time:-" + date);
		File file = new File(folder, "java.text");
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("created your file !! ");
				} else {
					System.out.println("your file can't created !!");
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
