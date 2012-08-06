//P540
package chpater18_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {

	public static String read(String filename) throws IOException {
		// Reading input by lines:
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while ((s = in.readLine()) != null) {
			sb.append(s + "\n");
		}
		in.close();
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// Throw exceptions to console
		System.out.println(System.getProperty("user.dir"));
		System.out.println(read(System.getProperty("user.dir") +"\\thinkinjava\\chpater18_io\\BufferedInputFile.java"));
	}

}
