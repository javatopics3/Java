package Multithreading;

//Java Thread Example by extending Thread class
public class Multi extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}// run method

	public static void main(String[] args) {
		Multi t1 = new Multi();// creating instance t1 OK
		t1.start();
		/*
		 * Thread class has start() OK, we run in jvm start() and executes OK by extending.
		 * public void start(): starts the execution of the thread.JVM calls the
		 * run() method on the thread.
		 */
	}

}// class
