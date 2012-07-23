package basic.enumtest;

/**
 * 
 * @description: Ã¶¾ÙºÍswitch 
 *
 * @package:  basic.enumtest
 * @filename: EnumSwitchTest1.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-15
 * @version:  v1.0
 */
public class EnumSwitchTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work work = new Work(Week.MON);
		Work work2 = new Work(Week.FRI);
		work.descript();
		work2.descript();
	}

}

enum Week {
	MON, TUS, WEN, TUR, FRI, SAT, SUN
}

class Work {

	Week WeekDay;

	public Work(Week WeekDay) {
		this.WeekDay = WeekDay;
	}

	public void descript() {
		// String s = "MON";
		System.out.println("today is :");
		switch (WeekDay) {
		case MON:
			System.out.println("yes, today is monday");
			break;
		case TUS:
			System.out.println("no , it's not TUS!");
			break;
		case WEN:
			System.out.println("no , it's not WEN!");
			break;
		case TUR:
			System.out.println("no , it's not TUR!");
			break;
		case FRI:
			System.out.println("no , it's not FRI!");
			break;
		case SAT:
			System.out.println("no , it's not SAT!");
			break;
		case SUN:
			System.out.println("no , it's not SUN!");
			break;
		default:
			System.out.println("wrong, wrong, ...");
		}
	}
}
