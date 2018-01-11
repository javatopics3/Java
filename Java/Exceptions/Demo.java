package Exceptions;

//Catching and Handling Exceptions:
//using try catch Blocks:
public class Demo {
	public static void main(String[] args) {
		int b[] = new int[2];// value of index at 2 OK
		try {
			System.out.println("Value of b=" + b[3]);
		} catch (ArithmeticException e) {// less priority
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {// less priority
			System.out.println(e);
		} catch (Exception e) {// More priority
			System.out.println(e);
		}// catch block end
		System.out.println();// separates the line breaking
	}
}// class
//You can add multiple catch blocks using try block OK
// General Exception class has more priority
//so this come at last Ok
