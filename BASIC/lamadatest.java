package BASIC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lamadatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> l=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println(l);
	
	for(int lis:l1) {
		System.out.println(lis);
	}
	
	}

}
