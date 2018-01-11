package FileHandling;

//Java FileOutputStream example 2: write string
import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("I:\\testout.txt");
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * The content of a text file testout.txt is set with the data Welcome to
 * javaTpoint.
 * 
 * testout.txt
 * 
 * Welcome to javaTpoint.
 */
// The Data is written in testout.txt Data As: Welcome to javaTpoint. OK
