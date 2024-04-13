package Exceptions;

public class multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,ans;
		try {
		    ans=a/2;
			System.out.println(ans);
			int aa[]=new int[3];
			System.out.println(aa[1]);
			String nm=null;
			System.out.println(nm.length());
		}catch(ArithmeticException e) {	
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {	
			System.out.println(e);
		}
		catch(NullPointerException e) {	
			System.out.println(e);
		}
		System.out.println("Normal flow");
	}

}
