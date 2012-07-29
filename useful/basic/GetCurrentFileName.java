package basic;

public class GetCurrentFileName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = Thread.currentThread().getStackTrace()[1]
				.getFileName();
		System.out.println(fileName);
	}

}
