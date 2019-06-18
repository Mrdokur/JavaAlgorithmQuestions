package JavaAlgorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		removeEveryOther(list);

		System.out.println(list);
		

	}

	public static void removeEveryOther(ArrayList<String> words) {

		Iterator<String> it = words.iterator();
		while (it.hasNext()) {

			String name = it.next();
			name = it.next();
			// Do something
			it.remove();

		}
	}
}
