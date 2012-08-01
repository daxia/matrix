package basic;

public class Short2Int {

	public static void main(String[] args) {
		ShortTest.short2Int();
		ShortTest.short2Int2();
	}

}

class ShortTest {
	static short s1 = 1;

	public static void short2Int() {
		// s1 = s1 + 1; this is wrong
		s1 = Short.parseShort(Integer.toString(s1 + 1));
		System.out.println(s1);
	}

	public static void short2Int2() {
		s1 += 1;
		
		System.out.println();
	}
}
