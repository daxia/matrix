package container;

/**
 * ���в��� ��С�ɱ������ʵ�֣����ԣ����±꣬���ȿɱ䣬����ģ��Ƚ��ȳ��������ظ�
 * 
 * @author Administrator
 * 
 */
public class ArrayListTestTime {
	public static void main(String[] args) {
		// �������ж���
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();

		// ��ȡϵͳʱ��
		long t0 = System.currentTimeMillis();
		long t1 = System.currentTimeMillis();
		
		// װ��Ԫ��
		for (int i = 0; i < 100000; i++) {
			String str = "Ԫ��" + i;
			// ��Ԫ��װ�����,���Ƕ��о����˳���
			list.add(str);
		}
		list.add("Ԫ��0");

		
		// ����1����forѭ��
		for (int i = 0; i < list.size(); i++) {
			// ȡ��Ԫ��һ�Σ������һ��
			String str = list.get(i);
			System.out.println(str);
		}
		// ��������֮����ͳ��ʱ��
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1));
	}
}
