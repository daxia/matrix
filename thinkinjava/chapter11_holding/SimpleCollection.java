package chapter11_holding;

import java.util.ArrayList;
import java.util.List;

//collection
// use the list :up change type
public class SimpleCollection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++){
			list.add(i);
		}
		for(Integer i : list){
			System.out.println(i);
		}
	}

}
