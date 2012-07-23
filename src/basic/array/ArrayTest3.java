package basic.array;

import java.util.Arrays;

/**
 * 
 * @description: 新的创建数组的方法 
 *
 * @package:  basic.array
 * @filename: ArrayTest3.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-14
 * @version:  v1.0
 */
public class ArrayTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {new Integer(1), new Integer(2) , 3};  //新的创建数组的方式
		Integer[] b = new Integer[]{new Integer(1), new Integer(2), 3};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
