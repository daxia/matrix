package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateString2Date {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		String str = "2012-1-1"; // the String must be a date String
		Date date = java.text.DateFormat.getDateInstance().parse(str);
		System.out.println(date);

		// two
		String str2 = "3.5.2012";
		SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.yy");
		Date date2 = format2.parse(str2);
		System.out.println(date2);
		
		//three
		String str3 ="2012-5-3 6:50:22";
		SimpleDateFormat format3 = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		Date date3 = format3.parse(str3);
		System.out.println(date3);
	}

}
