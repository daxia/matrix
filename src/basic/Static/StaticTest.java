package basic.Static;

/**
 * 
 * @description: static 变量，是建立一个单一的类的存储变量数据的空间
 *
 * @package:  basic.Static
 * @filename: StaticTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-11
 * @version:  v1.0
 */
public class StaticTest {

	static int i = 47;
	public static void  main(String[] args){
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(StaticTest.i);
	}
}

/*class Incrementable{
	static int i = 47;
}*/