package interfaces;

//Ƕ�׽ӿڣ��ࣻ
//���ڲ����ڲ���ʵ���ڲ�Ƕ�׵Ľӿ�
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
	
	//�˽ӿڲ��ܱ����class֮���classʵ��
	private interface  D{
		public void f();
	}
	
	//class�ڲ�����implements
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
//�ڽӿ�����Ƕ�׽ӿ�ʱ��Ƕ�׵Ľӿ�ǰ���ܼ�private���η�
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
	
	//���η�Ϊprivate�Ľӿڲ��ܱ�implements
	
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



