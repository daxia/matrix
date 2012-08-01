package chapter05_initialization.practices;

//java编程思想 第五章  练习 17,18,
//测试结果：只定义类数组的变量，而未实际创造数组对象，该对象的类不能初始化 

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
