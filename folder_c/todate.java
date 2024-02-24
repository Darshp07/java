package folder_c;


import java.time.temporal.ChronoUnit;
import java.util.Date;

import copylist.convert;

public class todate {
	public static void main(String[] args) {

		long d1 = System.currentTimeMillis();
		System.out.println("current milisecond: "+d1+" ms");

		Date seconddate = new Date(1998, 9, 7);
		long d2 = seconddate.getTime();

		System.out.println("my birthday time miliseond: "+d2+" ms");

		long diffdate = d2-d1;
		System.out.println("after different of two date time milisecond: "+diffdate);
		
		long day = diffdate / (1000*60*60*24);
		
		System.out.println("days of two diff dates :"+day+" day");
	}
}
