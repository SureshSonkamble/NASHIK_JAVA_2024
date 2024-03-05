package BASIC;

public class fun {
	static void test() { //fun defination
    	   System.out.println("Tomarow is holiday");
       }
	static void info(String xyz) {
		System.out.println(xyz);
	}
	static void mats(int n) {
		System.out.println("Sqr="+n*n);
		System.out.println("Qube="+n*n*n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           test();//fun call
           String m="information";
            info(m);
            
            mats(3);
	}

}
