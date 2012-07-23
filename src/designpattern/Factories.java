package designpattern;
//工厂模式
//接口与实现接口的类，
//用户不用直接与实现接口的类联系，而是通过中间的工厂来联系

interface Car{
	void move();
}
interface CarFactory{
	Car getCar();
}

//小车
class LitterCar implements Car{
	public void move(){
		System.out.println("LitterCar start move!");
	}
}
class LitterCarFactory implements CarFactory{
	public Car getCar(){
		return new LitterCar();
	}
}
//打车
class BigCar implements Car{
	public void move(){
		System.out.println("Big Car start move!");
	}
}
class BigCarFactory implements CarFactory{
	public Car getCar(){
		return new BigCar();
	}
}
public class Factories {

	private static void man(CarFactory cf){
		Car c = cf.getCar();
		c.move();
	}
	public static void main(String[] args) {
		man(new BigCarFactory());
		man(new LitterCarFactory());
	}

}
