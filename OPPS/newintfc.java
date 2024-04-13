package OPPS;
interface newft{
	
	default void nw() {
		System.out.println("default interface method");
	}
}
class newcl implements newft{
	public void nw() {
			System.out.println("overrride interface method");
		}
}
public class newintfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newcl n=new newcl();
		n.nw();
	}

}
