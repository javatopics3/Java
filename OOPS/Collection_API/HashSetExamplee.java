package Collection_API;

import java.util.HashSet;

//Java HashSet Example: Book111

class Book11 {
	int id;
	String name, author, publisher;
	int quantity;

	public Book11(int id, String name, String author, String publisher,
			int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}// class Book111 base class

public class HashSetExamplee {
	public static void main(String[] args) {
		HashSet<Book11> set = new HashSet<Book11>();
		// Creating Book11s
		Book11 b1 = new Book11(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book11 b2 = new Book11(102, "Data Communications & Networking",
				"Forouzan", "Mc Graw Hill", 4);
		Book11 b3 = new Book11(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Book11s to HashSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing HashSet
		for (Book11 b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " "
					+ b.publisher + " " + b.quantity);
		}
	}// main method
}// main class
