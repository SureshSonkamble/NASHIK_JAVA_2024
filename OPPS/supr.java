package OPPS;
class clr{
	String color="BLACK";
}
class dclr extends clr{
	String color="WHITE";
	void showclr() {
		System.out.println("color="+super.color);
	}
}
public class supr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dclr d=new dclr();
		d.showclr();
	}

}
