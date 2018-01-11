package j2se;

//Interfaces concept
public class Bank_ABCD implements Andhra_Bank {
	public int getInterestRate() {// Cannot reduce the visibility of the
									// inherited
		// method from Andhra_Bank
		return 5;
	}// method
}// class

