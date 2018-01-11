package j2se;

public class Strings {
	public static void main(String[] args) {
		String myString = "Hello " + "World";
		int myStringLength = myString.length();
		String myStringinlowerCase = myString.toLowerCase();
		// System.out.println(myStringinlowerCase);
		// index value starts from 0 OK
		System.out.println(myString.replace('o', 'a'));
		System.out.println(myString.indexOf('o'));// o index value
	}
}
