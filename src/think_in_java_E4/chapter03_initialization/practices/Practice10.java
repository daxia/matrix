package think_in_java_E4.chapter03_initialization.practices;

//practice10,11
//gc(), finalize()
public class Practice10 {

	public static void main(String[] args) {
		TestP10 tp = new TestP10(true);
		tp.finalize();
		System.gc();

	}

}

class TestP10 {
	boolean checkOut = false;

	TestP10(boolean checkOut) {
		this.checkOut = checkOut;
	}

	public void finalize() {
		if (checkOut) {
			System.out.println("Error: " + this.getClass().toString()
					+ " checkOut!");
		}
	}

}
