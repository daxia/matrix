package think_in_java_E4.chapter11_holding;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//set
public class SetOfInteger {

	public static void main(String[] args) {
		Random ran = new Random(100);
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set.add(ran.nextInt(10));
		}
		System.out.print(set.toString());
	}

}
