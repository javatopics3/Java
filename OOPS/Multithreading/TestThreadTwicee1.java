package Multithreading;
//start a thread twice
public class TestThreadTwicee1 extends Thread {
	public void run() {
		System.out.println("running...");
	}// run method

	public static void main(String[] args) {
		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start();
	}

}// class
