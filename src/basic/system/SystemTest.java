package basic.system;

/**
 * 
 * @description: ��ȡ���г����ϵͳ����Ϣ������
 *
 * @package:  basic.system
 * @filename: SystemTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-11
 * @version:  v1.0
 */
public class SystemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperties().list(System.out);  //��ʾ�����г����ϵͳ�л�ȡ������"����",�������ṩ������Ϣ
		
		System.out.println(System.getProperty("user.name"));//��ȡ���л�����Ϣ�е�һ��
		
		System.out.println(System.getProperty("java.runtime.name")); //��ȡ������Ϣ�е�һ��
		
		System.out.println(System.getProperty("java.library.path")); //��ȡ������Ϣ�е�һ��
		
	}

}
