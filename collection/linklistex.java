package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linklistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> lst=new LinkedList<>();
       lst.add(22); lst.add(78);
       lst.add(22); lst.add(55);
       lst.addFirst(11);
       lst.addLast(99);
       System.out.println(lst);
       
       Iterator<Integer> it=lst.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
	}

}
