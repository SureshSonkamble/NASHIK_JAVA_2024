package Exceptions;

public class multyrcth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,ans;
		try {
		    ans=a/0;
			System.out.println(ans);
			
		}catch(Exception e) {
			//System.out.println("Can't devide zero");
			System.out.println(e);
		}
		System.out.println("Normal flow 1");
		
		try {
		    
			int aa[]=new int[3];
			System.out.println(aa[4]);
	
		}catch(Exception e) {
			//System.out.println("Can't devide zero");
			System.out.println(e);
		}
		System.out.println("Normal flow 2");
		
		try {
		   
		 String nm=null;
		 System.out.println(nm.length());
		}catch(Exception e) {
			//System.out.println("Can't devide zero");
			System.out.println(e);
		}
		System.out.println("Normal flow 3");
	}

}
