package Abstraction;

//The class has:three fields, seven methods, and one constructor.

public abstract class Employee {
	private String name;
	private String address;
	private int number;

	// Alt shift s:o=Generate constructor using fields
	public Employee(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		// super();
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " "
				+ this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public int getNumber() {
		return number;
	}

}// class
// AbstractDemo.java
