package OPPS;
class sbi{
private	int bal=12000;

	void showbal(int p) {
		if(p==123) {
		System.out.println("Balance="+bal);
		}else {
			System.err.println("Invalid user");
		}
	}
}

class hack extends sbi{
	void hackpin() {
		//System.out.println("No data found due to private data");
		//System.out.println("hack "+bal);
	}
}
public class bank {
	public static void main(String abc[])
	{
	sbi s=new sbi();
	//System.out.println(s.bal);
	s.showbal(123);
	hack h=new hack();
	h.hackpin();
	h.showbal(989);
	}   
}

