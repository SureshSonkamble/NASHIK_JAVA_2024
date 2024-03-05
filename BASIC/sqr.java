package BASIC;

import java.util.Scanner;

public class sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,sq,cb;
            
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       n=sc.nextInt();
       sq=n*n;
       cb=n*n*n;
       
       System.out.println("Square="+sq);
       System.out.println("Cube="+cb);
	}

}
