package reusing;

class Animal{
	String str = "Animal";
	public void append(String s){
		str += s;
	}
	
	public void eat(){
		append(".eat()");
	}
	public void drink(){
		append(".drink()");
	}
	public void shout(){
		append(".shout()");
	}
	public String toString(){
		return str;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.drink();
		animal.eat();
		animal.shout();
		System.out.println(animal);
	}
}

/**
 * 
 * @description:  继承 ，extends
 *
 * @package:  basic.classtest
 * @filename: ExtendTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-16
 * @version:  v1.0
 */
public class ExtendTest extends Animal{

	//重写
		public void eat(){
			append("--Dog.eat()");
			super.eat();   //调用父类
		}
		
		public void move(){
			append("--Dog.move()");
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExtendTest et = new ExtendTest();
		et.eat();
		et.drink();
		et.shout();
		et.move();
		System.out.println(et);
		System.out.println("test base class:");
		Animal.main(args);   //Animal类直接调用静态方法main()
	}

}
