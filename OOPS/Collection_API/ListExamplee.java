package Collection_API;

import java.util.ArrayList;
import java.util.List;

//Example of ListIterator Interface: Book111
class Book111 {
	int id;
	String name, author, publisher;
	int quantity;

	public Book111(int id, String name, String author, String publisher,
			int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ListExamplee {
	public static void main(String[] args) {
		// Creating list of Book11s
		List<Book111> list = new ArrayList<Book111>();
		// Creating Book11s
		Book111 b1 = new Book111(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book111 b2 = new Book111(102, "Data Communications & Networking",
				"Forouzan", "Mc Graw Hill", 4);
		Book111 b3 = new Book111(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Book11s to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (Book111 b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " "
					+ b.publisher + " " + b.quantity);
		}
	}
}
