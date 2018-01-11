package FileHandling;

//Java FileOutputStream Example 1: write byte
import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("I:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * The content of a text file testout.txt is set with the data A.
 * 
 * testout.txt
 * 
 * A
 */
// Yes file txt is created: testout.txt with Data 'A' OK