package think_in_java._02_object;

import java.util.Calendar;
import java.util.Date;

public class HelloDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String s = c.getTime().toString();

		System.out.print(s);
	};
}
