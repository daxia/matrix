package think_in_java_E4.chapter03_initialization.practices;

//practice14
//static initialization
public class Practice14_StaticInit {

	public static void main(String[] args) {
		System.out.println(StaticInit.str1);
		System.out.println(StaticInit.str2);
	}

}

class StaticInit {
	static String str1 = "str1";
	static String str2;
	static {
		str2 = "str2";
	}
}