package basic.gc;

/**
 * 
 * @description: ������������GC ���� �� ��дfinalize���������Զ�����û�б�����
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
		new Book(true);  //��������
		System.gc();  //ǿ�Ȼ���
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
	 * ��дfinalize����
	 */
	protected void finalize() {
		if(this.checkedOut){
			System.out.println("Error: checkOut!");
		}
	}
}