package basic.overloading;

public class OverLoadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOverLoadTest tl = new TypeOverLoadTest();
		tl.TestConstVal();
		tl.TestByte();
		tl.TestChar();
	}

}

/**
 * 
 * @description: 方法的重载，各种基本类型 
 *
 * @package:  basic.overloading
 * @filename: OverLoadTest.java
 * @author:   wangshengzhong
 * @ctime:    2012-7-12
 * @version:  v1.0
 */
class TypeOverLoadTest{
	void f1(char i){ System.out.print("f1(char) ");}
	void f1(byte i){System.out.print("f1(byte) ");}
	void f1(long i){System.out.print("f1(long) ");}
	void f1(int i){System.out.print("f1(int) ");}
	void f1(short i){System.out.print("f1(short) ");}
	void f1(double i){System.out.print("f1(double) ");}
	void f1(float i){System.out.print("f1(float) ");}
	
	void f2(byte i){System.out.print("f2(byte) ");}
	void f2(long i){System.out.print("f2(long) ");}
	void f2(int i){System.out.print("f2(int) ");}
	void f2(short i){System.out.print("f2(short) ");}
	void f2(double i){System.out.print("f2(double) ");}
	void f2(float i){System.out.print("f2(float) ");}
	
	void f3(long i){System.out.print("f3(long) ");}
	void f3(int i){System.out.print("f3(int) ");}
	void f3(short i){System.out.print("f3(short) ");}
	void f3(double i){System.out.print("f3(double) ");}
	void f3(float i){System.out.print("f3(float) ");}
	
	void f4(int i){System.out.print("f4(int) ");}
	void f4(short i){System.out.print("f4(short) ");}
	void f4(double i){System.out.print("f4(double) ");}
	void f4(float i){System.out.print("f4(float) ");}
	
	void f5(short i){System.out.print("f5(short) ");}
	void f5(double i){System.out.print("f5(double) ");}
	void f5(float i){System.out.print("f5(float) ");}
	
	void f6(double i){System.out.print("f6(double) ");}
	void f6(float i){System.out.print("f6(float) ");}
	
	void f7(float i){System.out.print("f7(float) ");}
	
	void TestConstVal(){
		System.out.print("5:");
		f1(5);
		f2(5);
		f3(5);
		f4(5);
		f5(5);
		f6(5);
		f7(5);
		System.out.println();
	}
	
	void TestChar(){
		System.out.print("char :");
		char i = 'x';
		f1(i);
		f2(i);
		f3(i);
		f4(i);
		f5(i);
		f6(i);
		f7(i);
		System.out.println();
	}
	
	void TestByte(){
		System.out.print("byte :");
		char i = 0;
		f1(i);
		f2(i);
		f3(i);
		f4(i);
		f5(i);
		f6(i);
		f7(i);
		System.out.println();
	}

}
