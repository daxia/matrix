package chapter10_innerclasses;

//innnerclasses/Callbacks.java
//Using inner class for callback

interface Incrementable {
	void increment();
}

// Very simple to just implement the interface:
class Callee1 implements Incrementable {
	private int i = 0;

	public void increment() {
		i++;
		System.out.print(i);
	}
}

class MyIncrement {
	public void increment() {
		System.out.println();
	}

	static void f(MyIncrement mi) {
		mi.increment();
	}
}

//
class Callee2 extends MyIncrement {
	private int i = 0;

	public void increment() {
		i++;
		System.out.println(i);
	}

	//
	private class Closure implements Incrementable {
		public void increment() {
			//special out-class method, 
			//otherwise you'd get an  infinite recursion
			System.out.println(Callee2.this.getClass().toString());
			Callee2.this.increment();
		}
	}

	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller {
	private Incrementable callbackReference;

	Caller(Incrementable cbh) {
		callbackReference = cbh;
	}

	void go() {
		callbackReference.increment();
	}
}

public class Callbacks {
	public static void main(String[] args){
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
		
	}
}
