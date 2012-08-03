package chapter14_typeinfo.toys;
//Class loading
//P316

import static net.mindview.util.Print.*;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
	Toy(){}
	Toy(int i) {
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {

	static void printInfo(Class cc){
		print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class c = null;
		try{
			c = Class.forName("chapter14_typeinfo.toys.FancyToy");
		}catch(ClassNotFoundException e){
			print("Cann't find FancyToy");
			System.exit(1);
		}
		
		printInfo(c);
		for(Class face : c.getInterfaces()){
			printInfo(face);
		}
		
		print();
		Class up = c.getSuperclass();
		Object obj = null;
		try{
			//Requires default constructor
			obj = up.newInstance();
			
		}catch(InstantiationException e){
			print("Cann't  instantiate");
			System.exit(1);
		}catch(IllegalAccessException e){
			print("Cann't access");
			System.exit(1);
		}
		//print(obj.getClass());
		printInfo(obj.getClass());
	}

}
