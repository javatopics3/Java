package FileHandling;

import java.io.FileInputStream;
//Java FileInputStream example 2: read all characters
public class DataStreamExample2 {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("I:\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}//class
//Exact file Data is showing currently.
//if we change data in file updated data is executing Ok

