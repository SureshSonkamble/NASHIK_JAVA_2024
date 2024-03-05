package BASIC;

import java.util.Scanner;

public class tbl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Number For Table Print");
            int n=sc.nextInt();
            for (int i=1;i<=10;i++) {
            	System.err.println(i+"*"+n+"="+i*n);
            }
	}

}
