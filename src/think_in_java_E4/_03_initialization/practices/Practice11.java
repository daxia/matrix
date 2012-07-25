package think_in_java_E4._03_initialization.practices;

//practice12
//finalize()  extends the Object
public class Practice11 {

	public static void main(String[] args) {
		Tank tank = new Tank(true);
		tank.finalize();
		System.gc();
	}

}

class Tank{
	//the tank only have two states: full && empty
	boolean tankIsEmpty= false;
	
	Tank(boolean tankIsEmpty){
		this.tankIsEmpty = tankIsEmpty;
	}
	
	//rewrite the Object method: finalize()
	public void finalize(){
		if(tankIsEmpty){
			System.out.println("Error: the tank is empty ");
		}
	}
}
