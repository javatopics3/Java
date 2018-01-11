package j2se;

import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		System.out.println("Entered value is");
		System.out.println(user_input_number);
	}//  main
}
