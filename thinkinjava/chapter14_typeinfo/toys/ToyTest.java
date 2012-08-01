package chapter14_typeinfo.toys;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy(){}
	Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy(){
		super(1);
	}
}

public class ToyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
