package FileHandling;

import java.io.FileInputStream;
//Java FileInputStream example 1: read single character
public class DataStreamExample1 {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("I:\\testout.txt");
			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}//class
/*
 * After executing the above program, you will get a single character from the
 * file which is 87 (in byte form). To see the text, you need to convert it into
 * character.
 */