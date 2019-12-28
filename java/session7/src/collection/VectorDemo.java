package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v= new Vector();
		for(int i=0;i<10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(10);
		System.out.println(v.capacity());
		for(int i=0;i<10;i++)
		{
			v.add(i);
		}
		System.out.println(v.capacity());
		v.add(10);
		System.out.println(v.capacity());
		v.add(50);
		System.out.println(v.capacity());
		for(int i=0;i<20;i++)
		{
			v.add(i);
		}
		System.out.println(v.capacity());
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
			System.out.println(v);
		}
		

	}

}
