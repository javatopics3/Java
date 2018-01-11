/*
 * Write a JAVA program which illustrates the concept of instance methods and static methods
 */
public class Second {
	void disp1() {
		System.out.println("disp1-instance");
	}

	static void disp2() {
		System.out.println("disp2-static");
	}

	public static void main(String[] args) {
		System.out.println("main-beginning");
		Second so = new Second();
		so.disp1();
		Second.disp2();
		System.out.println("main-end");
			
	}
}
