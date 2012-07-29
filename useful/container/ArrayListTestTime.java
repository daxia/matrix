package container;

/**
 * 队列测试 大小可变数组的实现：线性，有下标，长度可变，有序的（先进先出），可重复
 * 
 * @author Administrator
 * 
 */
public class ArrayListTestTime {
	public static void main(String[] args) {
		// 创建队列对象
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();

		// 获取系统时间
		long t0 = System.currentTimeMillis();
		long t1 = System.currentTimeMillis();
		
		// 装入元素
		for (int i = 0; i < 100000; i++) {
			String str = "元素" + i;
			// 将元素装入队列,于是队列就有了长度
			list.add(str);
		}
		list.add("元素0");

		
		// 遍历1：用for循环
		for (int i = 0; i < list.size(); i++) {
			// 取出元素一次，就输出一次
			String str = list.get(i);
			System.out.println(str);
		}
		// 遍历完了之后再统计时间
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1));
	}
}
