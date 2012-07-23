package reusing;

/**
 * 
 * @description: 继承和组合 
 *
 * @package:  basic.classtest
 * @filename: Hide.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-16
 * @version:  java编程思想 (E4)  P135
 */
class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float c) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {

}

//子类的重载不影响父类的重载
class Bart extends Homer {
	void doh(Milhouse mil) {
		System.out.println("doh(Milhouse)");
	}
}

public class Hide {

	public static void main(String[] args) {
		Bart bart = new Bart();
		bart.doh(1);
		bart.doh('c');
		bart.doh(5.5f);
		bart.doh(new Milhouse());
	}

}
