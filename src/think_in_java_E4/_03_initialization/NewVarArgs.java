package think_in_java_E4._03_initialization;

/**
 * 
 * @description:  ����Ŀɱ���� 
 *
 * @package:  think_in_java_E4._03_initialization
 * @filename: NewVarArgs.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-15
 * @version:  v1.0
 */
public class NewVarArgs {

	//ע���������
	static void printArray(Object...args){
		for(Object object:args){
			System.out.print(object + " ");
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ɱ����
		printArray(new Integer(5), new Float(2.2), "one");
		printArray("one", "two", "three");
		printArray(new NewVarArgs(), new NewVarArgs(), new NewVarArgs());
		printArray((Object[]) new Integer[]{1, 2, 3, 4});
		printArray();
	}

}
