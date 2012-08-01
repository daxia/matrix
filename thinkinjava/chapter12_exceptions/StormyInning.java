package chapter12_exceptions;

//Overridden methods may throw only the exceptions
//specified in their base-class versions, or exceptions
//derived from the base-class exceptions.

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
	public abstract void atBat() throws Strike, Foul;

	public Inning() {
	}

	public void event() throws BaseballException {
		// Doesn't actually hava to throw anything
	}

	public void walk() {
	} // Throws no checked exceptions
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

	public StormyInning() throws RainedOut, BaseballException {
	}

	public StormyInning(String s) throws Foul, BaseballException {
	}

	public void event() {
	}

	public void atBat() {
	}

	/**
	 * @param args
	 * @throws BaseballException
	 * @throws RainedOut
	 */
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}

		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("RainedOut");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}

	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub

	}

}
