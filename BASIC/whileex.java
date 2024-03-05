package BASIC;

public class whileex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=15;
        while(n<=15) {
        	System.out.println("In while loop"+n);
        	n=n+5;
        }
        System.out.println("Normal Flow 1");
        do {
        	System.out.println("In while loop"+n);
        	n++;
        }while(n<=15);
        System.out.println("Normal Flow 2");
	}

}
