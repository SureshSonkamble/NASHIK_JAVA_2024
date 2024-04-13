package collection;

import java.util.*;

public class setintfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<String> hs=new HashSet<String>(); 
         hs.add("B");hs.add("B");
         hs.add(null);hs.add(null);
         hs.add("E");hs.add("D");
         hs.add("A");hs.add("C");
         System.out.println(hs);
         
         Set<String> lhs=new LinkedHashSet<String>(); 
         lhs.add("B");lhs.add("B");
         hs.add(null);hs.add(null);
         lhs.add("E");lhs.add("D");
         lhs.add("A");lhs.add("C");
         System.err.println(lhs);
	}

}
