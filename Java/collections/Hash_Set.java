package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("Mark");
		name.add("Mark");
		name.add("jack");
		name.add("july");
		name.add("patrik");
		Iterator<String> itr = name.iterator();
		while (itr.hasNext())
			// expression must OK
			System.out.println(itr.next());
	}
}
