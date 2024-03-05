package BASIC;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1,n2;
       Scanner sc=new Scanner(System.in);
      // System.out.println("Enter a number 1 and number 2");
       System.out.println("Enter a number 1");
       n1=sc.nextInt();
       System.out.println("Enter a number 2");
       n2=sc.nextInt();
       int ans=n1+n2;
       System.out.println(ans);
	}

}
