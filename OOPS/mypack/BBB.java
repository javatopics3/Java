package mypack;

//Example of package by import fully qualified name
public class BBB {
	public static void main(String args[]) {
		pack.A obj = new pack.A();// using fully qualified name
		obj.msg();
	}
}
// Note: If you import a package, subpackages will not be imported.
/*
 * If you import a package, all the classes and interface of that package will
 * be imported excluding the classes and interfaces of the subpackages. Hence,
 * you need to import the subpackage as well.
 */