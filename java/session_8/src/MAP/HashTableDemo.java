package MAP;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
	Hashtable h = new Hashtable();
	h.put(new Temp(5),"a");
	h.put(new Temp(6),"A");
	h.put(new Temp(8),"B");
	h.put(new Temp(4),"U");
	h.put(5,"a");
	h.put(5,"j");
	System.out.println(h);
	}//duplicate keyand values but null values not allowed
}//syncronized
