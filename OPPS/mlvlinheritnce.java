package OPPS;
class gp{
	void g() {
		System.out.println("Grandparent");
	}
}
class pprnt extends gp{
	void pp() {
		System.out.println("parent");
	}
}
class ccld extends pprnt{
	void cc() {
		System.out.println("Child");
	}
}
public class mlvlinheritnce {
	public static void main(String[] args) {
		gp gobj=new gp();
		gobj.g();
		pprnt p=new pprnt();
		p.pp();
		p.g();
		ccld c=new ccld();
		c.cc();
		c.g();
		c.pp();
		
		

	}

}
