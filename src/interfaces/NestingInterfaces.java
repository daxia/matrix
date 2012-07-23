package interfaces;

//嵌套接口，类；
//类内部的内部内实现内部嵌套的接口
class A{
	interface B{
		public void f();
	}

	public class BImp implements B{
		public void f(){}
	}
	
	private class BImp2 implements B{
		public void f(){}
	}
	
	public interface C{
		public void f();
	}
	
	class CImp implements C{
		public void f(){}
	}
	
	private class CImp2 implements C{
		public void f(){}
	}
	
	public class CImp3 implements C{
		public void f(){}
	}
	
	//此接口不能被这个class之外的class实现
	private interface  D{
		public void f();
	}
	
	//class内部可以implements
	private class DImp implements D{
		public void f(){}
	}
	
	public class DImp2 implements D{
		public void f(){}
	}
	
	public D getD(){
		return new DImp2();
	}
	
	private D dRef;
	public void receivewD(D d){
		dRef = d;
		dRef.f();
	}
}

interface E{
//在接口里面嵌套接口时，嵌套的接口前不能加private修饰符
	interface G{
		void f();
	}
	public interface I{
		void f();
	}
	void g();
}

public class NestingInterfaces{
	public class BImp implements A.B{
		public void f(){}
	}
	class CImp implements A.C{

		public void f() {
			System.out.println("class CImp implements A.C");
		}
	}
	
	//修饰符为private的接口不能被implements
	
	class EImp implements E{
		public void g(){}
	}
	
	class EGImp implements E.G{
		public void f(){}
	}
	class EImp2 implements E{
		public void g(){}
		class EG implements E.G{
			public void f(){}
		}
	}
	
	public static void main(String[] args){
		A a = new A();
		A a2 = new A();
		a2.receivewD(a.getD());
	}
}



