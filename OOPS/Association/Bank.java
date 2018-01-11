package Association;

//Java program to illustrate the 
//concept of Association
public class Bank {
	private String name;

	// bank name
	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}
