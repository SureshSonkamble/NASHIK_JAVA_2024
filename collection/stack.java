package collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Stack<Integer> stk=new Stack<>();
		System.out.println(stk.isEmpty());
		stk.push(99);stk.push(88);
		stk.push(11);stk.push(33);
		stk.push(22);stk.push(33);
		System.out.println(stk.isEmpty());
		System.err.println(stk);
		System.out.println("Stack Size "+stk.size());
		System.out.println("current Element: "+stk.peek());
		System.err.println("poped Element "+stk.pop());
		System.out.println("Stack Size "+stk.size());
		System.out.println("current Element: "+stk.peek());
		
		System.err.println("poped Element "+stk.pop());
		System.out.println("Stack Size "+stk.size());
		System.out.println("current Element: "+stk.peek());

		System.err.println("poped Element "+stk.pop());
		System.out.println("Stack Size "+stk.size());
		System.out.println("current Element: "+stk.peek());

		System.err.println("poped Element "+stk.pop());
		System.out.println("Stack Size "+stk.size());
		System.out.println("current Element: "+stk.peek());
	}

}
