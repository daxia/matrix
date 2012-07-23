package interfaces;

//工厂模式  Factories
//将代码与接口的实现分离
//写一个干某事的类A，然后再写一个能够拿到A的实例的类B；别的类C不是直接创建A的实例，而是通过B拿到A的实例
// A----B(工厂)-----C


interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

//具体实现1
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

//具体实现2
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
