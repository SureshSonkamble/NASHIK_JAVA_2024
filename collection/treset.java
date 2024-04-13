package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class treset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		 SortedSet<String> ts=new TreeSet<String>();
		 ts.add("D");ts.add("D");
		 ts.add("A");
		// ts.add(null);
		 ts.add("B");ts.add("C");
		 System.out.println(ts);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
