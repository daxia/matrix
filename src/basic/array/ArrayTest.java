package basic.array;

import java.util.*;

/**
 * 
 * @description:  ��������
 * 
 * @package: basic.array
 * @filename: ArrayTest.java
 * @author: wangshengzhong
 * @ctime: 2012-7-14
 * @version: v1.0
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		Random rand = new Random(50);    
		a = new int[rand.nextInt(20)];  //�������Ԫ��λ�����
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
	/*	for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}*/
	}

}
