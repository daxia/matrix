package basic.This;

/**
 * 
 * @description: this���÷�
 * 
 * @package: basic.This
 * @filename: ThisTest.java
 * @author: wangshengzhong
 * @ctime: 2012-7-13
 * @version: v1.0
 */
public class ThisTest {

	private int i = 10;

	//����void��Ͳ��ǹ�������
	public void ThisTest(){
		System.out.println("���Թ�������void");  
	}
	ThisTest(int i) {

		this.i = i + 1;
		// ��������Կ�������i��this.i�ǲ�һ����
		System.out.println("i : " + i + "; this.i :" + this.i);
	}

	ThisTest(String str) {
		System.out.println("String :" + str);
	}

	ThisTest(int i, String str) {
		this(str);

		System.out.println("���������Ĺ������� this.i : " + this.i); // this.i���Ѿ�����õ���ĳ�Ա����
	}

	public ThisTest increment() {
		this.i++;
		return this;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt0 = new ThisTest(1);
		ThisTest tt1 = new ThisTest("test");
		ThisTest tt2 = new ThisTest(5, "test");
		System.out.println(tt0.increment().increment().increment().i);
		
		tt0.ThisTest();  //����Ƿ��������ǹ�������������������ʵ������ʱ���Զ�������
	}

}
