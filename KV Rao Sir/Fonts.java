import java.awt.GraphicsEnvironment;

//Write a JAVA program to display the fonts of the system?
public class Fonts {
	public static void main(String[] args) {
		/*
		 * you can change args only to any name OK bcoz array name
		 */
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		String s[] = ge.getAvailableFontFamilyNames();
		System.out.println("NUMBER OF FONTS = " + s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);

		}

	}
}
/*
 * A factory method is one whose return type is similar to name of the class
 * where it presents. For example: getLocalGraphicsEnvironment ();
 */