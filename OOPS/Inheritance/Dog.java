package Inheritance;

public class Dog extends Mammal {
	public static void main(String[] args) {
		Animal a = new Animal();
		Mammal m = new Mammal();
		Dog d = new Dog();

		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);
	}// main

}// main class
/*
 * Since we have a good understanding of the extends keyword, let us look into
 * how the implements keyword is used to get the IS-A relationship.
 * 
 * Generally, the implements keyword is used with classes to inherit the
 * properties of an interface. Interfaces can never be extended by a class.
 */