package designpattern;
// factory design pattern
// our codes(main)---factory----service

//interface
interface Car{
	void move();
}

interface CarFactory{
	Car getCar();
}

//concrete1: LitterCar
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

//concrete2: BigCar
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
