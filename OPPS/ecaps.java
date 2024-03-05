package OPPS;
class encptest{
	int data=22;
  private  int pin=989789;
  
  void showpin() {  
	  System.out.println("pin="+pin);
  }
}
class hacker extends encptest{
	void hackpin() {
		System.out.println("No data found due to private data");
		//System.out.println(pin);
	}
}
public class ecaps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encptest e=new encptest();
		//System.out.println(e.pin);
		e.showpin();
		hacker h=new hacker();
		h.hackpin();
		h.showpin();
	}

}
