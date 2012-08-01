package chapter11_holding;

import java.util.Arrays;
import java.util.LinkedList;

//LinkedList
public class SimpleLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(5);
		ll.remove();

		ll.add(11);
		ll.removeFirst();

		ll.add(99);
		ll.addFirst(55);

		ll.addAll(Arrays.asList(111, 222, 333, 444));
		System.out.print("LinkedList : " + ll.toString());
		
		System.out.println();
		System.out.println("ll.getFirst() : " + ll.getFirst());
		System.out.println("ll.getLast() : "+ll.getLast());
		
		System.out.println("ll.element() : " + ll.element());
		
		System.out.println("ll.removeLast() : "+ll.removeLast());
		
	}

}
