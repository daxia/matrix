package basic.This;

/**
 * 
 * @description:  this��ʹ�ã�
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
		System.out.println("�õ�ƻ��...");
		
		Apple peeledApple = apple.getPeeledApple();
		System.out.println("ƻ��������...!");
	}
}

class Apple {

/*	Apple() {
		System.out.println("get a apple...");
	}*/

	public Apple getPeeledApple() {
		Peeler peeler = new Peeler();
		System.out.println("��ʼ��ƻ��...");
		return peeler.peel(this);
		
	}
}

class Peeler {
	public Apple peel(Apple apple) {
		System.out.println("������ƻ��...");
		return apple;
	}
}
