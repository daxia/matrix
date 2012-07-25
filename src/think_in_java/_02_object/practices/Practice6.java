package think_in_java._02_object.practices;

//static ¾²Ì¬
public class Practice6 {

	static Test t;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		t = new Test();
		t.method();
		t.method();
		Test test = new Test();

		test.method();

	}

}

class Test {
	private int i = 5;

	Test() {
		System.out.println(i++);
	}

	public void method() {
		System.out.println(i++);
	}
}
