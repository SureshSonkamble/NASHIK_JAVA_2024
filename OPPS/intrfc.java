package OPPS;
interface itf1{
	void meg();
	void info();
}
class test implements itf1{

	@Override
	public void meg() {
		System.out.println("Interface message");	
	}
	@Override
	public void info() {
		System.out.println("Interface info");	
	}	
}
public class intrfc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.meg();
		t.info();
	}

}
