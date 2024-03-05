package BASIC;

import java.util.Scanner;

public class arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,d,qsum=0,temp;
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a number");
	     num=sc.nextInt();
	     temp=num;
	     System.out.println("Original number="+temp);
	     while(num>0) {
	    	 d=num%10;
	    	 qsum=qsum+(d*d*d);
	    	 num=num/10;
	     } 
	     if(temp==qsum) {
	     System.out.println("Armsstring number");
	     }else {
	    	 System.out.println("Not Armsstring number");
	     }
	}
	}

