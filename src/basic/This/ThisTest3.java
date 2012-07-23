package basic.This;

public class ThisTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisTest3().test1();
	}

	private int i = 5;

	public void test1() {
		test2(10);
		test2(this.i);
	}

	public void test2(int i) {
		System.out.println(i);
	}
}
