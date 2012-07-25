package think_in_java_E4.chapter10_innerclasses;

//think in java(E4) 192P
public class DotThis {

	//内部�?
	class Inner {
		Inner(){
			System.out.println("Inner Constructor  " + this.getClass().toString());
		}
		public void doing() {
			System.out.print("");
		}
		//注意这个方法的返回类型：DoThis,不是Inner
		public DotThis outer(){
			return DotThis.this;  //这里的this返回的是外部�?
		}
	}

	// 很有意�?的地方，细细品味�?
	public Inner inner() {
		return new Inner();
	}
	
	//普�?method
	public void d(){
		System.out.println("DoThis.d()");
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		Inner inner = dt.inner();
		System.out.println(inner.outer().getClass().toString());
		inner.outer().d();
	}

}
