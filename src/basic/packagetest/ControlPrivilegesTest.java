package basic.packagetest;

public class ControlPrivilegesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test t = new Test();      //��class Test�Ĺ�����Ϊprivate��ʱ���޷�new ����ʼ��ʧ�ܣ�Ȩ�޲�����
		Test t = Test.createClass();
	}

}

class Test{
	private Test(){
		
	}
	
	public  static Test createClass(){
		return new Test();
	}
}