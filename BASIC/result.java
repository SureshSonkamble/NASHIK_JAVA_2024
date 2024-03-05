package BASIC;

import java.util.Scanner;

public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int s1,s2,s3,s4,s5;
		 int ttl,per;
		 String grd="";
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Sub1 Marks");
	        s1=sc.nextInt();
	        System.out.println("Enter Sub2 Marks");
	        s2=sc.nextInt();
	        System.out.println("Enter Sub3 Marks");
	        s3=sc.nextInt();
	        System.out.println("Enter Sub4 Marks");
	        s4=sc.nextInt();
	        System.out.println("Enter Sub5 Marks");
	        s5=sc.nextInt();
	        if(s1>100 || s2>100 || s3>100 ||s4>100 ||s5>100) {
	        System.err.println("Invalid Marks Plase Entre Marks less or equals to 100");
	        }else {
	        ttl=s1+s2+s3+s4+s5;
	        per=ttl/5;
	        if(per>=75) {
	        	grd="A+";
	        }else  if(per<75&&per>=60) {
	        	grd="A";
	        }else  if(per<60&&per>=50) {
	        	grd="B";
	        }
	        else  if(per<50&&per>=40) {
	        	grd="C";
	        }else {
	        	grd="FAIL";
	        }
	        System.out.println("Total ="+ttl+"/(500)");
	        System.out.println("Percentage(%)="+per+"%");
	        System.out.println("grade="+grd);
	        }
	}

}
