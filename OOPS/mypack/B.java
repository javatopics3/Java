package mypack;

//Example of package that import the packagename.*

import pack.*;

public class B {
	public static void main(String args[]) {
		A obj = new A();
		obj.msg();
	}
}
