package basic.gc;

/**
 * 
 * @description: ²âÊÔgc, login ×´Ì¬
 * 
 * @package: basic.gc
 * @filename: GCTest2.java
 * @author: wangshengzhong
 * @ctime: 2012-7-13
 * @version: v1.0
 */
public class GCTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new Bank(true);
		Bank bank2 = new Bank(true);
		new Bank(true);
		bank1.logOut();

//		System.gc();
		System.out.println("Try1:");
		System.runFinalization();
		System.out.println("Try2:");
		Runtime.getRuntime().runFinalization();
	}

}

class Bank {
	boolean loggedIn = false;

	Bank(boolean loginStatus) {
		loggedIn = loginStatus;
	}

	public void logIn() {
		loggedIn = true;
	}

	public void logOut() {
		loggedIn = true;
	}

	protected void finalize() {
		if (loggedIn) {
			System.out.println("The Status is login...");
		}
	}
}