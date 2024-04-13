package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arrytask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<emp> al=new ArrayList<emp>();
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
       
//       for(emp e:al) {
//    	   System.out.println(e.eid+" "+e.enm+" "+e.sal+" "+e.age);
//       }
       List<Integer>e=al.stream()
    		   .filter(f->f.age>18)
    		   .map(f->f.age)
    		   .collect(Collectors.toList());
       System.out.println(e);
	}

}
