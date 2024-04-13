package Exceptions;

public class finallyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String nm="tes";
			 System.out.println(nm.length());
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Allway exceute..");
		}
	}

}
