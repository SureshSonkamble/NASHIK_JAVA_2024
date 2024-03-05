package OPPS;

import java.util.Scanner;

//program to print full name using multilevel inheritance
 class gpp{
	String surname="Sonkamble";
	//static String surname;
//	 void input() {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter your suranme");
//	surname=sc.next();
//	}
	
	
}
class ppp extends gpp{
	
	String pname="Daulat";
}
class ccc extends ppp{
	String name="Suresh";
	 
	void fullname() {
		System.err.println(name+" "+pname+" "+surname);
	}
}
public class mlvl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ccc c=new ccc();
		c.fullname();
		
	}

}
