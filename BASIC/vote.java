package BASIC;
import java.util.Scanner;
public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age>=18) {
	        System.out.println("Welcome to voting");
	        System.out.println("Second line");
	        System.out.println("Third line");
        }
        else {
        	System.out.println("Not Eligible");
        	System.out.println("Second line");
        }
        	System.out.println("Nornal Flow");
	}

}
