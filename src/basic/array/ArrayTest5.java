package basic.array;

//practice18
//object array
// �ɱ�����б� 

public class ArrayTest5 {

	public static void printArray(Object[] args){
		//for����һ���÷�
		for(Object obj: args ){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printArray(new Object[]{new Integer(5), new Float(2.2), 3});
		printArray(new Object[]{"one", "two", "three"});
		printArray(new Object[]{new ArrayTest5(), new ArrayTest5(), new ArrayTest5()});
	}

}
