package chapter11_holding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//QueueDemo.java

public class QueueDemo {
	public static void printQ(Queue queue) {
		while (queue.peek() != null) {
			System.out.println(queue.remove() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(555);
		queue.addAll(Arrays.asList(5, 6, 7, 2, 4));
		
		System.out.println(queue.peek());  //get the first elements ,but not  remove it;
		
		boolean contain = queue.contains(555);
		System.out.println(queue);
		
		System.out.println(contain);
		// Random rand = new Random(47);
		// for (int i = 0; i < 10; i++) {
		// queue.offer(rand.nextInt(i + 10));
		// }
		// System.out.println(queue);
		// Queue<Character> qc = new LinkedList<Character>();
		// for (char c : "Brontosaurus".toCharArray()) {
		// qc.offer(c);
		// }
		// System.out.println(qc);
	}
}