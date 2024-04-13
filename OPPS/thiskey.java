package OPPS;
class ths{
	int aa;
	ths(int aa){
		this.aa=aa;
	}
	void val() {
		System.out.println("value of a="+aa);
	}
}
public class thiskey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ths s=new ths(22);
		s.val();

	}

}
