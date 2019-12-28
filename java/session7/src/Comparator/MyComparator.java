package Comparator;

import java.util.Comparator;

public class MyComparator implements Comparator{{

	

	

	}

@Override
public int compare(Object obj1, Object obj2) {
	// TODO Auto-generated method stub
	Employee e1 = (Employee) obj1;
	Employee e2 = (Employee) obj2;
	
	String s1 = e1.empNM;
	String s2 = e2.empNM;
	return s1.compareTo(s2);
	
}

	
}
