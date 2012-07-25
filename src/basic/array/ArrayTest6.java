package basic.array;


//数组的可变参数 

public class ArrayTest6 {

	//注意这个参数
	static void printArray(Object...args){
		for(Object object:args){
			System.out.print(object + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 可变参数
		printArray(new Integer(5), new Float(2.2), "one");
		printArray("one", "two", "three");
		printArray(new ArrayTest6(), new ArrayTest6(), new ArrayTest6());
		printArray((Object[]) new Integer[]{1, 2, 3, 4});
		printArray();
	}

}
