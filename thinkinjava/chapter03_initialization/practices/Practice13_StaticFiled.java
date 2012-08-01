package chapter03_initialization.practices;

//practice13
//static filed

//the sequence of create object
// static variable---> general variable --->constructor

public class Practice13_StaticFiled {

	public static void main(String[] args) {
		Cups cups = new Cups();
		cups.cup1.f(5);
		cups.cup2.f(555);
	}

}

class Cups {
	int i;
	{
		i = 5;
		System.out.println(i);
	}
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("Cups");
	}
}

class Cup {
	Cup(int maker) {
		System.out.println("Cup(" + maker + ")");
	}

	void f(int i) {
		System.out.println("f(" + i + ")");
	}

}
