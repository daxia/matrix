package basic.array;

/**
 * 
 * @description: java���˼�� ������  ��ϰ 17,18,
 * 				���Խ����ֻ����������ı�������δʵ�ʴ���������󣬸ö�����಻�ܳ�ʼ�� 
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
