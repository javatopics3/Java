package j2se;

// && - is true == Both true OK
// || - is false == One true OK
public class Logical {
	public static void main(String[] args) {
		int subject1 = 20;
		int subject2 = 60;
		if ((subject1 >= 35) || (subject2 >= 35)) {
			System.out.println("The condition is true");
		} else {
			System.out.println("The condition is false");
		}
	}
}
