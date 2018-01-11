package StringInterviewQuestions;

public class Example {
	public static void main(String a[]) {
		System.out.println(isPalindrome("aaabbbaaa"));
		System.out.println(isPalindrome("aaabbbccc"));
	}

	public static boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}
}
