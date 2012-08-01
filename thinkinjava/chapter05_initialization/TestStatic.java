package chapter05_initialization;

//static test
public class TestStatic {
	
	TestStatic() {
		TS ts2 = new TS();
		ts2.method();
		System.out.println("wang");
	}

	public static void main(String[] args) {
		new TestStatic();
		TS ts = new TS();
		ts.method();
	}

}

class TS {
	static int i = 5;
	static {
		i++;
	}

	TS() {

		System.out.println(i);
	}

	void method() {

	}
}