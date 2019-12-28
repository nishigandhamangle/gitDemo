package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(13);
		ls.add(15);
		ls.add(16);
		ls.add(11);
		ls.add(13);//duplicate not allowed
		System.out.println(ls);
	}

}
