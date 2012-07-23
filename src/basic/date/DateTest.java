package basic.date;

import java.text.SimpleDateFormat;

/**
 * utf -8
 * @description: �����ǰʱ��
 * @package: basic.date
 * @filename: Date.java
 * @author: wangshengzhong
 * @ctime: 2012-7-11
 * @version: v1.0
 */
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * �����Date��java.util.Date������Ҫע�⣬�кü������ж���Date
		 */
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(date);
		System.out.println(time);
	}

}
