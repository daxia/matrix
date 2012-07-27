package think_in_java_E4.chapter10_innerclasses;

//inherit inner class
class A{
	class B{
		
	}
}
class C extends A.B{
	// if "C(){}" --it won't compile
	C(A a){
		a.super();
	}
}
public class InheritInner {

	public static void main(String[] args) {
		A a =new A();
		C c  = new C(a);
	}

}
