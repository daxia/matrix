package reusing;

/**
 * 
 * @description: 组合类
 * 
 * @package: basic.classtest
 * @filename: Car.java
 * @author: wangshengzhong
 * @ctime: 2012-7-16
 * @version: java编程思想 (E4) 137
 */
class Engine {
	public void start() {

	}

	public void rev() {

	}

	public void stop() {
	}

	public void service() {
	}
}

class Wheel {
	public void inflate(int i) {

	}
}

class Window {
	public void rollup() {

	}

	public void rolldown() {

	}
}

class Door {
	Window win = new Window();

	public void open() {

	}

	public void close() {

	}
}

public class Car {

	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door();
	public Door right = new Door();

	public Car() {
		for (int i = 1; i <= 4; i++) {
			wheel[i] = new Wheel();
		}
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.left.win.rollup();
		car.wheel[1].inflate(72);
		car.engine.start();
		car.engine.service();
	}

}
