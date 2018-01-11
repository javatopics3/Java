package Collection_API;

//Java LinkedList Example: Book

import java.util.LinkedList;
import java.util.List;

class Bookk {
	int id;
	String name, author, publisher;
	int quantity;

	public Bookk(int id, String name, String author, String publisher,
			int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedListExample {
	public static void main(String[] args) {
		// Creating list of Books
		List<Bookk> list = new LinkedList<Bookk>();
		// Creating Books
		Bookk b1 = new Bookk(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Bookk b2 = new Bookk(102, "Data Communications & Networking",
				"Forouzan", "Mc Graw Hill", 4);
		Bookk b3 = new Bookk(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (Bookk b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " "
					+ b.publisher + " " + b.quantity);
		}
	}
}
