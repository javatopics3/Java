package StringHandling;

public class StringConstantPooll {
	public static void main(String[] args) {
		String s = "prasad";
		String s2 = new String("prasad");
		System.out.println(s.equals(s2));
		System.out.println(s == s2);

	}
}
