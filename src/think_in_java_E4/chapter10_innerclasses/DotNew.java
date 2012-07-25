package think_in_java_E4.chapter10_innerclasses;

//如何正确�?new �?��内部�? ：�? (外部类对�?.new 内部类�?
public class DotNew {

	class Inner{
		
	}
	
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner di = dn.new Inner(); //new 内部类的方式
	}

}
