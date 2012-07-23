package basic.Static;

class Table {
	static Bowl bowl1 = new Bowl("bowl 1");

	Table() {
		System.out.println("构造器Table");
		bowl2.test("bowl2.test()");
	}

	public void test(String marker) {
		System.out.println("table test()" + marker);
	}
	
	static Bowl bowl2 = new Bowl("bowl 2");
}

class Cupboard {
	Bowl bowl3 = new Bowl("bowl 3");
	static Bowl bowl4 = new Bowl("bow1 4");

	Cupboard() {
		System.out.println("Cupboard构造器 ");
		bowl4.test("bowl4.test()");
	}

	public void test(String marker) {
		System.out.println("cupboard test(): " + marker);
	}

	static Bowl bowl5 = new Bowl("bowl 5");
}

class Bowl {
	Bowl(String marker) {
		System.out.println("Bowl构造器： " + marker);
	}

	public void test(String marker) {
		System.out.println("Bowl test():" + marker);
	}
}

/**
 * 
 * @description:  初始化的顺序：变量（包含对象引用变量，基本对象变量，静态变量），然后是构造器
 *
 * @package:  basic.Static
 * @filename: StaticInitializationTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-13
 * @version:  v1.0
 */
public class StaticInitializationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Create new Cupboard in main");
		new Cupboard();
		System.out.println("Create new Cupboard in main");
		new Cupboard();
		table.test("table.test()");
	}

	static Table table = new Table();
	static Cupboard cup = new Cupboard();
}
