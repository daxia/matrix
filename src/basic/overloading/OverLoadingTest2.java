package basic.overloading;

public class OverLoadingTest2 {

	public static void main(String[] args) {
		new OverLoading();
		new OverLoading(5);
	}
}

/**
 * 
 * @description: ���Թ����������� 
 *
 * @package:  basic.overloading
 * @filename: OverLoadingTest2.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-12
 * @version:  v1.0
 */
class OverLoading {
	OverLoading() {
		System.out.println("overloading");
	}

	OverLoading(int i) {
		System.out.println("int: " + i);
	}
}