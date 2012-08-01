package chapter11_holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//adding groups of elements to Collection objects
public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3,
				4, 5));
		Integer[] moreInts = { 21, 22, 23, 24 };
		c.addAll(Arrays.asList(moreInts));
		Collections.addAll(c, 12, 13, 14, 15);
		Collections.addAll(c, moreInts);
		for (Integer i : c) {
			System.out.print(i + " ");
		}
System.out.println();
		List<Integer> list = Arrays.asList(22, 55, 66, 88, 99);
		list.set(1, 99);   //set: update the element £º22,99,66,88,99
		for(Integer i: list){
			System.out.println(i + " ");
		}
	}

}
