package basic.This;

/**
 * 
 * @description:  this的使用：
 *
 * @package:  basic.This
 * @filename: ThisTest2.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-13
 * @version:  v1.0
 */
public class ThisTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person boy = new Person();
		Apple apple = new Apple();
		boy.eat(apple);
	}
}

class Person {

	public void eat(Apple apple) {
		System.out.println("拿到苹果...");
		
		Apple peeledApple = apple.getPeeledApple();
		System.out.println("苹果削好了...!");
	}
}

class Apple {

/*	Apple() {
		System.out.println("get a apple...");
	}*/

	public Apple getPeeledApple() {
		Peeler peeler = new Peeler();
		System.out.println("开始削苹果...");
		return peeler.peel(this);
		
	}
}

class Peeler {
	public Apple peel(Apple apple) {
		System.out.println("正在削苹果...");
		return apple;
	}
}
