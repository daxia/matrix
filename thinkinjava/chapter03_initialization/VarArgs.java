package chapter03_initialization;

/**
 * 
 * @description: �ɱ�����б� 
 *
 * @package:  think_in_java_E4._03_initialization
 * @filename: VarArgs.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-15
 * @version:  v1.0
 */
public class VarArgs {

	public static void printArray(Object[] args){
		//for����һ���÷�
		for(Object obj: args ){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printArray(new Object[]{new Integer(5), new Float(2.2), 3});
		printArray(new Object[]{"one", "two", "three"});
		printArray(new Object[]{new VarArgs(), new VarArgs(), new VarArgs()});
	}

}
