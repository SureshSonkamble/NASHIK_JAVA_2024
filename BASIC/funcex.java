package BASIC;

public class funcex {

	static int bal() {//fun 
		return 1000;
	}
	static int sqr(int n) {
		return n*n;
	}
	static int qb(int n) {
		return n*n*n;
	}
	
static int add(int a,int b) {
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            //fun call
           System.out.println(bal());
           System.out.println(sqr(5));
           System.out.println(qb(5));
           System.out.println(add(7,8));
	}

}
