package Exceptions;

public class excp {

	public static void main(String[] args) {
		System.out.println("Normal flow 1");
		int a=8,ans;
		try {
		    ans=a/2;
			System.out.println(ans);
			int aa[]=new int[3];
			System.out.println(aa[4]);
		 String nm=null;
		 System.out.println(nm.length());
		}catch(Exception e) {
			//System.out.println("Can't devide zero");
			//System.out.println(e);
		}
		
		System.out.println("Normal flow 2");
		
		System.out.println("Normal flow 3");
	}

}
