package interfaces;

//����ģʽ  Factories
//��������ӿڵ�ʵ�ַ���
//дһ����ĳ�µ���A��Ȼ����дһ���ܹ��õ�A��ʵ������B�������C����ֱ�Ӵ���A��ʵ��������ͨ��B�õ�A��ʵ��
// A----B(����)-----C


interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

//����ʵ��1
class Implement1Service implements Service {
	public void method1() {
		System.out.println(" Implemetn1Service method1()");
	}

	public void method2() {
		System.out.println(" Implemetn1Service method2()");
	}

}

class ConcreteFactory1 implements ServiceFactory {
	public Service getService() {
		return new Implement1Service();

	}
}

//����ʵ��2
class Implement2Service implements Service{

	@Override
	public void method1() {
		System.out.println(" Implemetn2Service method1()");
	}

	@Override
	public void method2() {
		System.out.println(" Implemetn2Service method2()");
	}
	
}
class ConcreteFactory2 implements ServiceFactory {

	@Override
	public Service getService() {
		return new Implement2Service();
	}

}

public class Factories {
	
	static void Consumer(ServiceFactory sf) {
		Service s = sf.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args){
		Consumer(new ConcreteFactory1());
		Consumer(new ConcreteFactory2());

	}
}
