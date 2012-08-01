package chapter05_initialization.practices;

// practice2
//the difference from String define
public class Practice02 {

	static String str;
	String strCon;
	public Practice02() {
		strCon = "string init in constructor";
	}

	public static void main(String[] args) {
		System.out.println(str);
		Practice02 p2 = new Practice02();
		System.out.println(p2.strCon);
	}

}
