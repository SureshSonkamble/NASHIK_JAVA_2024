package OPPS;
class stk{
	static {
		System.out.println("Static block called 2");
	}
	static void tst() {
		System.out.println("This is static method");
	}
	static {
		System.out.println("Static block called 1");
	}
}
public class stkcls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stk.tst();
		//stk s=new stk();
		
	}

}
