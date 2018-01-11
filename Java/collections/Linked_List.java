package collections;

import java.util.LinkedList;

//Similar to ArrayList but differences OK
public class Linked_List {
	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		name.add("patrik");
		name.add("mark");
		name.add("tom");
		name.add("john");
		name.add("jack");
		name.add("Zack");
		System.out.println(name.size());
		for (String x : name)
			System.out.println(x);
		/*
		 * These are some methods OK name.set(1, "Patrik"); name.remove(1);
		 * name.add(1, "index"); name.removeFirst(); name.clear();
		 */

	}// main
}// classf
