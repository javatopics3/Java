package collections;

import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		int simple_array[] = new int[5];
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(25);
		myList.add(93);
		for (Integer x : myList)
			System.out.println(x);
		System.out.println("size= " + myList.size());
		// myList.remove(2);
		// myList.clear();
		// myList.trimToSize();
	}// main
}// class
