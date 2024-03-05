package OPPS;
 class prnts{
	 final  double pi=3.14;
	void pr() {
		System.out.println("This is parent method");
	}
}
class cl1 extends prnts{
	void cp1() {
		System.out.println("This is parent cld 1");
	}
}
class cl2 extends prnts{
	
}

class gc extends cl1{
	
}
public class hirachical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cl1 c1=new cl1();
		c1.pr();
		cl2 c2=new cl2();
		c2.pr();
		gc g=new gc();
		g.cp1();
		g.pr();
	}

}
