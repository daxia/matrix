package basic.args;

/**
 * 
 * @description: �ɱ����  String (java���˼�루4����������ϰ20) 
 *
 * @package:  basic.args
 * @filename: ArgsTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-15
 * @version:  v1.0
 */
public class ArgsTest {

	static void printVarargs(String...strings){
		for(String string: strings){
			System.out.print(string + " ");
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printVarargs("wang", "sheng", "zhong");
		printVarargs("");
	}

}
