package j2se;

//Recursion in java
//calling one method into another is called Recursion OK
//we will try to find some algorithm, which calculates the factorial OK
public class Main8 {
	// /N!=N*(N-1)*(N-2)*....*2*1
	// 5!=5*4*3*2*1 //like this OK, now do: following
	public static int factorial(int N) {
		if (N <= 1)
			return 1;
		else {
			return (N * factorial(N - 1));
		}
	}// factorial method

	public static void main(String[] args) {
		System.out.println(factorial(5));//upto 33 ok 34 error 0 value OK
	}
}// class
