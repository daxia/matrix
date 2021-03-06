package interfaces;
import java.util.*;
import java.io.IOException;
import java.nio.*;

//稀里糊涂的敲的，策略模式
public class RandomWords implements Readable{

	private static Random rand = new Random();
	private static final char[] capitals = 
			"ABCD".toCharArray();
	private static final char[] lowers = 
			"abcd".toCharArray();
	private static final char[] vowels = 
			"aeiou".toCharArray();
	private int count;
	public RandomWords(int count){
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- ==0){
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i = 0; i< 4; i++){
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(new RandomWords(10));
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}

}
