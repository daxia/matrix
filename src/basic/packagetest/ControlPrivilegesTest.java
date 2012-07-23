package basic.packagetest;

public class ControlPrivilegesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test t = new Test();      //在class Test的构造器为private的时候，无法new （初始化失败，权限不够）
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