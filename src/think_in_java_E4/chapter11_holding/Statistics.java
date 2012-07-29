package think_in_java_E4.chapter11_holding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//map
public class Statistics {

	public static void main(String[] args) {
		Random ran = new Random(100);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int r = ran.nextInt(5);
		System.out.println(r);
		System.out.println(map);
		Integer it = map.get(r);
		System.out.println(it);
		map.put(r, it ==null ? 1 : it+1);
		System.out.println(map);
		
		
//		for(int i = 0; i < 10000; i++){
//			int ri = ran.nextInt(10);
//			Integer it = map.get(ri);
//			//System.out.println(map);
//			//System.out.println(map.get(ri));
//			map.put(ri, it == null ? 1 : it + 1);
//		}
//		System.out.println(map);
	}
}
