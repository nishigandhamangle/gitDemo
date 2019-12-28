package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SimpleGen<V> {
V v;public SimpleGen(V v)
{
	this.v=v;
	
}
public V getV()
{
	return v;
}
public static void main(String[] args) {
	SimpleGen<Integer> a=new SimpleGen<Integer>(10);
	System.out.println(a.getV());
	System.out.println(a.getV());
	ArrayList<Integer>t=new ArrayList<Integer>();
	t.add(12);
	t.add(15);
	t.add(126);
	t.add(127);
	System.out.println(t);
	Iterator<Integer> i=t.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	for(Integer b:t)
	{
		System.out.println(b);
	}
	//collection demo
	t.add(new Integer(10));//class cast exception
	t.add(null);
	Collections.sort(t);
	System.out.println("after sorting:"+t);
}
}
