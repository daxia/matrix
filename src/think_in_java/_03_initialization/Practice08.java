package think_in_java._03_initialization;

//practice8
//this
public class Practice08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.test1();
	}

}

class ThisTest {
	public void test1() {
		test2();
		this.test2();
	}

	public void test2() {
		System.out.println("test2()");
	}
}
