package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(30));
		System.out.println(s.search(20));
		System.out.println(s.search(10));//from upward
		
		
	}

}
