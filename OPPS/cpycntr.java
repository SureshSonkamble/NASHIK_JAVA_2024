package OPPS;
class cpcntr{
	int id;
	String name;
	cpcntr(int i,String nm){
		id=i;
		name=nm;
	}
	cpcntr(cpcntr c){
		id=c.id;
	    name=c.name;
	}
	void disp() {
		System.out.println(id+"   "+name);
	}
}
public class cpycntr {
	public static void main(String[] args) {
		cpcntr c1=new cpcntr(2,"ramesh");
		c1.disp();
		cpcntr c2=new cpcntr(c1);
		c2.disp();
	}

}
