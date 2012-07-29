package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//add content to files
public class AddContent2File {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("D:/filename", true));
			out.write("aString");
		} catch (IOException e) {
			// error processing code
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			if (out != null) {

				out.close();

			}
		}

	}
}
