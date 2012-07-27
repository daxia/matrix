package think_in_java_E4.chapter11_holding;

//simple container example
//{ThrowException}
import java.util.ArrayList;

class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Orange {
}

public class AppleAndOrangesWithoutGenerics {
	//@SuppressWarnings("unchecked")   //annotation
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		// Not prevented from adding an Orange to apples
		//apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			//the apples has two kinds of object
			apples.get(i).id();  // Orange is detected only at run time
			System.out.println((apples.get(i)).id());
			
		}
	}
}
