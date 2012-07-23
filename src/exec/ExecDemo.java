package exec;

/**
 * 
 * @description: ����exec���÷����˴�����������windows�µ�notepad(���±�)����
 * 
 * @package: exec
 * @filename: ExecDemo.java
 * @author: wangshengzhong
 * @ctime: 2012-7-13
 * @version: v1.0
 */
class ExecDemo {
	public static void main(String args[]) {
		Runtime rt = Runtime.getRuntime();
		Process p = null;
		try {
			p = rt.exec("notepad");
			p.waitFor();
		} catch (Exception e) {
			System.out.println("Error executing notepad......");
		}
		System.out.println("Notepad returned " + p.exitValue());
	}
}
