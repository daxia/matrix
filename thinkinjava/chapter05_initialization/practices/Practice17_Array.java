package chapter05_initialization.practices;

//java���˼�� ������  ��ϰ 17,18,
//���Խ����ֻ����������ı�������δʵ�ʴ���������󣬸ö�����಻�ܳ�ʼ�� 

public class Practice17_Array {

	Practice17_Array(String str) {

	}

	public static void main(String[] args) {
		Arr[] arr1 = new Arr[]{};
		Arr[] arr2 = new Arr[] { new Arr("test1"), new Arr("test2"),
				new Arr("test3") };
	}

}

class Arr {
	Arr(String str) {
		System.out.println("String : " + str);
	}
}
