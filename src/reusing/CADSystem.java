package reusing;

/**
 * 
 * @description:  �̳�����ϵĽ��ʹ�� 
 *
 * @package:  basic.classtest
 * @filename: CADSystem.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-16
 * @version:  java���˼�� (E4)  P133
 */
class Shape {
	String str;

	Shape(int i) {
		System.out.println("Shape Constructor!");
	}

	void dispose() {
		System.out.println("Shape Dispose!");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Circle Constructor!");
	}

	void dispose() {
		System.out.println("Ersing Circle!");
		super.dispose(); ////����ֱ��дShape.dispose(),�ᱨ��
	}
}

class Line extends Shape {
	private int start, end;

	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line : " + start + ", " + end);

	}

	void dispose() {
		System.out.println("Erasing Line : " + start + ", " + end);
		super.dispose(); ////����ֱ��дShape.dispose(),�ᱨ��
	}
}

public class CADSystem extends Shape {

	private Shape shape;
	private Circle circle;
	private Line[] line	= new Line[3];
	public CADSystem(int i){
		super(i + 1);
		for(int j = 0; j < line.length; j++){
			line[j] = new Line(j, j*j);
		}
		circle = new Circle(i);
		System.out.println("CADSystem Constructor!");
		
	}
	
	//
	void dispose(){
		System.out.println("CADSystem dispose()!");
		circle.dispose();
		for(int i = line.length - 1; i >= 0 ; i--){
			line[i].dispose();
		}
		super.dispose();  //����ֱ��дShape.dispose(),�ᱨ��
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CADSystem cs = new CADSystem(9);
		try{
			//
		}finally{
			cs.dispose();
		}
	}

}
