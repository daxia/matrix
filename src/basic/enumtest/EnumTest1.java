package basic.enumtest;

/**
 * 
 * @description: enum(ö��) 
 *
 * @package:  basic.enumtest
 * @filename: EnumTest1.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-15
 * @version:  v1.0
 */
public class EnumTest1 {

	public enum Test{
		ONE, TWO
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test test = Test.ONE;
		System.out.println(test);
		
		//��ӡ ˳��(ordinal)
		for(Test test1: Test.values()){
			System.out.println(test1 + " ordinal : " + test1.ordinal());
		}
		
	}

}
