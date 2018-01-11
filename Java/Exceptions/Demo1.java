package Exceptions;

public class Demo1 {
	@SuppressWarnings("finally")
	public static int retInt() {
		int a = 100;
		try {
			return a;
			// System.exit(1);
		} catch (ArithmeticException e) {
			System.out.println("catch called");
			System.out.println(e);
		} finally {
			a = 500;
			System.out.println("finally called");
			return a;
		}// finally
	}// retInt()

	public static void main(String[] args) {
		System.out.println(retInt());
	}

}// class
