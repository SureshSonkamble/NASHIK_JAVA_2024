package OPPS;
class prnt{
	void p1() {
		System.out.println("this is parent1 method");
	}
	void p2() {
		System.out.println("this is parent2 method");
	}
}

class cld extends prnt{
	void c1() {
		System.out.println("this is clid class");
	}
}

public class inheritnce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prnt obj=new prnt();
		obj.p1();
		obj.p2();
		
		cld c=new cld();
		c.c1();
		c.p1();
		c.p2();
		
	}

}
