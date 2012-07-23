package polymorphism;

/**
 * 
 * @description:  类，多层继承，构造器
 *
 * @package:  polymorphism
 * @filename: Sandwich.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-19
 * @version:  v1.0
 */
class Meal{
	Meal(){
	System.out.println("Meal()");
	}
}

class Bread{
	Bread(){
	System.out.println("Bread()");
	}
}

class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}

class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch{
	PortableLunch(){
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch{
	private Bread bd = new Bread();
	private Cheese ch = new Cheese();
	private Lettuce lt= new Lettuce();
	public Sandwich(){
		System.out.println("Sandwich");
	}
	public  static void main(String[]	args){
		new Sandwich();
	}
}