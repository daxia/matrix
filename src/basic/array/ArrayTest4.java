package basic.array;

/**
 * 
 * @description: java编程思想 第五章  练习 17,18,
 * 				测试结果：只定义类数组的变量，而未实际创造数组对象，该对象的类不能初始化 
 *
 * @package:  basic.array
 * @filename: ArrayTest4.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-14
 * @version:  v1.0
 */
public class ArrayTest4 {

	ArrayTest4(String str){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr[] arr1;
		Arr[] arr2 = new Arr[]{new Arr("test1"), new Arr("test2"), new Arr("test3")};
	}

}

class Arr{
	Arr(String str){
		System.out.println("String : " + str);
	}
}
