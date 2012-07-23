package polymorphism;

//Downcasting & Runtime type information （RTTI）
//向下转型

class Useful{
	public void f(){}
	public void g(){}
}

class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	
	//扩展方法
	public void u(){}
	public void v(){}
	public void w(){}
}

public class RTTI{
	public static void main(String[] args){
		Useful[] x = {new Useful(), new MoreUseful()};
		x[0].f();
		x[1].g();
		
		//(MoreUseful) x[0].u(); 
	}
}
