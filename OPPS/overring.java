package OPPS;
class parent{
	void prty() {
		System.out.println("$909090909");
	}
	void marry() {
		System.out.println("xyz");
	}
}
class child extends parent{
	void marry() {
		System.out.println("abc");
	}
	
}
public class overring {
	public static void main(String[] args) {
		child c=new child();
		c.prty();
		c.marry();

	}

}
