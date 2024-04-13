package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> city=new ArrayList<String>();
      city.add("nashik");
      city.add("pune");
      city.add("pune");
      city.add("null");
      city.add("mumbai");
      city.add("nagpur");
      city.add("solapur");
      city.add(0,"thane");
      System.out.println(city);
      System.out.println(city.get(1));
//      for(int i=0;i<city.size();i++) {
//    	  System.out.println(city.get(i));
//      }
      
//      for(String i:city) {
//    	  System.out.println(i);
//      }
      	Iterator<String> it=city.iterator();
      	while(it.hasNext()) {
      	
      	System.out.println(it.next());
      	}
      
   //
	}

}
