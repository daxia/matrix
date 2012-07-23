
public class InitTest2 {

	/**
	 * @param args
	 */
	static String str1 = "wang";

	public static void main(String[] args) {
		new Test1();
		System.out.println(str1);

	}
}

class Test1 {

	Test1() {
		String str = "shengzhong";
		System.out.println("str");
	}

	String str2 = "wang";

}
