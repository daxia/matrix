package reusing;

class Art{
	public Art(){
		System.out.println("Art Constructor��");
	}
}
class Drawing extends Art{
	public Drawing(){
		System.out.println("Drawing Constructor!");
	}
}
/**
 * 
 * @description: �̳еĻ����ʼ�� ˳�򣬣��������ϲ�Ļ��࿪ʼ���³�ʼ��
 *
 * @package:  basic.classtest
 * @filename: Drawing.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-16
 * @version:  v1.0
 */
public class Catoon extends Drawing{

	public Catoon(){
		System.out.println("Catoon Constructor!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Catoon ct = new Catoon();
	}

}
