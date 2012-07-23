package basic.array;

import java.util.*;

/**
 * 
 * @description: 创建基本对象数组     
 *
 * @package:  basic.array
 * @filename: ArrayTest2.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-14
 * @version:  v1.0
 */
public class ArrayTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(50);
		Integer[] a = new Integer[rand.nextInt(20)];
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(200);

		}
		System.out.println(Arrays.toString(a));
	}

}
