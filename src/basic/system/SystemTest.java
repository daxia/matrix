package basic.system;

/**
 * 
 * @description: 获取运行程序的系统的信息或属性
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
		System.getProperties().list(System.out);  //显示从运行程序的系统中获取的所有"属性",它向你提供环境信息
		
		System.out.println(System.getProperty("user.name"));//获取所有环境信息中的一项
		
		System.out.println(System.getProperty("java.runtime.name")); //获取环境信息中的一项
		
		System.out.println(System.getProperty("java.library.path")); //获取环境信息中的一项
		
	}

}
