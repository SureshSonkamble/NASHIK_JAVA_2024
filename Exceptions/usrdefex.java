package Exceptions;

public class usrdefex {

	static void ageval(int age) {
		try {
		if(age<18) {
			throw new ArithmeticException("Invalid Age");
		}else {
			System.out.println("Welcome to voteing..");
		}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ageval(12);
	}

}
