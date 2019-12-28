package collection;

import java.util.TreeSet;

public class sortedSetDemo {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add("a");
	ts.add("A");
	ts.add("B");
	ts.add("L");
	ts.add("z");
	//ts.add(null); Null pointer execption
	//ts.add(new Integer(10)); ClassCastExecption
	System.out.println(ts);
	
}
}
