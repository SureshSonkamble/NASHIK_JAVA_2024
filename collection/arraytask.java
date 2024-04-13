package collection;

import java.util.ArrayList;

public class arraytask {
	public static void main(String[] args) {
		int c=0,a=0,s=0;
		 ArrayList<String> cll=new ArrayList<String>();
		 ArrayList<String> all=new ArrayList<String>();
		 ArrayList<String> oll=new ArrayList<String>();
		 ArrayList<emp> al=new ArrayList<emp>();
	       al.add(new emp(1,"suresh",12000,22));
	       al.add(new emp(2,"ramesh",12000,17));
	       al.add(new emp(3,"mahesh",12000,65));
	       al.add(new emp(4,"sonu",12000,22));
	       al.add(new emp(5,"monu",12000,17));
	       al.add(new emp(6,"tinu",12000,65));
	       al.add(new emp(7,"piu",12000,22));
	       al.add(new emp(8,"sanju",12000,17));
	       al.add(new emp(9,"manju",12000,65));
	       al.add(new emp(10,"pintu",12000,65));   
	       al.add(new emp(11,"sonu",12000,35));
	       for(emp e:al) {
	    	   if(e.age<18) {
	    		   c++;
	    		   cll.add(e.enm);
	    	   }else if(e.age>18&&e.age<60) {
	    		   a++;
	    		   all.add(e.enm);
	    	   }else {
	    		   s++;
	    		   oll.add(e.enm);
	    	   }
	       }
	       System.out.println("Child count "+c +" Adult "+a+" Old "+s);
	       System.err.println("Child="+cll);
	       System.err.println("Adult="+all);
	       System.err.println("Old="+oll);
	}

}
