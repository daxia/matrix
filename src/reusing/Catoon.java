package reusing;

class Art{
	public Art(){
		System.out.println("Art Constructor！");
	}
}
class Drawing extends Art{
	public Drawing(){
		System.out.println("Drawing Constructor!");
	}
}
/**
 * 
 * @description: 继承的基类初始化 顺序，，，从最上层的基类开始向下初始化
 *
 * @package:  basic.classtest
 * @filename: Drawing.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-16
 * @version:  v1.0
 */
public class Catoon extends Drawing{

	public Catoon(){
		System.out.println("Catoon Constructor!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Catoon ct = new Catoon();
	}

}
