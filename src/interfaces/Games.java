package interfaces;

//工厂例子 
//西洋跳棋和国际象棋
interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

// //具体实现
class Checkers implements Game {

	private int moves = 0;
	private final static int MOVE = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers moves " + moves);
		return ++moves != 3;
	}
}

class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Checkers();
	}
}

// //具体实现
class Chess implements Game {
	private int moves = 0;
	private final static int MOVE = 4;

	@Override
	public boolean move() {
		System.out.println("Checkers moves " + moves);
		return ++moves != 4;
	}
}

class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Chess();
	}
}

public class Games {

	static void play(GameFactory gf) {
		Game g = gf.getGame();
		while(g.move());
	}

	public static void main(String[] args) {
		play(new CheckersFactory());
		play(new ChessFactory());
	}
}
