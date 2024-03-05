package BASIC;

import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		//test obj=new test();//object 
		//obj.msg();
		String name;
		float per;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();//for taking sting input
		System.out.println("Enter your age");
		age=sc.nextInt();//for taking int input
		System.out.println("Enter your per%");
		per=sc.nextFloat();//for taking float input
		System.out.println("Welcome="+name);
		System.out.println("Age="+age);
		System.out.println("%="+per);
		
		
	}

}
