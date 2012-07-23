package innerclasses;

//如何正确的 new 一个内部类  ：【 (外部类对象).new 内部类】
public class DotNew {

	class Inner{
		
	}
	
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner di = dn.new Inner(); //new 内部类的方式
	}

}
