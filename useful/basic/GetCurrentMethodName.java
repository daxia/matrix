package basic;

public class GetCurrentMethodName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

}
