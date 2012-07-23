package reusing;

/**
 * 
 * @description: class,×éºÏÀà
 * 
 * @package: basic.classtest
 * @filename: ClassTest1.java
 * @author: wangshengzhong
 * @ctime: 2012-7-16
 * @version: v1.0
 */
public class ClassTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SprinklerSystem ss = new SprinklerSystem();
		System.out.println("test " + ss);
	}

}

class WaterSource {
	String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructs";
	}

	public String toString() {
		return s;
	}
}

class SprinklerSystem {
	String ss = "SpringleSystem.toString()";
	WaterSource test = new WaterSource();
	public String toString(){
		return ss;
	}
}