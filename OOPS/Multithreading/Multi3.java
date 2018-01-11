package Multithreading;

//Java Thread Example by implementing Runnable interface
public class Multi3 implements Runnable {

	public void run() {
		System.out.println("thread is running...");
	}// run method Ok

	public static void main(String[] args) {
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);
		t1.start();
	}

}// class Multi3
/*
 * If you are not extending the Thread class,your class object would not be
 * treated as a thread object.So you need to explicitely create Thread class
 * object.We are passing the object of your class that implements Runnable so
 * that your class run() method may execute.
 */