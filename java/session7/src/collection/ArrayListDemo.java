package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList a=new ArrayList();
	a.add("A");
	//a.add(10);
	a.add("a");
	a.add(null);
	System.out.println(a);
	//a.remove(2);
	System.out.println(a);
	a.add(2,"t");
	System.out.println(a);
	String i=(String) a.get(0);
	System.out.println(i);
	//list iterator
	ListIterator itr=a.listIterator();
	System.out.println("---------------------------");
	while(itr.hasNext())
	{String it=(String) itr.next();
		System.out.println(it);
	}
	System.out.println("---------------------------");
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	
}
}
