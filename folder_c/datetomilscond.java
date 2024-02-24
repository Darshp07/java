package folder_c;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class datetomilscond {
	public static void main(String[] args) {
		Date date = new Date(1998, 9, 7);
		long milisecond = date.getTime();
		System.out.println(milisecond);

		System.out.println(date.getHours());
	}
}
