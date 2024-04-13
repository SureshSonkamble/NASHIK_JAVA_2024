package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueuex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Deque<Integer>dq=new ArrayDeque<>();
       
       dq.add(2);dq.add(2);
       dq.add(4);dq.add(1);
       dq.add(6);dq.add(8);
       //dq.add(null);
       System.out.println(dq);
       dq.remove();
       System.err.println(dq);
       dq.add(9);
       dq.addFirst(1);
       System.err.println(dq);
       dq.removeLast();
	}

}
