package think_in_java_E4.chapter03_initialization.practices;

//practice9
//use this
public class Practice09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test t = new Test("String");
		t.method();
	}

}

class Test {
	public void method() {
		System.out.println("method()");
	}

	Test(int i) {
		System.out.println(i);
	}

	Test(String str) {
		this(5);   //"this()" must be on the begin in the constructor
		System.out.println(str);
	}
}
