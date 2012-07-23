package basic.gc;

/**
 * 
 * @description: 垃圾回收器：GC 测试 ； 重写finalize方法，测试对象有没有被回收
 *
 * @package:  basic.gc
 * @filename: GCTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-13
 * @version:  v1.0
 */
public class GCTest {
	public static void main(String[] args) {
//		Book book = new Book(true);
//		book.checkIn();
		new Book(true);  //创建对象
		System.gc();  //强迫回收
	}
}

class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		this.checkedOut = checkOut;
	}

	void checkIn() {
		this.checkedOut = false;
	}

	/**
	 * 重写finalize方法
	 */
	protected void finalize() {
		if(this.checkedOut){
			System.out.println("Error: checkOut!");
		}
	}
}