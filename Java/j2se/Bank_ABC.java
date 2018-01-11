package j2se;

//Method Overriding
public class Bank_ABC extends Bank {
	int getInterestRate() {
		return 5;
	}

	// These 2 methods are Overloading OK

	int getInterestRate(int dfast) {// This method is overloading our previous
									// method OK
		// This Generally happens in the same class
		return 111;// change to your value your wish OK
	}

}// class
