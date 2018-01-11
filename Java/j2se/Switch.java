package j2se;

public class Switch {
	public static void main(String[] args) {
		int score = 90;
		switch (score) {
		case 100:
		case 90:
			System.out.println("Very Good");
			break;
		case 60:
			System.out.println("Good");
			break;
		case 40:
			System.out.println("Ok");
			break;
		default:
			System.out.println("The Grades are not defined");
			break;
		}
	}
}
