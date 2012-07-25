package basic.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//calendar,
//the date is not use
public class HelloDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String s = c.getTime().toString();
		System.out.println(s);
		
		SimpleDateFormat sf = new SimpleDateFormat();
		System.out.println(sf.getCalendar().getTimeZone()); 
		System.out.println(sf.getCalendar().getTime()); 
		
		System.out.println(new Date());
		
	};
}
