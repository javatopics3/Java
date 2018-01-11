package j2se;

//final keyword
/*A final class cannot be sub-classed
 A final method cannot be overriden by sub-classes
 A final variable can only be initialized once
 */
public class Hello extends Student {// Inheriting from student class to Hello
									// class
	public final int number;// compiles bcoz student is not final

	// The blank final field number may not have been initialized
	public Hello() {// default constructor
		number = 10;
	}
}// class
