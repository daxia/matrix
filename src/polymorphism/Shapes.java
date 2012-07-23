package polymorphism;

import polymorphism.shape.*;

/**
 * 
 * @description: ∂‡Ã¨,ºÃ≥– 
 *
 * @package:  polymorphism
 * @filename: Shapes.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-17
 * @version:  think in java(E4) :P152
 */
public class Shapes {

	private static RandomShapeGenerator rsg = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i = 0; i < s.length; i++){
			s[i] = rsg.next();
		}
		for(Shape shp : s){
			shp.draw();
		}
	}

}
