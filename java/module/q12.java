package module;


import java.time.LocalDateTime;

import java.util.Calendar;




public class q12 {
 
	public static void main(String[] args) {
		
		
		System.out.println("time in hr: "+Calendar.AM_PM);
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println("week of month "+Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("local time"+LocalDateTime.now());
		System.out.println("my brithday:"+LocalDateTime.of(2023, 9, 7, 11, 30));
		
		
		System.out.println(LocalDateTime.MIN);
	}
}