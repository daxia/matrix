package basic.array;

/**
 * 
 * @description:  数组的可变参数 
 *
 * @package:  basic.array
 * @filename: ArrayTest6.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-15
 * @version:  v1.0
 */
public class ArrayTest6 {

	//注意这个参数
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
		// 可变参数
		printArray(new Integer(5), new Float(2.2), "one");
		printArray("one", "two", "three");
		printArray(new ArrayTest6(), new ArrayTest6(), new ArrayTest6());
		printArray((Object[]) new Integer[]{1, 2, 3, 4});
		printArray();
	}

}
