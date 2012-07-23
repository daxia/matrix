package interfaces.music4;

//Abstract classes  and methods.

abstract class Instrument {
	private int i; // storage allocated for each

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public void adjust() {
		System.out.println("Wind.adjust");
	}

	public String what() {
		return "Wind";
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public void adjust() {
		System.out.println("Percussion.adjust()");
	}

	public String what() {
		return "Percussion";
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public void adjust() {
		System.out.println("Stringed.adjust()");
	}

	public String what() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

enum Note {
	ONE, TWO, THREE, FOUR, SIX, SEVEN

}

public class Music4 {
	static void tune(Instrument i){
		 i.play(Note.ONE);
	}
	
	static void tuneAll(Instrument[] ies){
		for(Instrument i : ies){
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] ins = {new Wind(), new Percussion(), new Brass(), new Stringed() };
		tuneAll(ins);
		
		//-------------------
		Wind w = new Wind();
		String str = w.what();
		System.out.println(str);  //协变返回类型
	}
	
	
	
	
}
