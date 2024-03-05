package OPPS;
class funovl{
	
	int add(int a,int b) {
		return a+b;
	}
	
	double add(double a,double b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class funolding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funovl f=new funovl();
		System.out.println(f.add(2, 2,2));
	}

}
