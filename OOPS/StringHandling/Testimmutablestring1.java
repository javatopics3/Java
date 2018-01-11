package StringHandling;

public class Testimmutablestring1 {
	public static void main(String args[]) {
		String s = "Sachin";
		s = s.concat(" Tendulkar");
		System.out.println(s);
		/*
		 * In such case, s points to the "Sachin Tendulkar". Please notice that
		 * still sachin object is not modified.
		 */
	}
}
