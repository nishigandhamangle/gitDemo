package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("ashok");
		l.add(30);
		l.add(20);
		l.add(null);
		l.add("ashiwni");
		System.out.println(l);
		l.addFirst("ddd");
		l.remove();
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		l.removeFirstOccurrence(20);
		System.out.println(l);
	}

}
