package basic.This;

/**
 * 
 * @description: this的用法
 * 
 * @package: basic.This
 * @filename: ThisTest.java
 * @author: wangshengzhong
 * @ctime: 2012-7-13
 * @version: v1.0
 */
public class ThisTest {

	private int i = 10;

	//加了void后就不是构造器了
	public void ThisTest(){
		System.out.println("测试构造器加void");  
	}
	ThisTest(int i) {

		this.i = i + 1;
		// 从这里可以看出来：i和this.i是不一样的
		System.out.println("i : " + i + "; this.i :" + this.i);
	}

	ThisTest(String str) {
		System.out.println("String :" + str);
	}

	ThisTest(int i, String str) {
		this(str);

		System.out.println("两个参数的构造器： this.i : " + this.i); // this.i是已经定义好的类的成员变量
	}

	public ThisTest increment() {
		this.i++;
		return this;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt0 = new ThisTest(1);
		ThisTest tt1 = new ThisTest("test");
		ThisTest tt2 = new ThisTest(5, "test");
		System.out.println(tt0.increment().increment().increment().i);
		
		tt0.ThisTest();  //这个是方法，不是构造器，构造器是在类实例化的时候自动调用了
	}

}
