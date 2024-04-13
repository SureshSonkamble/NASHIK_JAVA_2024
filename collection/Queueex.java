package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Queue<Integer> q=new LinkedList<>();
       q.add(22); q.add(5);
       q.add(1); q.add(2);q.add(null); q.add(22);
       System.out.println(q);
       q.remove();q.remove();
       q.add(11);
       System.err.println(q);
       System.out.println(q.peek());
       System.out.println(q.poll());
       
       
       
       PriorityQueue<Integer> qq=new PriorityQueue<>();
       qq.add(22); qq.add(5);
       qq.add(1); qq.add(2); qq.add(22);
       System.err.println("PQUEUE:= "+qq);
//       qq.remove();qq.remove();
//       qq.add(11);
//       System.err.println(q);
//       System.out.println(q.peek());
//       System.out.println(q.poll());
       
       
       
	}

}
