package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dt="";
         Scanner sc=new Scanner(System.in);
         ArrayList<String> data=new ArrayList<String>();
         System.out.println("how many element you want to add");
         int n=sc.nextInt();
         for (int i=0;i<n;i++) {
        	 System.out.println("Add data");
        	 dt=sc.next();
        	 data.add(dt);
         }
         
         System.out.println(data);
	}

}
