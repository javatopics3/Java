package j2se;

public class For_loop {
	public static void main(String[] args) {
		int[] myintarray = { 100, 31, 26, 48, 52 };
		/*
		 * int index=0; while(index<5){ System.out.println(myintarray[index]); }
		 */
		// This is 1st way
		/*
		 * for (int index = 0; index < 5; index++) {
		 * System.out.println(myintarray[index]); }
		 */
		for (int element : myintarray) {
			System.out.println(element);
		}// for loop
	}// main
}// main
