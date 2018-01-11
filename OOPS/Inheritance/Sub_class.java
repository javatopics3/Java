package Inheritance;

class Super_class {
	int num = 20;

	// display method of superclass
	public void display() {
		System.out.println("This is the display method of superclass");
	}
}

public class Sub_class extends Super_class {
	int num = 10;

	// display method of sub class
	public void display() {
		System.out.println("This is the display method of subclass");
	}

	public void my_method() {
		// Instantiating subclass
		Sub_class sub = new Sub_class();

		// Invoking the display() method of sub class
		sub.display();

		// Invoking the display() method of superclass
		super.display();

		// printing the value of variable num of subclass
		System.out.println("value of the variable named num in sub class:"
				+ sub.num);

		// printing the value of variable num of superclass
		System.out.println("value of the variable named num in super class:"
				+ super.num);
	}

	public static void main(String args[]) {
		Sub_class obj = new Sub_class();
		obj.my_method();
	}//main
}//class
/*
 * Invoking Superclass Constructor If a class is inheriting the properties of
 * another class, the subclass automatically acquires the default constructor of
 * the superclass. But if you want to call a parameterized constructor of the
 * superclass, you need to use the super keyword as shown below.
 * 
 * super(values); Sample Code The program given in this section demonstrates how
 * to use the super keyword to invoke the parametrized constructor of the
 * superclass. This program contains a superclass and a subclass, where the
 * superclass contains a parameterized constructor which accepts a string value,
 * and we used the super keyword to invoke the parameterized constructor of the
 * superclass.
 */