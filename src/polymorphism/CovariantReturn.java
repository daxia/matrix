package polymorphism;

/**
 * 
 * @description: Э�䷵������ 
 *
 * @package:  polymorphism
 * @filename: CovariantReturn.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-19
 * @version:  v1.0
 */
class Grain{
	//Э�䷵������
	public String toString(){
		return  "Grain";
	}
}

class Wheat extends Grain{
	//Э�䷵������
	public String toString(){
		return "Wheat";
	}
}

class Mill{
	Grain process(){
		return new Grain();
	}
}

class WheatMill extends Mill{
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn{
	public static void main(String[] args){
		Mill mill = new Mill();
		Grain grain = mill.process();
		System.out.println(grain);
		
		mill = new WheatMill();
		grain = mill.process();
		System.out.println(grain);
	}
}