package basic.Static;

/**
 * 
 * @description: static �������ǽ���һ����һ����Ĵ洢�������ݵĿռ�
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