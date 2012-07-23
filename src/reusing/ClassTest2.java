package reusing;

class A{
	A(String str){
		System.out.println("A Constructor!");
	}
}
class B{
	
}
class C extends A{
	C(String str){
		super(str);
		System.out.println("C Constructor!");
	}
	B b = new B();
}
public class ClassTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C("wang");
	}

}
