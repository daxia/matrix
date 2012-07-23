package polymorphism;

//via composition (thi "State" design pattern)
// 状态模式，在运行时改变对象的引用；
//这个对象引用本来就是动态绑定的
class Actor{
	public void act(){}
}

class HappyActor extends Actor{
	public void act(){
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor{
	public void act(){
		System.out.println("SadActor");
	}
}

class Stage{
	private Actor actor = new HappyActor();
	public void change(){
		actor = new SadActor();
	}
	public void performPlay(){
		actor.act();
	}
}

public class Transmogrify{
	public static void main(String[] args){
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}
