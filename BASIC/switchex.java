package BASIC;

import java.util.Scanner;

public class switchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day number");
        d=sc.nextInt();
        switch(d) {
        case 1:System.out.println("MON");
                break;
        case 2:System.out.println("TUE");
                break;
        case 3:System.out.println("WED");
        	    break;
        case 4:System.out.println("THUS");
        		break;
        case 5:System.out.println("FRI");
        		break;
        case 6:System.out.println("SAT");
        		break;
        case 7:System.out.println("SUN");
        		break;
        default:System.out.println("Invalid Choice Please Enter day number between 1 to 7 only"); 		
        }
        
	}

}
