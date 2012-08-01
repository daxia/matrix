package chapter13_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.mindview.util.TextFile;

// a very simple version of the "grep" program
//{Args: JGrep.java "\\b[Ssct]\\w+"}

public class JGrep {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("Usage: java JGrep file regex");
			System.out.println(0);
		}
		Pattern p = Pattern.compile(args[1]);
		int index = 0;
		Matcher m = p.matcher("");
		for(String line: new TextFile(args[0])){
			m.reset(line);
			while(m.find()){
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
			}
		}
	}

}
