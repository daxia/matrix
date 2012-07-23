package polymorphism;

/**
 * 
 * @description: 组合，构造器； 在继承的情况下构造器的初始化顺序
 * 
 * @package: polymorphism
 * @filename: ReferenceCounting.java
 * @author: wangshengzhong
 * @ctime: 2012-7-19
 * @version: v1.0
 */
class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing" + this);
		}
	}

	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;

	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}

	public String toString() {
		return "Composing " + id;
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();

		Composing[] composing = { new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared), new Composing(shared) };

		for (Composing com : composing) {
			com.dispose();
		}
	}
}
