package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h= new HashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add(null);
		
		System.out.println(h);
		//print according to 
		//hashcode value
	}
}
