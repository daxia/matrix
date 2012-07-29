package container;

import java.util.HashSet;
import java.util.Set;

//union set  ����
//����

public class UnionSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> c1 = new HashSet<String>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		System.out.println("c1: " + c1);

		Set<String> c2 = new HashSet<String>();
		c2.add("d");
		c2.add("e");
		c2.add("a");
		c2.add("c");
		System.out.println("c2: " + c2);

		Set<String> cu = new HashSet<String>(c1); //
		System.out.println("cu: " + cu);

		//����
		cu.addAll(c2);
		System.out.println("������ " + cu);
		
		
		//����
		Set<String> cm = new HashSet<String>(c1); //
		cm.retainAll(c2);
		System.out.println("������  " + cm);

	}

}
