package j2se;

public class Parameters {
	public static void main(String[] args) {
		// Add(100,201,211);
		int sum = Add(100, 201, 211);
		int result = sum * 15;
		System.out.println(result);
	}// main

	public static void sayHello(String name) {// name is local variable
		System.out.println("Hello " + name);
	}

	public static int Add(int a, int b, int c) {
		// System.out.println(a+b+c);
		return (a + b + c);
	}

}
